//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.chbase.methods.jaxb.auth;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.microsoft.hsg.methods.jaxb.auth
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Auth_QNAME = new QName("urn:com.microsoft.wc.auth", "auth");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.microsoft.hsg.methods.jaxb.auth
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link TextualPermissions }
	 * 
	 */
	public TextualPermissions createTextualPermissions() {
		return new TextualPermissions();
	}

	/**
	 * Create an instance of {@link SimplePassportCredential }
	 * 
	 */
	public SimplePassportCredential createSimplePassportCredential() {
		return new SimplePassportCredential();
	}

	/**
	 * Create an instance of {@link UserPassCred }
	 * 
	 */
	public UserPassCred createUserPassCred() {
		return new UserPassCred();
	}

	/**
	 * Create an instance of {@link TextualRule }
	 * 
	 */
	public TextualRule createTextualRule() {
		return new TextualRule();
	}

	/**
	 * Create an instance of {@link AuthSessionCredential }
	 * 
	 */
	public AuthSessionCredential createAuthSessionCredential() {
		return new AuthSessionCredential();
	}

	/**
	 * Create an instance of {@link SimpleCardSpaceCredential }
	 * 
	 */
	public SimpleCardSpaceCredential createSimpleCardSpaceCredential() {
		return new SimpleCardSpaceCredential();
	}

	/**
	 * Create an instance of {@link AuthXml }
	 * 
	 */
	public AuthXml createAuthXml() {
		return new AuthXml();
	}

	/**
	 * Create an instance of {@link Auth }
	 * 
	 */
	public Auth createAuth() {
		return new Auth();
	}

	/**
	 * Create an instance of {@link Set }
	 * 
	 */
	public Set createSet() {
		return new Set();
	}

	/**
	 * Create an instance of {@link AuthSessionSubCredential }
	 * 
	 */
	public AuthSessionSubCredential createAuthSessionSubCredential() {
		return new AuthSessionSubCredential();
	}

	/**
	 * Create an instance of {@link Token }
	 * 
	 */
	public Token createToken() {
		return new Token();
	}

	/**
	 * Create an instance of {@link SimpleOpenIdCredential }
	 * 
	 */
	public SimpleOpenIdCredential createSimpleOpenIdCredential() {
		return new SimpleOpenIdCredential();
	}

	/**
	 * Create an instance of {@link SimpleUserPassCredential }
	 * 
	 */
	public SimpleUserPassCredential createSimpleUserPassCredential() {
		return new SimpleUserPassCredential();
	}

	/**
	 * Create an instance of {@link FederatingCred }
	 * 
	 */
	public FederatingCred createFederatingCred() {
		return new FederatingCred();
	}

	/**
	 * Create an instance of {@link UserPassAuthSessionCred }
	 * 
	 */
	public UserPassAuthSessionCred createUserPassAuthSessionCred() {
		return new UserPassAuthSessionCred();
	}

	/**
	 * Create an instance of {@link Rule }
	 * 
	 */
	public Rule createRule() {
		return new Rule();
	}

	/**
	 * Create an instance of {@link AssociatedCredInfo }
	 * 
	 */
	public AssociatedCredInfo createAssociatedCredInfo() {
		return new AssociatedCredInfo();
	}

	/**
	 * Create an instance of {@link Rules }
	 * 
	 */
	public Rules createRules() {
		return new Rules();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}
	 * }
	 * 
	 */
	@XmlElementDecl(namespace = "urn:com.microsoft.wc.auth", name = "auth")
	public JAXBElement<Auth> createAuth(Auth value) {
		return new JAXBElement<Auth>(_Auth_QNAME, Auth.class, null, value);
	}

}
