package com.chbase.jaxb.things;

import java.math.BigInteger;
import java.util.Calendar;

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
import com.chbase.thing.oxm.jaxb.advancedirectivev2.AdvanceDirectiveContactType;
import com.chbase.thing.oxm.jaxb.advancedirectivev2.AdvanceDirectiveV2;
import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Contact;
import com.chbase.thing.oxm.jaxb.base.Name;
import com.chbase.thing.oxm.jaxb.dates.DateTime;
import com.chbase.thing.oxm.jaxb.thing.Thing2;
import com.chbase.thing.oxm.jaxb.thing.TypeManager;

public class AdvanceDirectiveV2Test {

	private SimpleRequestTemplate requestTemplate;

	@Before
	public void before() {
		requestTemplate = TestHelpers.GetRequestTemplate();
	}

	@Test
	public void testBasicPutGet() throws Exception {
		Thing2 thing = new Thing2();
		thing.setData(createValidAdvanceDirectiveV2());

		PutThings2Request request = new PutThings2Request();
		request.getThing().add(thing);

		PutThings2Response response = (PutThings2Response) requestTemplate.makeRequest(request);

		ThingRequestGroup2 group = new ThingRequestGroup2();

		ThingFilterSpec filter = new ThingFilterSpec();
		filter.getTypeId().add(TypeManager.getTypeForClass(AdvanceDirectiveV2.class));
		group.getFilter().add(filter);

		ThingFormatSpec2 format = new ThingFormatSpec2();
		format.getSection().add(ThingSectionSpec2.CORE);
		format.getXml().add("");
		group.setFormat(format);
		group.setMax(BigInteger.valueOf(30));

		GetThings3Request info = new GetThings3Request();
		info.getGroup().add(group);

		GetThings3Response thingsResponse = (GetThings3Response) requestTemplate.makeRequest(info);

		AdvanceDirectiveV2 result = (AdvanceDirectiveV2) thingsResponse.getGroup().get(0).getThing().get(0).getData();
	}

	private AdvanceDirectiveContactType createValidContactInfo() {
		AdvanceDirectiveContactType contactInfo = new AdvanceDirectiveContactType();
		contactInfo.setName(createValidName());
		contactInfo.setId("12345");
		contactInfo.setContactInfo(createValidContact());

		contactInfo.setRelationship(new CodableValue("Family"));
		contactInfo.setIsPrimary(true);
		return contactInfo;
	}

	private Name createValidName() {
		Name name = new Name();
		name.setFull("John Doe");
		return name;
	}

	private Contact createValidContact() {
		return new Contact();
	}

	private AdvanceDirectiveV2 createValidAdvanceDirectiveV2() {
		AdvanceDirectiveV2 directive = new AdvanceDirectiveV2();
		directive.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
		directive.setName("Test Advance Directive");

		directive.getContact().add(createValidContactInfo());
		return directive;
	}
}
