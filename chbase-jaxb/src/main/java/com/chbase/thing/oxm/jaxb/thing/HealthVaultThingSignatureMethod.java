//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.thing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for HealthVaultThingSignatureMethod.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="HealthVaultThingSignatureMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HVSignatureMethod1"/>
 *     &lt;enumeration value="HVSignatureMethod2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HealthVaultThingSignatureMethod")
@XmlEnum
public enum HealthVaultThingSignatureMethod {

	@XmlEnumValue("HVSignatureMethod1") HV_SIGNATURE_METHOD_1(
			"HVSignatureMethod1"), @XmlEnumValue("HVSignatureMethod2") HV_SIGNATURE_METHOD_2("HVSignatureMethod2");
	private final String value;

	HealthVaultThingSignatureMethod(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static HealthVaultThingSignatureMethod fromValue(String v) {
		for (HealthVaultThingSignatureMethod c : HealthVaultThingSignatureMethod.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
