//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:45:28 PM IST 
//


package com.chbase.thing.oxm.jaxb.sdtc;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.chbase.thing.oxm.jaxb.ccd.BL;
import com.chbase.thing.oxm.jaxb.ccd.CE;
import com.chbase.thing.oxm.jaxb.ccd.II;
import com.chbase.thing.oxm.jaxb.ccd.TS;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hl7.sdtc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Id_QNAME = new QName("urn:hl7-org:sdtc", "id");
    private final static QName _DischargeDispositionCode_QNAME = new QName("urn:hl7-org:sdtc", "dischargeDispositionCode");
    private final static QName _RaceCode_QNAME = new QName("urn:hl7-org:sdtc", "raceCode");
    private final static QName _BirthTime_QNAME = new QName("urn:hl7-org:sdtc", "birthTime");
    private final static QName _DeceasedInd_QNAME = new QName("urn:hl7-org:sdtc", "deceasedInd");
    private final static QName _DeceasedTime_QNAME = new QName("urn:hl7-org:sdtc", "deceasedTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hl7.sdtc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SdtcAssociatedEntity }
     * 
     */
    public SdtcAssociatedEntity createSdtcAssociatedEntity() {
        return new SdtcAssociatedEntity();
    }

    /**
     * Create an instance of {@link SdtcRelatedEntity }
     * 
     */
    public SdtcRelatedEntity createSdtcRelatedEntity() {
        return new SdtcRelatedEntity();
    }

    /**
     * Create an instance of {@link SdtcPatient }
     * 
     */
    public SdtcPatient createSdtcPatient() {
        return new SdtcPatient();
    }

    /**
     * Create an instance of {@link SdtcAssignedEntity }
     * 
     */
    public SdtcAssignedEntity createSdtcAssignedEntity() {
        return new SdtcAssignedEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link II }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "id")
    public JAXBElement<II> createId(II value) {
        return new JAXBElement<II>(_Id_QNAME, II.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "dischargeDispositionCode")
    public JAXBElement<CE> createDischargeDispositionCode(CE value) {
        return new JAXBElement<CE>(_DischargeDispositionCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "raceCode")
    public JAXBElement<CE> createRaceCode(CE value) {
        return new JAXBElement<CE>(_RaceCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "birthTime")
    public JAXBElement<TS> createBirthTime(TS value) {
        return new JAXBElement<TS>(_BirthTime_QNAME, TS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "deceasedInd")
    public JAXBElement<BL> createDeceasedInd(BL value) {
        return new JAXBElement<BL>(_DeceasedInd_QNAME, BL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "deceasedTime")
    public JAXBElement<TS> createDeceasedTime(TS value) {
        return new JAXBElement<TS>(_DeceasedTime_QNAME, TS.class, null, value);
    }

}
