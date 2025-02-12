package com.chbase.jaxb;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.ConnectionFactory;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getauthorizedpeople.request.GetAuthorizedPeopleParameters;
import com.chbase.methods.jaxb.getauthorizedpeople.request.GetAuthorizedPeopleRequest;
import com.chbase.methods.jaxb.getauthorizedpeople.response.GetAuthorizedPeopleResponseWrapper;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetAuthorizedPeopleTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetAuthorizedPeopleTest() {
	}

	@Test
	public void GetAuthorizedPeople() throws Exception {
		SimpleRequestTemplate requestTemplate = new SimpleRequestTemplate(ConnectionFactory.getConnection());

		GetAuthorizedPeopleRequest request = new GetAuthorizedPeopleRequest();
		GetAuthorizedPeopleParameters params = new GetAuthorizedPeopleParameters();
		request.setParameters(params);

		GetAuthorizedPeopleResponseWrapper response = (GetAuthorizedPeopleResponseWrapper) requestTemplate
				.makeRequest(request);

		Assert.assertNotNull(response);
	}
}
