//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:51 AM PST 
//

package com.chbase.thing.oxm.jaxb.medication;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.GeneralMeasurement;
import com.chbase.thing.oxm.jaxb.dates.ApproxDateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a medication.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This type contains information describing a medication, and is related to the medication fill type.
 *                         Instances of the medication fill type are linked to instances of this type using related items. 
 *                         For example, if the medication is prescribed, the medication fill describes typical information that a
 *                         pharmacy would add.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="generic-name" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="dose" type="{urn:com.microsoft.wc.thing.types}general-measurement" minOccurs="0"/>
 *         &lt;element name="strength" type="{urn:com.microsoft.wc.thing.types}general-measurement" minOccurs="0"/>
 *         &lt;element name="frequency" type="{urn:com.microsoft.wc.thing.types}general-measurement" minOccurs="0"/>
 *         &lt;element name="route" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="indication" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="date-started" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="date-discontinued" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="prescribed" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="prescription" type="{urn:com.microsoft.wc.thing.medication}Prescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "genericName", "dose", "strength", "frequency", "route", "indication",
		"dateStarted", "dateDiscontinued", "prescribed", "prescription" })
@XmlRootElement(name = "medication")
public class Medication {
	public static String typeId = "30cafccc-047d-4288-94ef-643571f7919d";

	@XmlElement(required = true)
	protected CodableValue name;
	@XmlElement(name = "generic-name")
	protected CodableValue genericName;
	protected GeneralMeasurement dose;
	protected GeneralMeasurement strength;
	protected GeneralMeasurement frequency;
	protected CodableValue route;
	protected CodableValue indication;
	@XmlElement(name = "date-started")
	protected ApproxDateTime dateStarted;
	@XmlElement(name = "date-discontinued")
	protected ApproxDateTime dateDiscontinued;
	protected CodableValue prescribed;
	protected Prescription prescription;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setName(CodableValue value) {
		this.name = value;
	}

	/**
	 * Gets the value of the genericName property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getGenericName() {
		return genericName;
	}

	/**
	 * Sets the value of the genericName property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setGenericName(CodableValue value) {
		this.genericName = value;
	}

	/**
	 * Gets the value of the dose property.
	 * 
	 * @return possible object is {@link GeneralMeasurement }
	 * 
	 */
	public GeneralMeasurement getDose() {
		return dose;
	}

	/**
	 * Sets the value of the dose property.
	 * 
	 * @param value
	 *            allowed object is {@link GeneralMeasurement }
	 * 
	 */
	public void setDose(GeneralMeasurement value) {
		this.dose = value;
	}

	/**
	 * Gets the value of the strength property.
	 * 
	 * @return possible object is {@link GeneralMeasurement }
	 * 
	 */
	public GeneralMeasurement getStrength() {
		return strength;
	}

	/**
	 * Sets the value of the strength property.
	 * 
	 * @param value
	 *            allowed object is {@link GeneralMeasurement }
	 * 
	 */
	public void setStrength(GeneralMeasurement value) {
		this.strength = value;
	}

	/**
	 * Gets the value of the frequency property.
	 * 
	 * @return possible object is {@link GeneralMeasurement }
	 * 
	 */
	public GeneralMeasurement getFrequency() {
		return frequency;
	}

	/**
	 * Sets the value of the frequency property.
	 * 
	 * @param value
	 *            allowed object is {@link GeneralMeasurement }
	 * 
	 */
	public void setFrequency(GeneralMeasurement value) {
		this.frequency = value;
	}

	/**
	 * Gets the value of the route property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getRoute() {
		return route;
	}

	/**
	 * Sets the value of the route property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setRoute(CodableValue value) {
		this.route = value;
	}

	/**
	 * Gets the value of the indication property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getIndication() {
		return indication;
	}

	/**
	 * Sets the value of the indication property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setIndication(CodableValue value) {
		this.indication = value;
	}

	/**
	 * Gets the value of the dateStarted property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getDateStarted() {
		return dateStarted;
	}

	/**
	 * Sets the value of the dateStarted property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setDateStarted(ApproxDateTime value) {
		this.dateStarted = value;
	}

	/**
	 * Gets the value of the dateDiscontinued property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getDateDiscontinued() {
		return dateDiscontinued;
	}

	/**
	 * Sets the value of the dateDiscontinued property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setDateDiscontinued(ApproxDateTime value) {
		this.dateDiscontinued = value;
	}

	/**
	 * Gets the value of the prescribed property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getPrescribed() {
		return prescribed;
	}

	/**
	 * Sets the value of the prescribed property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setPrescribed(CodableValue value) {
		this.prescribed = value;
	}

	/**
	 * Gets the value of the prescription property.
	 * 
	 * @return possible object is {@link Prescription }
	 * 
	 */
	public Prescription getPrescription() {
		return prescription;
	}

	/**
	 * Sets the value of the prescription property.
	 * 
	 * @param value
	 *            allowed object is {@link Prescription }
	 * 
	 */
	public void setPrescription(Prescription value) {
		this.prescription = value;
	}

}
