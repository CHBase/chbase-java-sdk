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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.dates.ApproxDate;
import com.chbase.thing.oxm.jaxb.dates.Date;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.pregnancy"&gt;
 *                     Record of a pregnancy.
 *                 &lt;/summary&gt;
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
 *         &lt;element name="due-date" type="{urn:com.microsoft.wc.dates}approx-date" minOccurs="0"/>
 *         &lt;element name="last-menstrual-period" type="{urn:com.microsoft.wc.dates}date" minOccurs="0"/>
 *         &lt;element name="conception-method" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="fetus-count" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="gestational-age" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="delivery" type="{urn:com.microsoft.wc.thing.pregnancy}Delivery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dueDate", "lastMenstrualPeriod", "conceptionMethod", "fetusCount", "gestationalAge",
		"delivery" })
@XmlRootElement(name = "pregnancy")
public class Pregnancy {
	public static String typeId = "46d485cf-2b84-429d-9159-83152ba801f4";

	@XmlElement(name = "due-date")
	protected ApproxDate dueDate;
	@XmlElement(name = "last-menstrual-period")
	protected Date lastMenstrualPeriod;
	@XmlElement(name = "conception-method")
	protected CodableValue conceptionMethod;
	@XmlElement(name = "fetus-count")
	protected Integer fetusCount;
	@XmlElement(name = "gestational-age")
	protected Integer gestationalAge;
	protected List<Delivery> delivery;

	/**
	 * Gets the value of the dueDate property.
	 * 
	 * @return possible object is {@link ApproxDate }
	 * 
	 */
	public ApproxDate getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the value of the dueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDate }
	 * 
	 */
	public void setDueDate(ApproxDate value) {
		this.dueDate = value;
	}

	/**
	 * Gets the value of the lastMenstrualPeriod property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getLastMenstrualPeriod() {
		return lastMenstrualPeriod;
	}

	/**
	 * Sets the value of the lastMenstrualPeriod property.
	 * 
	 * @param value
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setLastMenstrualPeriod(Date value) {
		this.lastMenstrualPeriod = value;
	}

	/**
	 * Gets the value of the conceptionMethod property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getConceptionMethod() {
		return conceptionMethod;
	}

	/**
	 * Sets the value of the conceptionMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setConceptionMethod(CodableValue value) {
		this.conceptionMethod = value;
	}

	/**
	 * Gets the value of the fetusCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFetusCount() {
		return fetusCount;
	}

	/**
	 * Sets the value of the fetusCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFetusCount(Integer value) {
		this.fetusCount = value;
	}

	/**
	 * Gets the value of the gestationalAge property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getGestationalAge() {
		return gestationalAge;
	}

	/**
	 * Sets the value of the gestationalAge property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setGestationalAge(Integer value) {
		this.gestationalAge = value;
	}

	/**
	 * Gets the value of the delivery property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the delivery property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDelivery().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Delivery
	 * }
	 * 
	 * 
	 */
	public List<Delivery> getDelivery() {
		if (delivery == null) {
			delivery = new ArrayList<Delivery>();
		}
		return this.delivery;
	}

}
