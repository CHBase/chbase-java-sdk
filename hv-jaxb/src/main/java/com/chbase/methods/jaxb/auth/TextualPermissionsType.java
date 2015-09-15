//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.chbase.methods.jaxb.auth;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TextualPermissionsType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TextualPermissionsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Custom"/>
 *     &lt;enumeration value="ReadAll"/>
 *     &lt;enumeration value="UpdateAll"/>
 *     &lt;enumeration value="CreateAll"/>
 *     &lt;enumeration value="DeleteAll"/>
 *     &lt;enumeration value="ReadUpdateAll"/>
 *     &lt;enumeration value="ReadCreateAll"/>
 *     &lt;enumeration value="UpdateCreateAll"/>
 *     &lt;enumeration value="ReadUpdateCreateAll"/>
 *     &lt;enumeration value="ReadUpdateCreateDeleteAll"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextualPermissionsType")
@XmlEnum
public enum TextualPermissionsType {

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("Custom") CUSTOM("Custom"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("ReadAll") READ_ALL("ReadAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("UpdateAll") UPDATE_ALL("UpdateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("CreateAll") CREATE_ALL("CreateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("DeleteAll") DELETE_ALL("DeleteAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("ReadUpdateAll") READ_UPDATE_ALL("ReadUpdateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("ReadCreateAll") READ_CREATE_ALL("ReadCreateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("UpdateCreateAll") UPDATE_CREATE_ALL("UpdateCreateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("ReadUpdateCreateAll") READ_UPDATE_CREATE_ALL("ReadUpdateCreateAll"),

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("ReadUpdateCreateDeleteAll") READ_UPDATE_CREATE_DELETE_ALL("ReadUpdateCreateDeleteAll");
	private final String value;

	TextualPermissionsType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static TextualPermissionsType fromValue(String v) {
		for (TextualPermissionsType c : TextualPermissionsType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}