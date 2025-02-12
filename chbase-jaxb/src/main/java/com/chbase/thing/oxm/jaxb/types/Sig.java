//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:23:59 PM PDT 
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
 *                     A digital signature produced by an application to prove
 *                     possession of a private key.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     Each application server has at least one public key
 *                     associated to its application identifier.  Microsoft
 *                     HealthVault verifies the signature using the public key
 *                     specified via the thumbprint.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Sig complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Sig">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:com.microsoft.wc.types>string1024">
 *       &lt;attribute name="digestMethod" use="required" type="{urn:com.microsoft.wc.types}string16" />
 *       &lt;attribute name="sigMethod" use="required" type="{urn:com.microsoft.wc.types}string16" />
 *       &lt;attribute name="thumbprint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sig", propOrder = { "value" })
public class Sig {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "digestMethod", required = true)
	protected String digestMethod;
	@XmlAttribute(name = "sigMethod", required = true)
	protected String sigMethod;
	@XmlAttribute(name = "thumbprint", required = true)
	protected String thumbprint;

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
	 * Gets the value of the digestMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDigestMethod() {
		return digestMethod;
	}

	/**
	 * Sets the value of the digestMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDigestMethod(String value) {
		this.digestMethod = value;
	}

	/**
	 * Gets the value of the sigMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSigMethod() {
		return sigMethod;
	}

	/**
	 * Sets the value of the sigMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSigMethod(String value) {
		this.sigMethod = value;
	}

	/**
	 * Gets the value of the thumbprint property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThumbprint() {
		return thumbprint;
	}

	/**
	 * Sets the value of the thumbprint property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setThumbprint(String value) {
		this.thumbprint = value;
	}

}
