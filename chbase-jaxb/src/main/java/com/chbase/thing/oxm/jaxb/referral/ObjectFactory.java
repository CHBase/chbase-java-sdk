//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:17 AM PST 
//

package com.chbase.thing.oxm.jaxb.referral;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.chbase.thing.oxm.jaxb.referral.Referral;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.microsoft.hsg.thing.oxm.jaxb.referral
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Referral_QNAME = new QName("urn:com.microsoft.wc.thing.referral", "referral");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.microsoft.hsg.thing.oxm.jaxb.referral
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Referral }
	 * {@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:com.microsoft.wc.thing.referral", name = "referral")
	public JAXBElement<Referral> createReferral(Referral value) {
		return new JAXBElement<Referral>(_Referral_QNAME, Referral.class, null, value);
	}

	/**
	 * Create an instance of {@link Referral }
	 * 
	 */
	public Referral createReferral() {
		return new Referral();
	}

}