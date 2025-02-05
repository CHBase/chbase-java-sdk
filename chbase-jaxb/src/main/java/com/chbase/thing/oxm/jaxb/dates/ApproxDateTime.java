//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.dates;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for approx-date-time complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="approx-date-time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="structured" type="{urn:com.microsoft.wc.dates}StructuredApproxDate"/>
 *         &lt;element name="descriptive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approx-date-time", propOrder = { "structured", "descriptive" })
public class ApproxDateTime {

	protected StructuredApproxDate structured;
	protected String descriptive;

	/**
	 * Instantiates a new approx date time.
	 */
	public ApproxDateTime() {
	}

	/**
	 * Instantiates a new approx date time.
	 * 
	 * @param descriptive
	 *            the descriptive
	 */
	public ApproxDateTime(String descriptive) {
		this.descriptive = descriptive;
	}

	/**
	 * Instantiates a new approx date time.
	 * 
	 * @param structured
	 *            the structured
	 * @param descriptive
	 *            the descriptive
	 */
	public ApproxDateTime(StructuredApproxDate structured) {
		this.structured = structured;
	}

	/**
	 * Gets the value of the structured property.
	 * 
	 * @return possible object is {@link StructuredApproxDate }
	 * 
	 */
	public StructuredApproxDate getStructured() {
		return structured;
	}

	/**
	 * Sets the value of the structured property.
	 * 
	 * @param value
	 *            allowed object is {@link StructuredApproxDate }
	 * 
	 */
	public void setStructured(StructuredApproxDate value) {
		this.structured = value;
	}

	/**
	 * Gets the value of the descriptive property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptive() {
		return descriptive;
	}

	/**
	 * Sets the value of the descriptive property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptive(String value) {
		this.descriptive = value;
	}

}
