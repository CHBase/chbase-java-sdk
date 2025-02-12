package com.chbase.jaxb.things;

import java.io.StringReader;
import java.math.BigInteger;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.Test;

import com.chbase.jaxb.TestHelpers;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getthings3.request.GetThings3Request;
import com.chbase.methods.jaxb.getthings3.request.ThingFilterSpec;
import com.chbase.methods.jaxb.getthings3.request.ThingFormatSpec2;
import com.chbase.methods.jaxb.getthings3.request.ThingRequestGroup2;
import com.chbase.methods.jaxb.getthings3.request.ThingSectionSpec2;
import com.chbase.methods.jaxb.getthings3.response.GetThings3Response;
import com.chbase.methods.jaxb.putthings2.request.PutThings2Request;
import com.chbase.methods.jaxb.putthings2.response.PutThings2Response;
import com.chbase.oxm.jaxb.JaxbContextFactory;
import com.chbase.thing.oxm.jaxb.allergy.Allergy;
import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.CodedValue;
import com.chbase.thing.oxm.jaxb.base.Name;
import com.chbase.thing.oxm.jaxb.base.Person;
import com.chbase.thing.oxm.jaxb.dates.ApproxDate;
import com.chbase.thing.oxm.jaxb.dates.ApproxDateTime;
import com.chbase.thing.oxm.jaxb.dates.StructuredApproxDate;
import com.chbase.thing.oxm.jaxb.thing.Thing2;
import com.chbase.thing.oxm.jaxb.thing.TypeManager;

public class AllergyTest {

	private SimpleRequestTemplate requestTemplate;

	@Before
	public void before() {
		requestTemplate = TestHelpers.GetRequestTemplate();
	}

	@Test
	public void testBasicPutGet() throws Exception {
		Thing2 thing = new Thing2();
		thing.setData(createValidAllergy());

		PutThings2Request request = new PutThings2Request();
		request.getThing().add(thing);

		PutThings2Response response = (PutThings2Response) requestTemplate.makeRequest(request);

		ThingRequestGroup2 group = new ThingRequestGroup2();

		ThingFilterSpec filter = new ThingFilterSpec();
		filter.getTypeId().add(TypeManager.getTypeForClass(Allergy.class));
		group.getFilter().add(filter);

		ThingFormatSpec2 format = new ThingFormatSpec2();
		format.getSection().add(ThingSectionSpec2.CORE);
		format.getXml().add("");
		group.setFormat(format);
		group.setMax(BigInteger.valueOf(30));

		GetThings3Request info = new GetThings3Request();
		info.getGroup().add(group);

		GetThings3Response thingsResponse = (GetThings3Response) requestTemplate.makeRequest(info);

		Allergy result = (Allergy) thingsResponse.getGroup().get(0).getThing().get(0).getData();
	}

	private Allergy createValidAllergy() {
		Allergy allergy = new Allergy();
		allergy.setName(new CodableValue("Dairy", new CodedValue("value", "family", "type", "version")));

		ApproxDate dt = new ApproxDate();
		dt.setY(1960);
		StructuredApproxDate sad = new StructuredApproxDate();
		sad.setDate(dt);
		ApproxDateTime firstObs = new ApproxDateTime();
		firstObs.setStructured(sad);
		allergy.setFirstObserved(firstObs);

		allergy.setAllergenCode(new CodableValue("my-code"));

		Name name = new Name();
		name.setFull("Dr. Who");
		Person person = new Person();
		person.setName(name);
		allergy.setTreatmentProvider(person);

		return allergy;
	}

	@Test
	public void testUnknownElements() throws Exception {
		String xml = "<allergy><pleaseIgnoreMe/><name><text>Dairy</text><code><value>value</value><family>family</family><type>type</type><version>version</version></code></name></allergy>";
		JAXBContext ctx = JaxbContextFactory.getContext(Allergy.class.getPackage().getName());
		Unmarshaller um = ctx.createUnmarshaller();
		um.unmarshal(new StringReader(xml));
	}
}
