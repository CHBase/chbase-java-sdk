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
import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.dates.DateTime;
import com.chbase.thing.oxm.jaxb.sleepsessionv2.Awakening;
import com.chbase.thing.oxm.jaxb.sleepsessionv2.Level;
import com.chbase.thing.oxm.jaxb.sleepsessionv2.SleepSessionV2;
import com.chbase.thing.oxm.jaxb.thing.Thing2;
import com.chbase.thing.oxm.jaxb.thing.TypeManager;

public class SleepSessionV2Test {

	private SimpleRequestTemplate requestTemplate;

	@Before
	public void before() {
		requestTemplate = TestHelpers.GetRequestTemplate();
	}

	@Test
	public void testBasicPutGet() throws Exception {
		Thing2 thing = new Thing2();
		thing.setData(createSleepSessionV2());

		PutThings2Request request = new PutThings2Request();
		request.getThing().add(thing);

		PutThings2Response response = (PutThings2Response) requestTemplate.makeRequest(request);

		ThingRequestGroup2 group = new ThingRequestGroup2();

		ThingFilterSpec filter = new ThingFilterSpec();
		filter.getTypeId().add(TypeManager.getTypeForClass(SleepSessionV2.class));
		group.getFilter().add(filter);

		ThingFormatSpec2 format = new ThingFormatSpec2();
		format.getSection().add(ThingSectionSpec2.CORE);
		format.getXml().add("");
		group.setFormat(format);
		group.setMax(BigInteger.valueOf(30));

		GetThings3Request info = new GetThings3Request();
		info.getGroup().add(group);

		GetThings3Response thingsResponse = (GetThings3Response) requestTemplate.makeRequest(info);

		SleepSessionV2 result = (SleepSessionV2) thingsResponse.getGroup().get(0).getThing().get(0).getData();
	}

	private SleepSessionV2 createSleepSessionV2() {
		SleepSessionV2 sleepSession = new SleepSessionV2();
		sleepSession.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
		sleepSession.setBedTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
		sleepSession.setWakeTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
		sleepSession.setSleepMinutes(10);
		sleepSession.setSettlingMinutes(10);

		Awakening awakening = new Awakening();
		awakening.setMinutes(10);
		awakening.setWhen(DateTime.fromCalendar(Calendar.getInstance()).getTime());
		sleepSession.getAwakening().add(awakening);

		sleepSession.setMedications(new CodableValue("paracetamol"));
		sleepSession.setWakeState(2);
		sleepSession.setLightSleepDuration(2);
		sleepSession.setDeepSleepDuration(2);
		sleepSession.setRemSleepDuration(2);
		sleepSession.setAwakeDuration(2);
		sleepSession.setWakeupDuration(2);

		Level level = new Level();
		level.setStartTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
		level.setMinutes(5);
		level.setState(new CodableValue("good"));
		sleepSession.getLevel().add(level);

		sleepSession.setTimesWokenUp(2);
		sleepSession.setAverageRestingHr(2);
		sleepSession.setCaloriesBurned(2);
		return sleepSession;
	}
}
