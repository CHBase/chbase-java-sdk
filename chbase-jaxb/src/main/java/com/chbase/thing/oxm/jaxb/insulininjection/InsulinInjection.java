//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:21 AM PST 
//

package com.chbase.thing.oxm.jaxb.insulininjection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.InsulinInjectionValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:insulin="urn:com.microsoft.wc.thing.insulin" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Any insulin injection used to treat diabetes.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:insulin="urn:com.microsoft.wc.thing.insulin" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         The injection may or may not have a device component.
 *                         Each new injection package should have a new insulin-injection thing, even
 *                         if there is a containing device that is reusable.
 *                         Changes in regimen (min/max doses per day) should also
 *                         cause a new thing to be created.
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
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="amount" type="{urn:com.microsoft.wc.thing.types}insulin-injection-value"/>
 *         &lt;element name="device-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "type", "amount", "deviceId" })
@XmlRootElement(name = "insulin-injection")
public class InsulinInjection {
	public static String typeId = "3B3C053B-B1FE-4E11-9E22-D4B480DE74E8";

	@XmlElement(required = true)
	protected CodableValue type;
	@XmlElement(required = true)
	protected InsulinInjectionValue amount;
	@XmlElement(name = "device-id")
	protected String deviceId;

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
	 * Gets the value of the amount property.
	 * 
	 * @return possible object is {@link InsulinInjectionValue }
	 * 
	 */
	public InsulinInjectionValue getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 * @param value
	 *            allowed object is {@link InsulinInjectionValue }
	 * 
	 */
	public void setAmount(InsulinInjectionValue value) {
		this.amount = value;
	}

	/**
	 * Gets the value of the deviceId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * Sets the value of the deviceId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeviceId(String value) {
		this.deviceId = value;
	}

}
