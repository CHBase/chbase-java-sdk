package com.chbase.oxm.jaxb;

import java.util.HashMap;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

public class JaxbContextFactory {

	private static HashMap<String, JAXBContext> contextMap = new HashMap<String, JAXBContext>();

	public static synchronized JAXBContext getContext(String path) throws JAXBException {
		JAXBContext context = contextMap.get(path);

		if (context == null) {
			context = JAXBContext.newInstance(path, JaxbContextFactory.class.getClassLoader());
			contextMap.put(path, context);
		}

		return context;
	}
}
