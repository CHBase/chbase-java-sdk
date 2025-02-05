//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:01:35 PM PDT 
//

package com.chbase.methods.jaxb.getservicedefinition2.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetServiceDefinition2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Information about a particular version of one of the
 *                     Microsoft HealthVault XML web-methods.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for XmlMethodVersion complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="XmlMethodVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request-schema-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response-schema-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlMethodVersion", propOrder = { "requestSchemaUrl", "responseSchemaUrl" })
public class XmlMethodVersion {

	@XmlElement(name = "request-schema-url")
	protected String requestSchemaUrl;
	@XmlElement(name = "response-schema-url")
	protected String responseSchemaUrl;
	@XmlAttribute(name = "number", required = true)
	protected String number;

	/**
	 * Gets the value of the requestSchemaUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestSchemaUrl() {
		return requestSchemaUrl;
	}

	/**
	 * Sets the value of the requestSchemaUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestSchemaUrl(String value) {
		this.requestSchemaUrl = value;
	}

	/**
	 * Gets the value of the responseSchemaUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseSchemaUrl() {
		return responseSchemaUrl;
	}

	/**
	 * Sets the value of the responseSchemaUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseSchemaUrl(String value) {
		this.responseSchemaUrl = value;
	}

	/**
	 * Gets the value of the number property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the value of the number property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumber(String value) {
		this.number = value;
	}

}
