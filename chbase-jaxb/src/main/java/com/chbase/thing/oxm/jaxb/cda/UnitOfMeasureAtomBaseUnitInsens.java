//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:42:07 PM IST 
//


package com.chbase.thing.oxm.jaxb.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasureAtomBaseUnitInsens.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasureAtomBaseUnitInsens">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="RAD"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasureAtomBaseUnitInsens")
@XmlEnum
public enum UnitOfMeasureAtomBaseUnitInsens {

    C,
    K,
    CD,
    G,
    M,
    RAD,
    S;

    public String value() {
        return name();
    }

    public static UnitOfMeasureAtomBaseUnitInsens fromValue(String v) {
        return valueOf(v);
    }

}