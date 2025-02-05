//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:42:07 PM IST 
//


package com.chbase.thing.oxm.jaxb.cda;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntravascularRoute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravascularRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HEMODIFF"/>
 *     &lt;enumeration value="IVASCINFUS"/>
 *     &lt;enumeration value="HEMOPORT"/>
 *     &lt;enumeration value="IVASCINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravascularRoute")
@XmlEnum
public enum IntravascularRoute {

    HEMODIFF,
    IVASCINFUS,
    HEMOPORT,
    IVASCINJ;

    public String value() {
        return name();
    }

    public static IntravascularRoute fromValue(String v) {
        return valueOf(v);
    }

}
