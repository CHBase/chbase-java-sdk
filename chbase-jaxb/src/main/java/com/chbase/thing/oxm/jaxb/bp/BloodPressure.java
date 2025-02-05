//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:08 AM PST 
//

package com.chbase.thing.oxm.jaxb.bp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:BloodPressure="urn:com.microsoft.wc.thing.BloodPressure" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines a single blood pressure reading.
 *                     &lt;/summary&gt;
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="systolic" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="diastolic" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="pulse" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="irregular-heartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "systolic", "diastolic", "pulse", "irregularHeartbeat" })
@XmlRootElement(name = "blood-pressure")
public class BloodPressure {
	public static String typeId = "ca3c57f4-f4c1-4e15-be67-0a3caf5414ed";

	@XmlElement(required = true)
	protected DateTime when;
	protected int systolic;
	protected int diastolic;
	protected Integer pulse;
	@XmlElement(name = "irregular-heartbeat")
	protected Boolean irregularHeartbeat;

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
	 * Gets the value of the systolic property.
	 * 
	 */
	public int getSystolic() {
		return systolic;
	}

	/**
	 * Sets the value of the systolic property.
	 * 
	 */
	public void setSystolic(int value) {
		this.systolic = value;
	}

	/**
	 * Gets the value of the diastolic property.
	 * 
	 */
	public int getDiastolic() {
		return diastolic;
	}

	/**
	 * Sets the value of the diastolic property.
	 * 
	 */
	public void setDiastolic(int value) {
		this.diastolic = value;
	}

	/**
	 * Gets the value of the pulse property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPulse() {
		return pulse;
	}

	/**
	 * Sets the value of the pulse property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPulse(Integer value) {
		this.pulse = value;
	}

	/**
	 * Gets the value of the irregularHeartbeat property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIrregularHeartbeat() {
		return irregularHeartbeat;
	}

	/**
	 * Sets the value of the irregularHeartbeat property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIrregularHeartbeat(Boolean value) {
		this.irregularHeartbeat = value;
	}

}
