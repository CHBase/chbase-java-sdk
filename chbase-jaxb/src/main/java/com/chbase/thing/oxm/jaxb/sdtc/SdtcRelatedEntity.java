//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:45:28 PM IST 
//


package com.chbase.thing.oxm.jaxb.sdtc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.ccd.POCDMT000040RelatedEntity;


/**
 * <p>Java class for SdtcRelatedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SdtcRelatedEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}POCD_MT000040.RelatedEntity">
 *       &lt;sequence>
 *         &lt;element name="patient" type="{urn:hl7-org:sdtc}SdtcPatient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtcRelatedEntity", propOrder = {
    "patient"
})
public class SdtcRelatedEntity
    extends POCDMT000040RelatedEntity
{

    protected SdtcPatient patient;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link SdtcPatient }
     *     
     */
    public SdtcPatient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtcPatient }
     *     
     */
    public void setPatient(SdtcPatient value) {
        this.patient = value;
    }

}
