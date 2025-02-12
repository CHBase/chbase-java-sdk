//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.chbase.methods.jaxb.thingtype;

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.ThingType" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for ThingType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ThingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="version-type-id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="version-sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.methods.ThingType}VocabReference"/>
 *         &lt;element name="file-name-prefix" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="effective-date-xpath" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="column-data" type="{urn:com.microsoft.wc.methods.ThingType}ColumnData" minOccurs="0"/>
 *         &lt;element name="is-creatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is-immutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is-singleton" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="xslts" type="{urn:com.microsoft.wc.methods.ThingType}Transforms" minOccurs="0"/>
 *         &lt;element name="images" type="{urn:com.microsoft.wc.methods.ThingType}Images" minOccurs="0"/>
 *         &lt;element name="xsd" type="{urn:com.microsoft.wc.types}stringnz"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThingType", propOrder = { "id", "versionTypeId", "versionSequence", "name", "fileNamePrefix",
		"effectiveDateXpath", "columnData", "isCreatable", "isImmutable", "isSingleton", "xslts", "images", "xsd" })
public class ThingType {

	@XmlElement(required = true)
	protected String id;
	@XmlElement(name = "version-type-id")
	protected String versionTypeId;
	@XmlElement(name = "version-sequence")
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger versionSequence;
	@XmlElement(required = true)
	protected VocabReference name;
	@XmlElement(name = "file-name-prefix")
	protected String fileNamePrefix;
	@XmlElement(name = "effective-date-xpath")
	protected String effectiveDateXpath;
	@XmlElement(name = "column-data")
	protected ColumnData columnData;
	@XmlElement(name = "is-creatable")
	protected boolean isCreatable;
	@XmlElement(name = "is-immutable")
	protected boolean isImmutable;
	@XmlElement(name = "is-singleton")
	protected boolean isSingleton;
	protected Transforms xslts;
	protected Images images;
	@XmlElement(required = true)
	protected String xsd;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the versionTypeId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersionTypeId() {
		return versionTypeId;
	}

	/**
	 * Sets the value of the versionTypeId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersionTypeId(String value) {
		this.versionTypeId = value;
	}

	/**
	 * Gets the value of the versionSequence property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getVersionSequence() {
		return versionSequence;
	}

	/**
	 * Sets the value of the versionSequence property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setVersionSequence(BigInteger value) {
		this.versionSequence = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link VocabReference }
	 * 
	 */
	public VocabReference getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link VocabReference }
	 * 
	 */
	public void setName(VocabReference value) {
		this.name = value;
	}

	/**
	 * Gets the value of the fileNamePrefix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileNamePrefix() {
		return fileNamePrefix;
	}

	/**
	 * Sets the value of the fileNamePrefix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileNamePrefix(String value) {
		this.fileNamePrefix = value;
	}

	/**
	 * Gets the value of the effectiveDateXpath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEffectiveDateXpath() {
		return effectiveDateXpath;
	}

	/**
	 * Sets the value of the effectiveDateXpath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEffectiveDateXpath(String value) {
		this.effectiveDateXpath = value;
	}

	/**
	 * Gets the value of the columnData property.
	 * 
	 * @return possible object is {@link ColumnData }
	 * 
	 */
	public ColumnData getColumnData() {
		return columnData;
	}

	/**
	 * Sets the value of the columnData property.
	 * 
	 * @param value
	 *            allowed object is {@link ColumnData }
	 * 
	 */
	public void setColumnData(ColumnData value) {
		this.columnData = value;
	}

	/**
	 * Gets the value of the isCreatable property.
	 * 
	 */
	public boolean isIsCreatable() {
		return isCreatable;
	}

	/**
	 * Sets the value of the isCreatable property.
	 * 
	 */
	public void setIsCreatable(boolean value) {
		this.isCreatable = value;
	}

	/**
	 * Gets the value of the isImmutable property.
	 * 
	 */
	public boolean isIsImmutable() {
		return isImmutable;
	}

	/**
	 * Sets the value of the isImmutable property.
	 * 
	 */
	public void setIsImmutable(boolean value) {
		this.isImmutable = value;
	}

	/**
	 * Gets the value of the isSingleton property.
	 * 
	 */
	public boolean isIsSingleton() {
		return isSingleton;
	}

	/**
	 * Sets the value of the isSingleton property.
	 * 
	 */
	public void setIsSingleton(boolean value) {
		this.isSingleton = value;
	}

	/**
	 * Gets the value of the xslts property.
	 * 
	 * @return possible object is {@link Transforms }
	 * 
	 */
	public Transforms getXslts() {
		return xslts;
	}

	/**
	 * Sets the value of the xslts property.
	 * 
	 * @param value
	 *            allowed object is {@link Transforms }
	 * 
	 */
	public void setXslts(Transforms value) {
		this.xslts = value;
	}

	/**
	 * Gets the value of the images property.
	 * 
	 * @return possible object is {@link Images }
	 * 
	 */
	public Images getImages() {
		return images;
	}

	/**
	 * Sets the value of the images property.
	 * 
	 * @param value
	 *            allowed object is {@link Images }
	 * 
	 */
	public void setImages(Images value) {
		this.images = value;
	}

	/**
	 * Gets the value of the xsd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXsd() {
		return xsd;
	}

	/**
	 * Sets the value of the xsd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXsd(String value) {
		this.xsd = value;
	}

}
