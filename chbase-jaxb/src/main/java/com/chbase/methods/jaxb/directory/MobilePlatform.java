//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.directory;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.directory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           Any extra data in string-value pair format.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for MobilePlatform complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MobilePlatform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app-url" type="{urn:com.microsoft.wc.directory}AppUrl"/>
 *       &lt;/sequence>
 *       &lt;attribute name="os" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilePlatform", propOrder = { "appUrl" })
public class MobilePlatform {

	@XmlElement(name = "app-url", required = true)
	protected AppUrl appUrl;
	@XmlAttribute(name = "os", required = true)
	protected String os;

	/**
	 * Gets the value of the appUrl property.
	 * 
	 * @return possible object is {@link AppUrl }
	 * 
	 */
	public AppUrl getAppUrl() {
		return appUrl;
	}

	/**
	 * Sets the value of the appUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link AppUrl }
	 * 
	 */
	public void setAppUrl(AppUrl value) {
		this.appUrl = value;
	}

	/**
	 * Gets the value of the os property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOs() {
		return os;
	}

	/**
	 * Sets the value of the os property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOs(String value) {
		this.os = value;
	}

}
