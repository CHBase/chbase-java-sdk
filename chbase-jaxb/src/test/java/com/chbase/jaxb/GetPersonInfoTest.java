package com.chbase.jaxb;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getpersoninfo.request.GetPersonInfoRequest;
import com.chbase.methods.jaxb.getpersoninfo.response.GetPersonInfoResponse;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetPersonInfoTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetPersonInfoTest() {
	}

	@Test
	public void GetPersonInfo() throws Exception {
		SimpleRequestTemplate requestTemplate = TestHelpers.GetRequestTemplate();

		GetPersonInfoResponse response = (GetPersonInfoResponse) requestTemplate
				.makeRequest(new GetPersonInfoRequest());

		Assert.assertNotNull(response);
	}
}
