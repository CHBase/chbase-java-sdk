//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:05 AM PST 
//

package com.chbase.thing.oxm.jaxb.encounter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.DurationValue;
import com.chbase.thing.oxm.jaxb.base.Organization;
import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:encounter="urn:com.microsoft.wc.thing.encounter" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a medical encounter.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:encounter="urn:com.microsoft.wc.thing.encounter" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This thing type describes the medical encounter a person has.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{urn:com.microsoft.wc.thing.types}duration-value" minOccurs="0"/>
 *         &lt;element name="consent-granted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="facility" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "type", "reason", "duration", "consentGranted", "facility" })
@XmlRootElement(name = "encounter")
public class Encounter {

	protected DateTime when;
	protected CodableValue type;
	protected String reason;
	protected DurationValue duration;
	@XmlElement(name = "consent-granted")
	protected Boolean consentGranted;
	protected Organization facility;

	/**
	 * Gets the value of the when property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getWhen() {
		return when;
	}

	/**
	 * Sets the value of the when property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setWhen(DateTime value) {
		this.when = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setType(CodableValue value) {
		this.type = value;
	}

	/**
	 * Gets the value of the reason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the reason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReason(String value) {
		this.reason = value;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 * @return possible object is {@link DurationValue }
	 * 
	 */
	public DurationValue getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the duration property.
	 * 
	 * @param value
	 *            allowed object is {@link DurationValue }
	 * 
	 */
	public void setDuration(DurationValue value) {
		this.duration = value;
	}

	/**
	 * Gets the value of the consentGranted property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isConsentGranted() {
		return consentGranted;
	}

	/**
	 * Sets the value of the consentGranted property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setConsentGranted(Boolean value) {
		this.consentGranted = value;
	}

	/**
	 * Gets the value of the facility property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getFacility() {
		return facility;
	}

	/**
	 * Sets the value of the facility property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setFacility(Organization value) {
		this.facility = value;
	}

}