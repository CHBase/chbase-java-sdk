//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:43:24 AM PST 
//

package com.chbase.thing.oxm.jaxb.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     The applications to create credential tokens for.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     Each application will be issued a unique token that has a
 *                     limited lifetime.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for AppInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AppInfo">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:com.microsoft.wc.types>guid">
 *       &lt;attribute name="is-multi-record-app" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppInfo", propOrder = { "value" })
public class AppInfo {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "is-multi-record-app")
	protected Boolean isMultiRecordApp;

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the isMultiRecordApp property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsMultiRecordApp() {
		return isMultiRecordApp;
	}

	/**
	 * Sets the value of the isMultiRecordApp property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsMultiRecordApp(Boolean value) {
		this.isMultiRecordApp = value;
	}

}
