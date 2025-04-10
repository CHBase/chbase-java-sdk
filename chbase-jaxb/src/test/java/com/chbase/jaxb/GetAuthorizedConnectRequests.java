package com.chbase.jaxb;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.ConnectionFactory;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getauthorizedconnectrequests.request.GetAuthorizedConnectRequestsRequest;
import com.chbase.methods.jaxb.getauthorizedconnectrequests.response.GetAuthorizedConnectRequestsResponse;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetAuthorizedConnectRequests {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetAuthorizedConnectRequests() {
	}

	@Test
	public void TestGetAuthorizedConnectRequests() throws Exception {
		SimpleRequestTemplate requestTemplate = new SimpleRequestTemplate(ConnectionFactory.getConnection());

		GetAuthorizedConnectRequestsRequest request = new GetAuthorizedConnectRequestsRequest();
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.YEAR, -1);
		request.setAuthorizedConnectRequestsSince(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

		GetAuthorizedConnectRequestsResponse response = (GetAuthorizedConnectRequestsResponse) requestTemplate
				.makeRequest(request);

		Assert.assertNotNull(response);
	}
}
