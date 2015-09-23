//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 03:42:07 PM IST 
//


package com.chbase.thing.oxm.jaxb.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 is an abstract generalization
 *                 for all data types (1) whose value set has an order
 *                 relation (less-or-equal) and (2) where difference is
 *                 defined in all of the data type's totally ordered value
 *                 subsets.  The quantity type abstraction is needed in
 *                 defining certain other types, such as the interval and
 *                 the probability distribution.
 *             
 * 
 * <p>Java class for QTY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTY">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY")
@XmlSeeAlso({
    RTOPQPQ.class,
    TS.class,
    MO.class,
    RTOMOPQ.class,
    PQ.class,
    REAL.class,
    INT.class,
    RTOQTYQTY.class
})
public abstract class QTY
    extends ANY
{


}
