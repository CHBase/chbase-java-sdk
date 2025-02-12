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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     Defines a value which has been coded in a Microsoft Health

 *                     Vocabulary.

 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                   Microsoft HealthVault provides a set of vocabularies

 *                   containing common health and fitness terms and codes.

 *                   Vocabularies are identified by their family, type, and

 *                   version and contain values which identify an entry in that

 *                   vocabulary by code.&lt;br/&gt;&lt;br/&gt;

 *                     For example, a prescription

 *                     vocabulary may be identified by the family 'NCPDP', type

 *                     'SCRIPT', and version '1.0' and contain a code of 10 which

 *                     identifies a 'tablet' form of medication.&lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for coded-value complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="coded-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coded-value", propOrder = { "value", "family", "type", "version" })
public class CodedValue {

	@XmlElement(required = true)
	protected String value;
	protected String family;
	@XmlElement(required = true)
	protected String type;
	protected String version;

	/**
	 * Instantiates a new coded value.
	 */
	public CodedValue() {
	}

	/**
	 * Instantiates a new coded value.
	 * 
	 * @param value
	 *            the value
	 * @param family
	 *            the family
	 * @param type
	 *            the type
	 * @param version
	 *            the version
	 */
	public CodedValue(String value, String family, String type, String version) {
		this.value = value;
		this.family = family;
		this.type = type;
		this.version = version;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the family property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * Sets the value of the family property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFamily(String value) {
		this.family = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

}
