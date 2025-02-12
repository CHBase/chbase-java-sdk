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

 *                     Defines a person's name.

 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for name complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "name", propOrder = { "full", "title", "first", "middle", "last", "suffix" })
public class Name {

	@XmlElement(required = true)
	protected String full;
	protected CodableValue title;
	protected String first;
	protected String middle;
	protected String last;
	protected CodableValue suffix;

	/**
	 * Gets the value of the full property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFull() {
		return full;
	}

	/**
	 * Sets the value of the full property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFull(String value) {
		this.full = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setTitle(CodableValue value) {
		this.title = value;
	}

	/**
	 * Gets the value of the first property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * Sets the value of the first property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirst(String value) {
		this.first = value;
	}

	/**
	 * Gets the value of the middle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddle() {
		return middle;
	}

	/**
	 * Sets the value of the middle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddle(String value) {
		this.middle = value;
	}

	/**
	 * Gets the value of the last property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLast() {
		return last;
	}

	/**
	 * Sets the value of the last property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLast(String value) {
		this.last = value;
	}

	/**
	 * Gets the value of the suffix property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getSuffix() {
		return suffix;
	}

	/**
	 * Sets the value of the suffix property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setSuffix(CodableValue value) {
		this.suffix = value;
	}

}
