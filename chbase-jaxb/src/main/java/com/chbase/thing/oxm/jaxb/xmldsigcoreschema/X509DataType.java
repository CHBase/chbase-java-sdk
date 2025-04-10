//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.chbase.thing.oxm.jaxb.xmldsigcoreschema;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for X509DataType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="X509DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element name="X509IssuerSerial" type="{}X509IssuerSerialType"/>
 *           &lt;element name="X509SKI" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="X509CRL" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;any/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509DataType", propOrder = { "x509IssuerSerialOrX509SKIOrX509SubjectName" })
public class X509DataType {

	@XmlElementRefs({ @XmlElementRef(name = "X509CRL", namespace = "", type = JAXBElement.class),
			@XmlElementRef(name = "X509Certificate", namespace = "", type = JAXBElement.class),
			@XmlElementRef(name = "X509IssuerSerial", namespace = "", type = JAXBElement.class),
			@XmlElementRef(name = "X509SKI", namespace = "", type = JAXBElement.class),
			@XmlElementRef(name = "X509SubjectName", namespace = "", type = JAXBElement.class) })
	@XmlAnyElement(lax = true)
	protected List<Object> x509IssuerSerialOrX509SKIOrX509SubjectName;

	/**
	 * Gets the value of the x509IssuerSerialOrX509SKIOrX509SubjectName
	 * property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the
	 * x509IssuerSerialOrX509SKIOrX509SubjectName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getX509IssuerSerialOrX509SKIOrX509SubjectName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link byte[]}{@code >} {@link Object }
	 * {@link JAXBElement }{@code <}{@link byte[]}{@code >} {@link Element }
	 * {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
	 * {@link JAXBElement }{@code <}{@link byte[]}{@code >} {@link JAXBElement }
	 * {@code <}{@link String }{@code >}
	 * 
	 * 
	 */
	public List<Object> getX509IssuerSerialOrX509SKIOrX509SubjectName() {
		if (x509IssuerSerialOrX509SKIOrX509SubjectName == null) {
			x509IssuerSerialOrX509SKIOrX509SubjectName = new ArrayList<Object>();
		}
		return this.x509IssuerSerialOrX509SKIOrX509SubjectName;
	}

}
