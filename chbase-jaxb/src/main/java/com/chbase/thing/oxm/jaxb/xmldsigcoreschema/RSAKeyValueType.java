//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.xmldsigcoreschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RSAKeyValueType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RSAKeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Modulus" type="{}CryptoBinary"/>
 *         &lt;element name="Exponent" type="{}CryptoBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAKeyValueType", propOrder = { "modulus", "exponent" })
public class RSAKeyValueType {

	@XmlElement(name = "Modulus", required = true)
	protected byte[] modulus;
	@XmlElement(name = "Exponent", required = true)
	protected byte[] exponent;

	/**
	 * Gets the value of the modulus property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getModulus() {
		return modulus;
	}

	/**
	 * Sets the value of the modulus property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setModulus(byte[] value) {
		this.modulus = ((byte[]) value);
	}

	/**
	 * Gets the value of the exponent property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getExponent() {
		return exponent;
	}

	/**
	 * Sets the value of the exponent property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setExponent(byte[] value) {
		this.exponent = ((byte[]) value);
	}

}
