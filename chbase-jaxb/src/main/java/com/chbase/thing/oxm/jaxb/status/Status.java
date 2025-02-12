//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:43:10 AM PST 
//

package com.chbase.thing.oxm.jaxb.status;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.status"&gt;
 *                         Stores status information about a specific health record item.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.status"&gt;
 *                         Each status is related to one or more health record items which are stored
 *                         as related items.
 *                 
 *                         For example, the HealthVault Shell creates a status item to indicate that a CCR or CCD document has 
 *                         been reconciled, and that document is linked using a related item. 
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
 *         &lt;element name="status-type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="text" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "statusType", "text" })
@XmlRootElement(name = "status")
public class Status {
	public static String typeId = "d33a32b2-00de-43b8-9f2a-c4c7e9f580ec";

	@XmlElement(name = "status-type", required = true)
	protected CodableValue statusType;
	protected String text;

	/**
	 * Gets the value of the statusType property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getStatusType() {
		return statusType;
	}

	/**
	 * Sets the value of the statusType property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setStatusType(CodableValue value) {
		this.statusType = value;
	}

	/**
	 * Gets the value of the text property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the value of the text property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setText(String value) {
		this.text = value;
	}

}
