//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:45:28 PM IST 
//


package com.chbase.thing.oxm.jaxb.ccd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryAddressLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryAddressLine">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DAL"/>
 *     &lt;enumeration value="DINST"/>
 *     &lt;enumeration value="DINSTA"/>
 *     &lt;enumeration value="DINSTQ"/>
 *     &lt;enumeration value="DMOD"/>
 *     &lt;enumeration value="DMODID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryAddressLine")
@XmlEnum
public enum DeliveryAddressLine {

    DAL,
    DINST,
    DINSTA,
    DINSTQ,
    DMOD,
    DMODID;

    public String value() {
        return name();
    }

    public static DeliveryAddressLine fromValue(String v) {
        return valueOf(v);
    }

}
