//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:54 AM PST 
//

package com.chbase.thing.oxm.jaxb.directive;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Person;
import com.chbase.thing.oxm.jaxb.dates.ApproxDateTime;
import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:dir="urn:com.microsoft.wc.thing.directive" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A single advance directive.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:dir="urn:com.microsoft.wc.thing.directive" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         An advance directive (or advance health directive) is
 *                         legal directive when dealing with health related issues.
 *                         Examples include living wills and power of attorney for
 *                         health care.
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
 *         &lt;element name="start-date" type="{urn:com.microsoft.wc.dates}approx-date-time"/>
 *         &lt;element name="stop-date" type="{urn:com.microsoft.wc.dates}approx-date-time"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="full-resuscitation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prohibited-interventions" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additional-instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attending-physician" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="attending-physician-endorsement" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="attending-nurse" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="attending-nurse-endorsement" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="expiration-date" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="discontinuation-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="discontinuation-physician" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="discontinuation-physician-endorsement" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="discontinuation-nurse" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="discontinuation-nurse-endorsement" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "startDate", "stopDate", "description", "fullResuscitation",
		"prohibitedInterventions", "additionalInstructions", "attendingPhysician", "attendingPhysicianEndorsement",
		"attendingNurse", "attendingNurseEndorsement", "expirationDate", "discontinuationDate",
		"discontinuationPhysician", "discontinuationPhysicianEndorsement", "discontinuationNurse",
		"discontinuationNurseEndorsement" })
@XmlRootElement(name = "directive")
public class Directive {
	public static String typeId = "822a5e5a-14f1-4d06-b92f-8f3f1b05218f";

	@XmlElement(name = "start-date", required = true)
	protected ApproxDateTime startDate;
	@XmlElement(name = "stop-date", required = true)
	protected ApproxDateTime stopDate;
	protected String description;
	@XmlElement(name = "full-resuscitation")
	protected Boolean fullResuscitation;
	@XmlElement(name = "prohibited-interventions")
	protected List<CodableValue> prohibitedInterventions;
	@XmlElement(name = "additional-instructions")
	protected String additionalInstructions;
	@XmlElement(name = "attending-physician")
	protected Person attendingPhysician;
	@XmlElement(name = "attending-physician-endorsement")
	protected DateTime attendingPhysicianEndorsement;
	@XmlElement(name = "attending-nurse")
	protected Person attendingNurse;
	@XmlElement(name = "attending-nurse-endorsement")
	protected DateTime attendingNurseEndorsement;
	@XmlElement(name = "expiration-date")
	protected DateTime expirationDate;
	@XmlElement(name = "discontinuation-date")
	protected ApproxDateTime discontinuationDate;
	@XmlElement(name = "discontinuation-physician")
	protected Person discontinuationPhysician;
	@XmlElement(name = "discontinuation-physician-endorsement")
	protected DateTime discontinuationPhysicianEndorsement;
	@XmlElement(name = "discontinuation-nurse")
	protected Person discontinuationNurse;
	@XmlElement(name = "discontinuation-nurse-endorsement")
	protected DateTime discontinuationNurseEndorsement;

	/**
	 * Gets the value of the startDate property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the startDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setStartDate(ApproxDateTime value) {
		this.startDate = value;
	}

	/**
	 * Gets the value of the stopDate property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getStopDate() {
		return stopDate;
	}

	/**
	 * Sets the value of the stopDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setStopDate(ApproxDateTime value) {
		this.stopDate = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the fullResuscitation property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFullResuscitation() {
		return fullResuscitation;
	}

	/**
	 * Sets the value of the fullResuscitation property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFullResuscitation(Boolean value) {
		this.fullResuscitation = value;
	}

	/**
	 * Gets the value of the prohibitedInterventions property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the prohibitedInterventions property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProhibitedInterventions().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getProhibitedInterventions() {
		if (prohibitedInterventions == null) {
			prohibitedInterventions = new ArrayList<CodableValue>();
		}
		return this.prohibitedInterventions;
	}

	/**
	 * Gets the value of the additionalInstructions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalInstructions() {
		return additionalInstructions;
	}

	/**
	 * Sets the value of the additionalInstructions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalInstructions(String value) {
		this.additionalInstructions = value;
	}

	/**
	 * Gets the value of the attendingPhysician property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getAttendingPhysician() {
		return attendingPhysician;
	}

	/**
	 * Sets the value of the attendingPhysician property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setAttendingPhysician(Person value) {
		this.attendingPhysician = value;
	}

	/**
	 * Gets the value of the attendingPhysicianEndorsement property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getAttendingPhysicianEndorsement() {
		return attendingPhysicianEndorsement;
	}

	/**
	 * Sets the value of the attendingPhysicianEndorsement property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setAttendingPhysicianEndorsement(DateTime value) {
		this.attendingPhysicianEndorsement = value;
	}

	/**
	 * Gets the value of the attendingNurse property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getAttendingNurse() {
		return attendingNurse;
	}

	/**
	 * Sets the value of the attendingNurse property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setAttendingNurse(Person value) {
		this.attendingNurse = value;
	}

	/**
	 * Gets the value of the attendingNurseEndorsement property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getAttendingNurseEndorsement() {
		return attendingNurseEndorsement;
	}

	/**
	 * Sets the value of the attendingNurseEndorsement property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setAttendingNurseEndorsement(DateTime value) {
		this.attendingNurseEndorsement = value;
	}

	/**
	 * Gets the value of the expirationDate property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Sets the value of the expirationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setExpirationDate(DateTime value) {
		this.expirationDate = value;
	}

	/**
	 * Gets the value of the discontinuationDate property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getDiscontinuationDate() {
		return discontinuationDate;
	}

	/**
	 * Sets the value of the discontinuationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setDiscontinuationDate(ApproxDateTime value) {
		this.discontinuationDate = value;
	}

	/**
	 * Gets the value of the discontinuationPhysician property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getDiscontinuationPhysician() {
		return discontinuationPhysician;
	}

	/**
	 * Sets the value of the discontinuationPhysician property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setDiscontinuationPhysician(Person value) {
		this.discontinuationPhysician = value;
	}

	/**
	 * Gets the value of the discontinuationPhysicianEndorsement property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getDiscontinuationPhysicianEndorsement() {
		return discontinuationPhysicianEndorsement;
	}

	/**
	 * Sets the value of the discontinuationPhysicianEndorsement property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setDiscontinuationPhysicianEndorsement(DateTime value) {
		this.discontinuationPhysicianEndorsement = value;
	}

	/**
	 * Gets the value of the discontinuationNurse property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getDiscontinuationNurse() {
		return discontinuationNurse;
	}

	/**
	 * Sets the value of the discontinuationNurse property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setDiscontinuationNurse(Person value) {
		this.discontinuationNurse = value;
	}

	/**
	 * Gets the value of the discontinuationNurseEndorsement property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getDiscontinuationNurseEndorsement() {
		return discontinuationNurseEndorsement;
	}

	/**
	 * Sets the value of the discontinuationNurseEndorsement property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setDiscontinuationNurseEndorsement(DateTime value) {
		this.discontinuationNurseEndorsement = value;
	}

}
