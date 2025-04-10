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
 *                     Defines an event subscription.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.subscription" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A HealthVault application can subscribe to be notified when specific events take place. 
 *                     
 *                     For example, a notification could be sent whenever a record the application is authorized to see
 *                     has a new Medication item placed into it. 
 *                     
 *                     This subscription is persistent until the application removes it. 
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Subscription complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="common" type="{urn:com.microsoft.wc.subscription}Common"/>
 *         &lt;choice>
 *           &lt;element name="record-item-changed-event" type="{urn:com.microsoft.wc.subscription}RecordItemChangedEvent"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = { "common", "recordItemChangedEvent" })
public class Subscription {

	@XmlElement(required = true)
	protected Common common;
	@XmlElement(name = "record-item-changed-event")
	protected RecordItemChangedEvent recordItemChangedEvent;

	/**
	 * Gets the value of the common property.
	 * 
	 * @return possible object is {@link Common }
	 * 
	 */
	public Common getCommon() {
		return common;
	}

	/**
	 * Sets the value of the common property.
	 * 
	 * @param value
	 *            allowed object is {@link Common }
	 * 
	 */
	public void setCommon(Common value) {
		this.common = value;
	}

	/**
	 * Gets the value of the recordItemChangedEvent property.
	 * 
	 * @return possible object is {@link RecordItemChangedEvent }
	 * 
	 */
	public RecordItemChangedEvent getRecordItemChangedEvent() {
		return recordItemChangedEvent;
	}

	/**
	 * Sets the value of the recordItemChangedEvent property.
	 * 
	 * @param value
	 *            allowed object is {@link RecordItemChangedEvent }
	 * 
	 */
	public void setRecordItemChangedEvent(RecordItemChangedEvent value) {
		this.recordItemChangedEvent = value;
	}

}
