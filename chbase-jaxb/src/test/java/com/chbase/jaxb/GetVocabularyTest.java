package com.chbase.jaxb;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.ConnectionFactory;
import com.chbase.methods.jaxb.SimpleRequestTemplate;
import com.chbase.methods.jaxb.getvocabulary.request.GetVocabularyRequest;
import com.chbase.methods.jaxb.getvocabulary.request.VocabularyParameters;
import com.chbase.methods.jaxb.getvocabulary.response.GetVocabularyResponse;
import com.chbase.methods.jaxb.vocab.VocabularyKey;

import junit.framework.Assert;

@RunWith(JMock.class)
public class GetVocabularyTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public GetVocabularyTest() {
	}

	@Test
	@Ignore
	public void GetVocabulary() throws Exception {
		SimpleRequestTemplate requestTemplate = new SimpleRequestTemplate(ConnectionFactory.getConnection());
		// requestTemplate.setPersonId("75ac2c6c-c90e-4f7e-b74d-bb7e81787beb");
		// requestTemplate.setRecordId("8c390004-3d41-4f5c-8f24-4841651579d6");

		VocabularyKey key = new VocabularyKey();
		key.setName("time-zones");

		VocabularyParameters params = new VocabularyParameters();
		params.getVocabularyKey().add(key);
		params.setFixedCulture(false);

		GetVocabularyRequest request = new GetVocabularyRequest();
		request.setVocabularyParameters(params);

		GetVocabularyResponse response = (GetVocabularyResponse) requestTemplate.makeRequest(request);

		Assert.assertNotNull(response);
	}
}
