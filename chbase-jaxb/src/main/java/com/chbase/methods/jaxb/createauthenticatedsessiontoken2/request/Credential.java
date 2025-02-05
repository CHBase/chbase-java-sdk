//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:11:05 PM PST 
//

package com.chbase.methods.jaxb.createauthenticatedsessiontoken2.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.methods.jaxb.auth.UserPassAuthSessionCred;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Credential in which the authenticated session
 *                     will be in the context of.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The credential serves two purposes.  First,
 *                     it must be verified as valid.  Once verified,
 *                     the credential provides the authentication context
 *                     for the session.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Credential complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Credential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="appserver2" type="{urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2}AppServerCred"/>
 *         &lt;element name="userpassauthsession" type="{urn:com.microsoft.wc.auth}UserPassAuthSessionCred"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credential", propOrder = { "appserver2", "userpassauthsession" })
public class Credential {

	protected AppServerCred appserver2;
	protected UserPassAuthSessionCred userpassauthsession;

	/**
	 * Gets the value of the appserver2 property.
	 * 
	 * @return possible object is {@link AppServerCred }
	 * 
	 */
	public AppServerCred getAppserver2() {
		return appserver2;
	}

	/**
	 * Sets the value of the appserver2 property.
	 * 
	 * @param value
	 *            allowed object is {@link AppServerCred }
	 * 
	 */
	public void setAppserver2(AppServerCred value) {
		this.appserver2 = value;
	}

	/**
	 * Gets the value of the userpassauthsession property.
	 * 
	 * @return possible object is {@link UserPassAuthSessionCred }
	 * 
	 */
	public UserPassAuthSessionCred getUserpassauthsession() {
		return userpassauthsession;
	}

	/**
	 * Sets the value of the userpassauthsession property.
	 * 
	 * @param value
	 *            allowed object is {@link UserPassAuthSessionCred }
	 * 
	 */
	public void setUserpassauthsession(UserPassAuthSessionCred value) {
		this.userpassauthsession = value;
	}

}
