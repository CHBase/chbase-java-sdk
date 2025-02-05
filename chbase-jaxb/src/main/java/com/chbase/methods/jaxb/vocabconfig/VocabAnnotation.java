//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.chbase.methods.jaxb.vocabconfig;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.vocab-config" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A definition of documentation elements.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for VocabAnnotation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VocabAnnotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{urn:com.microsoft.wc.vocab-config}VocabDocumentation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VocabAnnotation", propOrder = { "documentation" })
public class VocabAnnotation {

	@XmlElement(required = true)
	protected VocabDocumentation documentation;

	/**
	 * Gets the value of the documentation property.
	 * 
	 * @return possible object is {@link VocabDocumentation }
	 * 
	 */
	public VocabDocumentation getDocumentation() {
		return documentation;
	}

	/**
	 * Sets the value of the documentation property.
	 * 
	 * @param value
	 *            allowed object is {@link VocabDocumentation }
	 * 
	 */
	public void setDocumentation(VocabDocumentation value) {
		this.documentation = value;
	}

}
