//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:01 AM PST 
//

package com.chbase.thing.oxm.jaxb.bodycomposition;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.WeightValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.body-composition"&gt;
 *                     A single measurement of body composition. 
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.body-composition"&gt;
 *                     The mass-value element is used to store mass values, and the percentage-value
 *                     is used to store percentages. An application should set one or the other. When both values are 
 *                     available, they should be stored in separate instances. 
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for BodyCompositionValue complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BodyCompositionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mass-value" type="{urn:com.microsoft.wc.thing.types}weight-value" minOccurs="0"/>
 *         &lt;element name="percent-value" type="{urn:com.microsoft.wc.thing.types}percentage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyCompositionValue", propOrder = { "massValue", "percentValue" })
public class BodyCompositionValue {

	@XmlElement(name = "mass-value")
	protected WeightValue massValue;
	@XmlElement(name = "percent-value")
	protected Double percentValue;

	/**
	 * Gets the value of the massValue property.
	 * 
	 * @return possible object is {@link WeightValue }
	 * 
	 */
	public WeightValue getMassValue() {
		return massValue;
	}

	/**
	 * Sets the value of the massValue property.
	 * 
	 * @param value
	 *            allowed object is {@link WeightValue }
	 * 
	 */
	public void setMassValue(WeightValue value) {
		this.massValue = value;
	}

	/**
	 * Gets the value of the percentValue property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPercentValue() {
		return percentValue;
	}

	/**
	 * Sets the value of the percentValue property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPercentValue(Double value) {
		this.percentValue = value;
	}

}
