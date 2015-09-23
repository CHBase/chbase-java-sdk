//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.chbase.methods.jaxb.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.types.CardSpaceCred;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A simple cardspace credential.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A simple credential does not provide the necessary information
 *                     to establish an authenticated session.  Rather, it provides
 *                     only enough information to authenticate a user.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for SimpleCardSpaceCredential complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCardSpaceCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simple-cardspace" type="{urn:com.microsoft.wc.types}CardSpaceCred"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCardSpaceCredential", propOrder = { "simpleCardspace" })
public class SimpleCardSpaceCredential {

	@XmlElement(name = "simple-cardspace", required = true)
	protected CardSpaceCred simpleCardspace;

	/**
	 * Gets the value of the simpleCardspace property.
	 * 
	 * @return possible object is {@link CardSpaceCred }
	 * 
	 */
	public CardSpaceCred getSimpleCardspace() {
		return simpleCardspace;
	}

	/**
	 * Sets the value of the simpleCardspace property.
	 * 
	 * @param value
	 *            allowed object is {@link CardSpaceCred }
	 * 
	 */
	public void setSimpleCardspace(CardSpaceCred value) {
		this.simpleCardspace = value;
	}

}