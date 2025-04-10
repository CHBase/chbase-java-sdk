//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.thing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;

 *                     Defines a loose relationship between instances of things within a record.

 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;

 *                     This relationship is completely application defined and maintained.

 *                     HealthVault does nothing to ensure that related things exist

 *                     or have a relationship back to this thing.

 *                     An example usage for related-things are to use an annotation thing

 *                     instance to make medical annotations for another thing type or to relate

 *                     a file instance (like an MRI) to problem instance.

 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for RelatedThing complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedThing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="thing-id" type="{urn:com.microsoft.wc.types}guid"/>
 *             &lt;element name="version-stamp" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="client-thing-id" type="{urn:com.microsoft.wc.types}string255" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="relationship-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedThing", propOrder = { "thingId", "versionStamp", "clientThingId", "relationshipType" })
public class RelatedThing {

	@XmlElement(name = "thing-id")
	protected String thingId;
	@XmlElement(name = "version-stamp")
	protected String versionStamp;
	@XmlElement(name = "client-thing-id")
	protected String clientThingId;
	@XmlElement(name = "relationship-type")
	protected String relationshipType;

	/**
	 * Gets the value of the thingId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThingId() {
		return thingId;
	}

	/**
	 * Sets the value of the thingId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setThingId(String value) {
		this.thingId = value;
	}

	/**
	 * Gets the value of the versionStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersionStamp() {
		return versionStamp;
	}

	/**
	 * Sets the value of the versionStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersionStamp(String value) {
		this.versionStamp = value;
	}

	/**
	 * Gets the value of the clientThingId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientThingId() {
		return clientThingId;
	}

	/**
	 * Sets the value of the clientThingId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientThingId(String value) {
		this.clientThingId = value;
	}

	/**
	 * Gets the value of the relationshipType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * Sets the value of the relationshipType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelationshipType(String value) {
		this.relationshipType = value;
	}

}
