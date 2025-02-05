//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.application;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
 *                     The CultureSpecific... classes are intended for use with data that can
 *                     be localized for one or more languages and cultures.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
 *                     The CultureSpecific... classes should be upward compatibile with the
 *                     base types.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for CultureSpecificAppLargeLogo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CultureSpecificAppLargeLogo">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:com.microsoft.wc.application>AppLargeLogo">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CultureSpecificAppLargeLogo", propOrder = { "value" })
public class CultureSpecificAppLargeLogo {

	@XmlValue
	protected byte[] value;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"/&gt;
	 * </pre>
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"/&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
	 *                                 This represents the language and culture of the data in the
	 *                                 element, such as "en-us" or "fr-ca".
	 *                             &lt;/summary&gt;
	 * </pre>
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
	 *                                 In a typical use, an instance of an element with no xml:lang
	 *                                 attribute specified is treated as the default entry. Only one
	 *                                 default entry is typically allowed.
	 *                             &lt;/remarks&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

}
