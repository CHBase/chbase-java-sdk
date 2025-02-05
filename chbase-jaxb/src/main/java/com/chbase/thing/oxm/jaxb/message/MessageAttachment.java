//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:55 AM PST 
//

package com.chbase.thing.oxm.jaxb.message;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.message"&gt;
 *                     An attachment to the message.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for message-attachment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="message-attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="inline-display" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="content-id" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-attachment", propOrder = { "name", "blobName", "inlineDisplay", "contentId" })
public class MessageAttachment {

	@XmlElement(required = true)
	protected String name;
	@XmlElement(name = "blob-name", required = true)
	protected String blobName;
	@XmlElement(name = "inline-display")
	protected boolean inlineDisplay;
	@XmlElement(name = "content-id")
	protected String contentId;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

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

	/**
	 * Gets the value of the inlineDisplay property.
	 * 
	 */
	public boolean isInlineDisplay() {
		return inlineDisplay;
	}

	/**
	 * Sets the value of the inlineDisplay property.
	 * 
	 */
	public void setInlineDisplay(boolean value) {
		this.inlineDisplay = value;
	}

	/**
	 * Gets the value of the contentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentId() {
		return contentId;
	}

	/**
	 * Sets the value of the contentId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentId(String value) {
		this.contentId = value;
	}

}
