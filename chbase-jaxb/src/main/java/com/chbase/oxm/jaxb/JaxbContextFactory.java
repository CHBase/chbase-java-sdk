package com.chbase.oxm.jaxb;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

public class JaxbContextFactory {

    // Cache per package (legacy)
    private static final ConcurrentHashMap<String, JAXBContext> packageContextMap = new ConcurrentHashMap<>();

    // Cache per class (recommended)
    private static final ConcurrentHashMap<Class<?>, JAXBContext> classContextMap = new ConcurrentHashMap<>();

    // private static final Map<String, Object> MOXY_PROPS =
    //         Collections.singletonMap(
    //                 JAXBContext.JAXB_CONTEXT_FACTORY, "org.eclipse.persistence.jaxb.JAXBContextFactory");

    /**
     * Legacy method: Cache JAXBContext by package name (slow due to scanning)
     */
    public static JAXBContext getContext(String packageName) throws JAXBException {
        return packageContextMap.computeIfAbsent(packageName, key -> {
            try {
                // return JAXBContext.newInstance(key, JaxbContextFactory.class.getClassLoader(), MOXY_PROPS);
                return JAXBContext.newInstance(key, JaxbContextFactory.class.getClassLoader());
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        });
    }

    /**
     * Recommended method: Cache JAXBContext by Class (much faster, no scanning)
     */
    public static JAXBContext getContext(Class<?> clazz) throws JAXBException {
        return classContextMap.computeIfAbsent(clazz, key -> {
            try {
                // return JAXBContext.newInstance(new Class[] {key}, MOXY_PROPS);
                return JAXBContext.newInstance(new Class[] {key});
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
