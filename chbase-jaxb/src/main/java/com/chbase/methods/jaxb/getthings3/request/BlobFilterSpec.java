//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:13:50 PM PST 
//

package com.chbase.methods.jaxb.getthings3.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BlobFilterSpec complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BlobFilterSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blob-name" type="{urn:com.microsoft.wc.types}stringnwz64"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlobFilterSpec", propOrder = { "blobName" })
public class BlobFilterSpec {

	@XmlElement(name = "blob-name", required = true)
	protected String blobName;

	/**
	 * Gets the value of the blobName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBlobName() {
		return blobName;
	}

	/**
	 * Sets the value of the blobName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBlobName(String value) {
		this.blobName = value;
	}

}
