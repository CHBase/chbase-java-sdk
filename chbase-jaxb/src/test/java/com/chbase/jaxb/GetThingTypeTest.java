package com.chbase.jaxb;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.ConnectionFactory;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getthingtype.request.GetThingTypeRequest;
import com.chbase.methods.jaxb.getthingtype.request.ThingTypeSectionSpec;
import com.chbase.methods.jaxb.getthingtype.response.GetThingTypeResponse;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetThingTypeTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetThingTypeTest() {
	}

	@Test
	public void GetThingType() throws Exception {
		SimpleRequestTemplate requestTemplate = new SimpleRequestTemplate(ConnectionFactory.getConnection());

		GetThingTypeRequest requestInfo = new GetThingTypeRequest();
		requestInfo.getId().add("5C5F1223-F63C-4464-870C-3E36BA471DEF");
		requestInfo.getSection().add(ThingTypeSectionSpec.XSD);
		requestInfo.getSection().add(ThingTypeSectionSpec.VERSIONS);
		requestInfo.getSection().add(ThingTypeSectionSpec.TRANSFORMS);

		GetThingTypeResponse response = (GetThingTypeResponse) requestTemplate.makeRequest(requestInfo);

		Assert.assertNotNull(response);
	}
}
