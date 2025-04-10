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
import com.chbase.thing.oxm.jaxb.base.DisplayValue;
import com.chbase.thing.oxm.jaxb.base.LengthValue;
import com.chbase.thing.oxm.jaxb.base.WeightValue;
import com.chbase.thing.oxm.jaxb.bmi.Bmi;
import com.chbase.thing.oxm.jaxb.bmi.BmiValue;
import com.chbase.thing.oxm.jaxb.dates.DateTime;
import com.chbase.thing.oxm.jaxb.thing.Thing2;
import com.chbase.thing.oxm.jaxb.thing.TypeManager;

public class BmiTest {

	private SimpleRequestTemplate requestTemplate;

	@Before
	public void before() {
		requestTemplate = TestHelpers.GetRequestTemplate();
	}

	@Test
	public void testBasicPutGet() throws Exception {
		Thing2 thing = new Thing2();
		thing.setData(createBmi());

		PutThings2Request request = new PutThings2Request();
		request.getThing().add(thing);

		PutThings2Response response = (PutThings2Response) requestTemplate.makeRequest(request);

		ThingRequestGroup2 group = new ThingRequestGroup2();

		ThingFilterSpec filter = new ThingFilterSpec();
		filter.getTypeId().add(TypeManager.getTypeForClass(Bmi.class));
		group.getFilter().add(filter);

		ThingFormatSpec2 format = new ThingFormatSpec2();
		format.getSection().add(ThingSectionSpec2.CORE);
		format.getXml().add("");
		group.setFormat(format);
		group.setMax(BigInteger.valueOf(30));

		GetThings3Request info = new GetThings3Request();
		info.getGroup().add(group);

		GetThings3Response thingsResponse = (GetThings3Response) requestTemplate.makeRequest(info);

		Bmi result = (Bmi) thingsResponse.getGroup().get(0).getThing().get(0).getData();
	}

	private Bmi createBmi() {
		Bmi bmi = new Bmi();
		bmi.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
		
		LengthValue height = new LengthValue();
		height.setM(1.83);
		DisplayValue heightDisplayValue = new DisplayValue();
		heightDisplayValue.setText("1.83 meters");
		heightDisplayValue.setUnits("m");
		height.setDisplay(heightDisplayValue);
		bmi.setHeight(height);

		WeightValue weight = new WeightValue();
		weight.setKg(75);
		DisplayValue weightDisplayValue = new DisplayValue();
		weightDisplayValue.setText("75 kgs");
		weightDisplayValue.setUnits("kg");
		weight.setDisplay(weightDisplayValue);
		bmi.setWeight(weight);

		BmiValue bmiValue = new BmiValue();
		bmiValue.setKgm2(22.4);
		DisplayValue bmiDisplayValue = new DisplayValue();
		bmiDisplayValue.setText("22.4 kg/m²");
		bmiDisplayValue.setUnits("kg/m²");
		bmiValue.setDisplay(bmiDisplayValue);
		bmi.setValue(bmiValue);


		return bmi;
	}
}
