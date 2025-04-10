//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.record;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.chbase.methods.jaxb.auth.AuthXml;
import com.chbase.thing.oxm.jaxb.types.Location;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.record" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.record" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for ActiveAppAuthorization complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveAppAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="application-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date-auth-expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="person-online-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="person-offline-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="date-auth-created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="date-auth-updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="record-display-name" type="{urn:com.microsoft.wc.types}string255"/>
 *         &lt;element name="auto-reconcile-documents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:com.microsoft.wc.types}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAppAuthorization", propOrder = { "recordId", "applicationId", "name", "dateAuthExpires",
		"personOnlineAuthXml", "personOfflineAuthXml", "dateAuthCreated", "dateAuthUpdated", "recordDisplayName",
		"autoReconcileDocuments", "location" })
public class ActiveAppAuthorization {

	@XmlElement(name = "record-id", required = true)
	protected String recordId;
	@XmlElement(name = "application-id", required = true)
	protected String applicationId;
	@XmlElement(required = true)
	protected String name;
	@XmlElement(name = "date-auth-expires")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthExpires;
	@XmlElement(name = "person-online-auth-xml")
	protected AuthXml personOnlineAuthXml;
	@XmlElement(name = "person-offline-auth-xml")
	protected AuthXml personOfflineAuthXml;
	@XmlElement(name = "date-auth-created")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthCreated;
	@XmlElement(name = "date-auth-updated")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthUpdated;
	@XmlElement(name = "record-display-name", required = true)
	protected String recordDisplayName;
	@XmlElement(name = "auto-reconcile-documents")
	protected Boolean autoReconcileDocuments;
	protected Location location;

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
	 * Gets the value of the applicationId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * Sets the value of the applicationId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApplicationId(String value) {
		this.applicationId = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the dateAuthExpires property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthExpires() {
		return dateAuthExpires;
	}

	/**
	 * Sets the value of the dateAuthExpires property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthExpires(XMLGregorianCalendar value) {
		this.dateAuthExpires = value;
	}

	/**
	 * Gets the value of the personOnlineAuthXml property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOnlineAuthXml() {
		return personOnlineAuthXml;
	}

	/**
	 * Sets the value of the personOnlineAuthXml property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOnlineAuthXml(AuthXml value) {
		this.personOnlineAuthXml = value;
	}

	/**
	 * Gets the value of the personOfflineAuthXml property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOfflineAuthXml() {
		return personOfflineAuthXml;
	}

	/**
	 * Sets the value of the personOfflineAuthXml property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOfflineAuthXml(AuthXml value) {
		this.personOfflineAuthXml = value;
	}

	/**
	 * Gets the value of the dateAuthCreated property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthCreated() {
		return dateAuthCreated;
	}

	/**
	 * Sets the value of the dateAuthCreated property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthCreated(XMLGregorianCalendar value) {
		this.dateAuthCreated = value;
	}

	/**
	 * Gets the value of the dateAuthUpdated property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthUpdated() {
		return dateAuthUpdated;
	}

	/**
	 * Sets the value of the dateAuthUpdated property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthUpdated(XMLGregorianCalendar value) {
		this.dateAuthUpdated = value;
	}

	/**
	 * Gets the value of the recordDisplayName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordDisplayName() {
		return recordDisplayName;
	}

	/**
	 * Sets the value of the recordDisplayName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordDisplayName(String value) {
		this.recordDisplayName = value;
	}

	/**
	 * Gets the value of the autoReconcileDocuments property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAutoReconcileDocuments() {
		return autoReconcileDocuments;
	}

	/**
	 * Sets the value of the autoReconcileDocuments property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAutoReconcileDocuments(Boolean value) {
		this.autoReconcileDocuments = value;
	}

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link Location }
	 * 
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link Location }
	 * 
	 */
	public void setLocation(Location value) {
		this.location = value;
	}

}
