//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.dates;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.microsoft.hsg.thing.oxm.jaxb.dates
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

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.microsoft.hsg.thing.oxm.jaxb.dates
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link StructuredApproxDate }
	 * 
	 */
	public StructuredApproxDate createStructuredApproxDate() {
		return new StructuredApproxDate();
	}

	/**
	 * Create an instance of {@link Time }
	 * 
	 */
	public Time createTime() {
		return new Time();
	}

	/**
	 * Create an instance of {@link ApproxDate }
	 * 
	 */
	public ApproxDate createApproxDate() {
		return new ApproxDate();
	}

	/**
	 * Create an instance of {@link DateTime }
	 * 
	 */
	public DateTime createDateTime() {
		return new DateTime();
	}

	/**
	 * Create an instance of {@link Date }
	 * 
	 */
	public Date createDate() {
		return new Date();
	}

	/**
	 * Create an instance of {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime createApproxDateTime() {
		return new ApproxDateTime();
	}

}
