//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:59 AM PST 
//

package com.chbase.thing.oxm.jaxb.sleepjournalam;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.dates.DateTime;
import com.chbase.thing.oxm.jaxb.dates.Time;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjam="urn:com.microsoft.wc.thing.sjam" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Schema for a morning sleep journal.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjam="urn:com.microsoft.wc.thing.sjam" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A morning sleep journal reflects back on the previous nights
 *                         sleep. The data items were adapted from the NIH publication #06-5271,
 *                         November 2005, "Your Guide to Healthy Sleep", ISBN 1-933236-05-1.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="bed-time" type="{urn:com.microsoft.wc.dates}time"/>
 *         &lt;element name="wake-time" type="{urn:com.microsoft.wc.dates}time"/>
 *         &lt;element name="sleep-minutes" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="settling-minutes" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="awakening" type="{urn:com.microsoft.wc.thing.sjam}Awakening" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medications" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="wake-state">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "bedTime", "wakeTime", "sleepMinutes", "settlingMinutes", "awakening",
		"medications", "wakeState" })
@XmlRootElement(name = "sleep-am")
public class SleepAm {
	public static String typeId = "11C52484-7F1A-11DB-AEAC-87D355D89593";

	@XmlElement(required = true)
	protected DateTime when;
	@XmlElement(name = "bed-time", required = true)
	protected Time bedTime;
	@XmlElement(name = "wake-time", required = true)
	protected Time wakeTime;
	@XmlElement(name = "sleep-minutes")
	protected int sleepMinutes;
	@XmlElement(name = "settling-minutes")
	protected int settlingMinutes;
	protected List<Awakening> awakening;
	protected CodableValue medications;
	@XmlElement(name = "wake-state")
	protected int wakeState;

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
	 * Gets the value of the bedTime property.
	 * 
	 * @return possible object is {@link Time }
	 * 
	 */
	public Time getBedTime() {
		return bedTime;
	}

	/**
	 * Sets the value of the bedTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Time }
	 * 
	 */
	public void setBedTime(Time value) {
		this.bedTime = value;
	}

	/**
	 * Gets the value of the wakeTime property.
	 * 
	 * @return possible object is {@link Time }
	 * 
	 */
	public Time getWakeTime() {
		return wakeTime;
	}

	/**
	 * Sets the value of the wakeTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Time }
	 * 
	 */
	public void setWakeTime(Time value) {
		this.wakeTime = value;
	}

	/**
	 * Gets the value of the sleepMinutes property.
	 * 
	 */
	public int getSleepMinutes() {
		return sleepMinutes;
	}

	/**
	 * Sets the value of the sleepMinutes property.
	 * 
	 */
	public void setSleepMinutes(int value) {
		this.sleepMinutes = value;
	}

	/**
	 * Gets the value of the settlingMinutes property.
	 * 
	 */
	public int getSettlingMinutes() {
		return settlingMinutes;
	}

	/**
	 * Sets the value of the settlingMinutes property.
	 * 
	 */
	public void setSettlingMinutes(int value) {
		this.settlingMinutes = value;
	}

	/**
	 * Gets the value of the awakening property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the awakening property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAwakening().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Awakening
	 * }
	 * 
	 * 
	 */
	public List<Awakening> getAwakening() {
		if (awakening == null) {
			awakening = new ArrayList<Awakening>();
		}
		return this.awakening;
	}

	/**
	 * Gets the value of the medications property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getMedications() {
		return medications;
	}

	/**
	 * Sets the value of the medications property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setMedications(CodableValue value) {
		this.medications = value;
	}

	/**
	 * Gets the value of the wakeState property.
	 * 
	 */
	public int getWakeState() {
		return wakeState;
	}

	/**
	 * Sets the value of the wakeState property.
	 * 
	 */
	public void setWakeState(int value) {
		this.wakeState = value;
	}

}
