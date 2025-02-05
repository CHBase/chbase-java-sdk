//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:30 AM PST 
//

package com.chbase.thing.oxm.jaxb.pregnancy;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Organization;
import com.chbase.thing.oxm.jaxb.dates.ApproxDateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.pregnancy"&gt;
 *                     Details about the delivery.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Delivery complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="time-of-delivery" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="labor-duration" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="complications" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="anesthesia" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delivery-method" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="outcome" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="baby" type="{urn:com.microsoft.wc.thing.pregnancy}Baby" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delivery", propOrder = { "location", "timeOfDelivery", "laborDuration", "complications", "anesthesia",
		"deliveryMethod", "outcome", "baby", "note" })
public class Delivery {

	protected Organization location;
	@XmlElement(name = "time-of-delivery")
	protected ApproxDateTime timeOfDelivery;
	@XmlElement(name = "labor-duration")
	protected Double laborDuration;
	protected List<CodableValue> complications;
	protected List<CodableValue> anesthesia;
	@XmlElement(name = "delivery-method")
	protected CodableValue deliveryMethod;
	protected CodableValue outcome;
	protected Baby baby;
	protected String note;

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setLocation(Organization value) {
		this.location = value;
	}

	/**
	 * Gets the value of the timeOfDelivery property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getTimeOfDelivery() {
		return timeOfDelivery;
	}

	/**
	 * Sets the value of the timeOfDelivery property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setTimeOfDelivery(ApproxDateTime value) {
		this.timeOfDelivery = value;
	}

	/**
	 * Gets the value of the laborDuration property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getLaborDuration() {
		return laborDuration;
	}

	/**
	 * Sets the value of the laborDuration property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setLaborDuration(Double value) {
		this.laborDuration = value;
	}

	/**
	 * Gets the value of the complications property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the complications property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComplications().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getComplications() {
		if (complications == null) {
			complications = new ArrayList<CodableValue>();
		}
		return this.complications;
	}

	/**
	 * Gets the value of the anesthesia property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the anesthesia property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnesthesia().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getAnesthesia() {
		if (anesthesia == null) {
			anesthesia = new ArrayList<CodableValue>();
		}
		return this.anesthesia;
	}

	/**
	 * Gets the value of the deliveryMethod property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getDeliveryMethod() {
		return deliveryMethod;
	}

	/**
	 * Sets the value of the deliveryMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setDeliveryMethod(CodableValue value) {
		this.deliveryMethod = value;
	}

	/**
	 * Gets the value of the outcome property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getOutcome() {
		return outcome;
	}

	/**
	 * Sets the value of the outcome property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setOutcome(CodableValue value) {
		this.outcome = value;
	}

	/**
	 * Gets the value of the baby property.
	 * 
	 * @return possible object is {@link Baby }
	 * 
	 */
	public Baby getBaby() {
		return baby;
	}

	/**
	 * Sets the value of the baby property.
	 * 
	 * @param value
	 *            allowed object is {@link Baby }
	 * 
	 */
	public void setBaby(Baby value) {
		this.baby = value;
	}

	/**
	 * Gets the value of the note property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Sets the value of the note property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNote(String value) {
		this.note = value;
	}

}
