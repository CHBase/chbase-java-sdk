//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.messages" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The contents of the message to be enqueued.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.messages" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for MessagePayload complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MessagePayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="HealthStatementMessage" type="{urn:com.microsoft.wc.messages}HealthStatementMessage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagePayload", propOrder = { "healthStatementMessage" })
public class MessagePayload {

	@XmlElement(name = "HealthStatementMessage")
	protected HealthStatementMessage healthStatementMessage;

	/**
	 * Gets the value of the healthStatementMessage property.
	 * 
	 * @return possible object is {@link HealthStatementMessage }
	 * 
	 */
	public HealthStatementMessage getHealthStatementMessage() {
		return healthStatementMessage;
	}

	/**
	 * Sets the value of the healthStatementMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link HealthStatementMessage }
	 * 
	 */
	public void setHealthStatementMessage(HealthStatementMessage value) {
		this.healthStatementMessage = value;
	}

}
