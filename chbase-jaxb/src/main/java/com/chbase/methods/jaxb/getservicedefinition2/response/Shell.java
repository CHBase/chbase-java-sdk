//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:20:44 PM PST 
//

package com.chbase.methods.jaxb.getservicedefinition2.response;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetServiceDefinition2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Information about the Microsoft HealthVault Shell.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Shell complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Shell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirect-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirect-token" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}ShellRedirectToken" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shell", propOrder = { "url", "redirectUrl", "redirectToken" })
public class Shell {

	@XmlElement(required = true)
	protected String url;
	@XmlElement(name = "redirect-url", required = true)
	protected String redirectUrl;
	@XmlElement(name = "redirect-token")
	protected List<ShellRedirectToken> redirectToken;

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value) {
		this.url = value;
	}

	/**
	 * Gets the value of the redirectUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * Sets the value of the redirectUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRedirectUrl(String value) {
		this.redirectUrl = value;
	}

	/**
	 * Gets the value of the redirectToken property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the redirectToken property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRedirectToken().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ShellRedirectToken }
	 * 
	 * 
	 */
	public List<ShellRedirectToken> getRedirectToken() {
		if (redirectToken == null) {
			redirectToken = new ArrayList<ShellRedirectToken>();
		}
		return this.redirectToken;
	}

}
