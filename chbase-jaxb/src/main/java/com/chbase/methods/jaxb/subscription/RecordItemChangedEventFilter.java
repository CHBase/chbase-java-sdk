//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.01 at 07:55:07 PM PST 
//

package com.chbase.methods.jaxb.subscription;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.subscription" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Defines the criteria when the event will fire.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for RecordItemChangedEventFilter complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RecordItemChangedEventFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type-ids" type="{urn:com.microsoft.wc.subscription}TypeIds"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordItemChangedEventFilter", propOrder = { "typeIds" })
public class RecordItemChangedEventFilter {

	@XmlElement(name = "type-ids", required = true)
	protected TypeIds typeIds;

	/**
	 * Gets the value of the typeIds property.
	 * 
	 * @return possible object is {@link TypeIds }
	 * 
	 */
	public TypeIds getTypeIds() {
		return typeIds;
	}

	/**
	 * Sets the value of the typeIds property.
	 * 
	 * @param value
	 *            allowed object is {@link TypeIds }
	 * 
	 */
	public void setTypeIds(TypeIds value) {
		this.typeIds = value;
	}

}
