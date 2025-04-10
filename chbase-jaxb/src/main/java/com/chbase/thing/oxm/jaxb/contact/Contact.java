//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:32 AM PST 
//

package com.chbase.thing.oxm.jaxb.contact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:contact="urn:com.microsoft.wc.thing.contact" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                       This is the contact information for the person owning
 *                       a health record in Microsoft HealthVault.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:contact="urn:com.microsoft.wc.thing.contact" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This data should not be confused with the 'person'
 *                         type which is contact information for an emergency
 *                         contact or someone else related to the health record.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{urn:com.microsoft.wc.thing.types}contact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contact" })
@XmlRootElement(name = "contact")
public class Contact {
	public static String typeId = "162dd12d-9859-4a66-b75f-96760d67072b";

	@XmlElement(required = true)
	protected com.chbase.thing.oxm.jaxb.base.Contact contact;

	/**
	 * Gets the value of the contact property.
	 * 
	 * @return possible object is {@link com.chbase.thing.oxm.jaxb.base.Contact
	 *         }
	 * 
	 */
	public com.chbase.thing.oxm.jaxb.base.Contact getContact() {
		return contact;
	}

	/**
	 * Sets the value of the contact property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link com.chbase.thing.oxm.jaxb.base.Contact }
	 * 
	 */
	public void setContact(com.chbase.thing.oxm.jaxb.base.Contact value) {
		this.contact = value;
	}

}
