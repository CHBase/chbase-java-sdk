package com.chbase.methods.jaxb;

import java.io.InputStream;
import java.io.StringWriter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.chbase.Connection;
import com.chbase.HVException;
import com.chbase.Request;
import com.chbase.oxm.jaxb.JaxbContextFactory;
import com.chbase.request.RequestMarshaller;

public class SimpleRequestTemplate extends com.chbase.request.SimpleRequestTemplate {

	public SimpleRequestTemplate(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	public SimpleRequestTemplate(Connection connection, String personId, String recordId) {
		super(connection, personId, recordId);
	}

	public Object makeRequest(Object requestInfo) throws Exception {
		return makeRequest(new Request(), requestInfo);
	}

	public Object makeRequest(Request request, Object requestInfo) throws Exception {
		if (!requestInfo.getClass().isAnnotationPresent(JaxbRequest.class)) {
			// TODO: use subclass
			throw new HVException("Invalid request.  Expecting jaxb request");
		}

		final JaxbRequest jaxbRequest = requestInfo.getClass().getAnnotation(JaxbRequest.class);

		String requestPackage = requestInfo.getClass().getPackage().getName();
		final String responsePackage = requestPackage.substring(0, requestPackage.lastIndexOf(".")) + ".response";

		JAXBContext jc = JaxbContextFactory.getContext(requestPackage);

		Marshaller m = jc.createMarshaller();

		StringWriter info = new StringWriter();
		m.setProperty("jaxb.fragment", true);
		m.marshal(requestInfo, info);

		request.setMethodName(jaxbRequest.methodName());
		request.setMethodVersion(jaxbRequest.methodVersion());
		request.setInfo(info.toString());

		return makeRequest(request, new RequestMarshaller() {
			public Object marshal(InputStream istream) throws Exception {
				InputSource isource = new InputSource(istream);

				// TODO: use something other than XPath...ugh
				XPath xpath = XPathFactory.newInstance().newXPath();
				xpath.setNamespaceContext(new NamespaceResolver("wc", jaxbRequest.responseNS()));
				String exp = "/response/wc:info";
				Node info = (Node) xpath.evaluate(exp, isource, XPathConstants.NODE);

				Object value = null;
				if (info != null) {
					// TODO: use classes instead of package?
					JAXBContext jc = JaxbContextFactory.getContext(responsePackage);
					Unmarshaller u = jc.createUnmarshaller();
					value = u.unmarshal(info);
				}
				return value;
			}
		});
	}
}
