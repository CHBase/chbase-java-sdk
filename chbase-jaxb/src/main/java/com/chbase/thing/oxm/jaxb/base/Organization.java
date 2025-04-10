//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;An organization entity.&lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     An entity such as a hospital, a pharmacy, or a doctor's office.

 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Organization complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact" type="{urn:com.microsoft.wc.thing.types}contact" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = { "name", "contact", "type", "website" })
public class Organization {

	@XmlElement(required = true)
	protected String name;
	protected Contact contact;
	protected CodableValue type;
	protected String website;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the contact property.
	 * 
	 * @return possible object is {@link Contact }
	 * 
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * Sets the value of the contact property.
	 * 
	 * @param value
	 *            allowed object is {@link Contact }
	 * 
	 */
	public void setContact(Contact value) {
		this.contact = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setType(CodableValue value) {
		this.type = value;
	}

	/**
	 * Gets the value of the website property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Sets the value of the website property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWebsite(String value) {
		this.website = value;
	}

}
