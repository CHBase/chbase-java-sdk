package com.chbase.jaxb;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.ApplicationConfig;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getauthorizedrecords.request.GetAuthorizedRecordsRequest;
import com.chbase.methods.jaxb.getauthorizedrecords.response.GetAuthorizedRecordsResponse;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetAuthorizedRecordsTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetAuthorizedRecordsTest() {
	}

	@Test
	public void TestGetAuthorizedRecords() throws Exception {
		SimpleRequestTemplate requestTemplate = TestHelpers.GetRequestTemplate();

		GetAuthorizedRecordsRequest req = new GetAuthorizedRecordsRequest();
		req.getId().add(ApplicationConfig.Test_PersonID);
		GetAuthorizedRecordsResponse resp = (GetAuthorizedRecordsResponse) requestTemplate.makeRequest(req);
		Assert.assertNotNull(resp);
	}
}
