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

import com.chbase.thing.oxm.jaxb.dates.ApproxDate;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                 Defines a single health or medical issue/problem.

 *             &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                 CCR qualifiers and other notes should go in the

 *                 common/note section of the thing.

 *             &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for condition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="condition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="onset-date" type="{urn:com.microsoft.wc.dates}approx-date" minOccurs="0"/>
 *         &lt;element name="resolution-date" type="{urn:com.microsoft.wc.dates}approx-date" minOccurs="0"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurrence" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="severity" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condition", propOrder = { "name", "onsetDate", "resolutionDate", "resolution", "occurrence",
		"severity" })
public class Condition {

	@XmlElement(required = true)
	protected CodableValue name;
	@XmlElement(name = "onset-date")
	protected ApproxDate onsetDate;
	@XmlElement(name = "resolution-date")
	protected ApproxDate resolutionDate;
	protected String resolution;
	protected CodableValue occurrence;
	protected CodableValue severity;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setName(CodableValue value) {
		this.name = value;
	}

	/**
	 * Gets the value of the onsetDate property.
	 * 
	 * @return possible object is {@link ApproxDate }
	 * 
	 */
	public ApproxDate getOnsetDate() {
		return onsetDate;
	}

	/**
	 * Sets the value of the onsetDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDate }
	 * 
	 */
	public void setOnsetDate(ApproxDate value) {
		this.onsetDate = value;
	}

	/**
	 * Gets the value of the resolutionDate property.
	 * 
	 * @return possible object is {@link ApproxDate }
	 * 
	 */
	public ApproxDate getResolutionDate() {
		return resolutionDate;
	}

	/**
	 * Sets the value of the resolutionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDate }
	 * 
	 */
	public void setResolutionDate(ApproxDate value) {
		this.resolutionDate = value;
	}

	/**
	 * Gets the value of the resolution property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * Sets the value of the resolution property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResolution(String value) {
		this.resolution = value;
	}

	/**
	 * Gets the value of the occurrence property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getOccurrence() {
		return occurrence;
	}

	/**
	 * Sets the value of the occurrence property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setOccurrence(CodableValue value) {
		this.occurrence = value;
	}

	/**
	 * Gets the value of the severity property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getSeverity() {
		return severity;
	}

	/**
	 * Sets the value of the severity property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setSeverity(CodableValue value) {
		this.severity = value;
	}

}
