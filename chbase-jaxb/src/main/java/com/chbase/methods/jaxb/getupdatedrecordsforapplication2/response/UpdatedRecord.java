//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:02:29 PM PDT 
//

package com.chbase.methods.jaxb.getupdatedrecordsforapplication2.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetUpdatedRecordsForApplication2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Record identifier for the record authorized for
 *                     the application that has been updated and its corresponding
 *                     person identifier.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for UpdatedRecord complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatedRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="update-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="person-id" type="{urn:com.microsoft.wc.types}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedRecord", propOrder = { "recordId", "updateDate", "personId" })
public class UpdatedRecord {

	@XmlElement(name = "record-id", required = true)
	protected String recordId;
	@XmlElement(name = "update-date", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar updateDate;
	@XmlElement(name = "person-id", required = true)
	protected String personId;

	/**
	 * Gets the value of the recordId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordId() {
		return recordId;
	}

	/**
	 * Sets the value of the recordId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordId(String value) {
		this.recordId = value;
	}

	/**
	 * Gets the value of the updateDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * Sets the value of the updateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUpdateDate(XMLGregorianCalendar value) {
		this.updateDate = value;
	}

	/**
	 * Gets the value of the personId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * Sets the value of the personId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPersonId(String value) {
		this.personId = value;
	}

}
