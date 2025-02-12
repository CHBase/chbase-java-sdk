//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:14 AM PST 
//

package com.chbase.thing.oxm.jaxb.exercise;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodedValue;
import com.chbase.thing.oxm.jaxb.base.StructuredMeasurement;

/**
 * <p>
 * Java class for StructuredNameValue complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredNameValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}coded-value"/>
 *         &lt;element name="value" type="{urn:com.microsoft.wc.thing.types}structured-measurement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredNameValue", propOrder = { "name", "value" })
public class StructuredNameValue {

	@XmlElement(required = true)
	protected CodedValue name;
	@XmlElement(required = true)
	protected StructuredMeasurement value;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link CodedValue }
	 * 
	 */
	public CodedValue getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link CodedValue }
	 * 
	 */
	public void setName(CodedValue value) {
		this.name = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link StructuredMeasurement }
	 * 
	 */
	public StructuredMeasurement getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link StructuredMeasurement }
	 * 
	 */
	public void setValue(StructuredMeasurement value) {
		this.value = value;
	}

}
