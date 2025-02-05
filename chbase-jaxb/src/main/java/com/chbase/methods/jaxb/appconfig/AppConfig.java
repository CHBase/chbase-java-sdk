//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.appconfig;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.chbase.methods.jaxb.application.AppLargeLogoInfo;
import com.chbase.methods.jaxb.application.AppPersistentTokens;
import com.chbase.methods.jaxb.application.AppSmallLogoInfo;
import com.chbase.methods.jaxb.application.ApplicationAttributes;
import com.chbase.methods.jaxb.application.PublicKeys;
import com.chbase.methods.jaxb.application.StatementInfo;
import com.chbase.methods.jaxb.auth.AuthXml;
import com.chbase.methods.jaxb.location.SupportedInstanceList;
import com.chbase.methods.jaxb.vocab.VocabularyAuthorizations;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificString255;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificStringnz;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
 *                     A complete set of application configuration information.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for AppConfig complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AppConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.types}CultureSpecificString255" maxOccurs="unbounded"/>
 *         &lt;element name="app-auth-required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrict-app-users" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="is-published" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="action-url" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.types}CultureSpecificStringnz" maxOccurs="unbounded"/>
 *         &lt;element name="auth-reason" type="{urn:com.microsoft.wc.types}CultureSpecificStringnz" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain-name" type="{urn:com.microsoft.wc.types}string255" minOccurs="0"/>
 *         &lt;element name="client-service-token" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="large-logo" type="{urn:com.microsoft.wc.application}AppLargeLogoInfo" minOccurs="0"/>
 *         &lt;element name="small-logo" type="{urn:com.microsoft.wc.application}AppSmallLogoInfo" minOccurs="0"/>
 *         &lt;element name="persistent-tokens" type="{urn:com.microsoft.wc.application}AppPersistentTokens" minOccurs="0"/>
 *         &lt;element name="person-online-base-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="person-offline-base-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="privacy-statement" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="terms-of-use" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="dtc-success-message" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="app-attributes" type="{urn:com.microsoft.wc.application}ApplicationAttributes" minOccurs="0"/>
 *         &lt;element name="app-type" type="{urn:com.microsoft.wc.types}string32" minOccurs="0"/>
 *         &lt;element name="master-app-id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="master-app-name" type="{urn:com.microsoft.wc.types}CultureSpecificString255" minOccurs="0"/>
 *         &lt;element name="public-keys" type="{urn:com.microsoft.wc.application}PublicKeys" minOccurs="0"/>
 *         &lt;element name="methods" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="is-master" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="child-base-auth-ceiling" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="child-method-mask-ceiling" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="valid-ip-prefixes" type="{urn:com.microsoft.wc.types}string255nw" minOccurs="0"/>
 *         &lt;element name="vocabulary-authorizations" type="{urn:com.microsoft.wc.vocab}VocabularyAuthorizations" minOccurs="0"/>
 *         &lt;element name="child-vocabulary-authorizations-ceiling" type="{urn:com.microsoft.wc.vocab}VocabularyAuthorizations" minOccurs="0"/>
 *         &lt;element name="supported-instances" type="{urn:com.microsoft.wc.location}SupportedInstanceList" minOccurs="0"/>
 *         &lt;element name="eprep-welcome" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="eprep-description" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppConfig", propOrder = { "id", "name", "appAuthRequired", "restrictAppUsers", "isPublished",
		"actionUrl", "description", "authReason", "domainName", "clientServiceToken", "largeLogo", "smallLogo",
		"persistentTokens", "personOnlineBaseAuthXml", "personOfflineBaseAuthXml", "privacyStatement", "termsOfUse",
		"dtcSuccessMessage", "appAttributes", "appType", "masterAppId", "masterAppName", "publicKeys", "methods",
		"isMaster", "childBaseAuthCeiling", "childMethodMaskCeiling", "createdDate", "updatedDate", "validIpPrefixes",
		"vocabularyAuthorizations", "childVocabularyAuthorizationsCeiling", "supportedInstances", "eprepWelcome",
		"eprepDescription" })
public class AppConfig {

	protected String id;
	@XmlElement(required = true)
	protected List<CultureSpecificString255> name;
	@XmlElement(name = "app-auth-required")
	protected Boolean appAuthRequired;
	@XmlElement(name = "restrict-app-users")
	protected Boolean restrictAppUsers;
	@XmlElement(name = "is-published")
	protected Boolean isPublished;
	@XmlElement(name = "action-url")
	protected String actionUrl;
	@XmlElement(required = true)
	protected List<CultureSpecificStringnz> description;
	@XmlElement(name = "auth-reason")
	protected List<CultureSpecificStringnz> authReason;
	@XmlElement(name = "domain-name")
	protected String domainName;
	@XmlElement(name = "client-service-token")
	protected String clientServiceToken;
	@XmlElement(name = "large-logo")
	protected AppLargeLogoInfo largeLogo;
	@XmlElement(name = "small-logo")
	protected AppSmallLogoInfo smallLogo;
	@XmlElement(name = "persistent-tokens")
	protected AppPersistentTokens persistentTokens;
	@XmlElement(name = "person-online-base-auth-xml")
	protected AuthXml personOnlineBaseAuthXml;
	@XmlElement(name = "person-offline-base-auth-xml")
	protected AuthXml personOfflineBaseAuthXml;
	@XmlElement(name = "privacy-statement")
	protected StatementInfo privacyStatement;
	@XmlElement(name = "terms-of-use")
	protected StatementInfo termsOfUse;
	@XmlElement(name = "dtc-success-message")
	protected StatementInfo dtcSuccessMessage;
	@XmlElement(name = "app-attributes")
	protected ApplicationAttributes appAttributes;
	@XmlElement(name = "app-type")
	protected String appType;
	@XmlElement(name = "master-app-id")
	protected String masterAppId;
	@XmlElement(name = "master-app-name")
	protected CultureSpecificString255 masterAppName;
	@XmlElement(name = "public-keys")
	protected PublicKeys publicKeys;
	protected String methods;
	@XmlElement(name = "is-master")
	protected Boolean isMaster;
	@XmlElement(name = "child-base-auth-ceiling")
	protected AuthXml childBaseAuthCeiling;
	@XmlElement(name = "child-method-mask-ceiling")
	protected String childMethodMaskCeiling;
	@XmlElement(name = "created-date")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createdDate;
	@XmlElement(name = "updated-date")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar updatedDate;
	@XmlElement(name = "valid-ip-prefixes")
	protected String validIpPrefixes;
	@XmlElement(name = "vocabulary-authorizations")
	protected VocabularyAuthorizations vocabularyAuthorizations;
	@XmlElement(name = "child-vocabulary-authorizations-ceiling")
	protected VocabularyAuthorizations childVocabularyAuthorizationsCeiling;
	@XmlElement(name = "supported-instances")
	protected SupportedInstanceList supportedInstances;
	@XmlElement(name = "eprep-welcome")
	protected StatementInfo eprepWelcome;
	@XmlElement(name = "eprep-description")
	protected StatementInfo eprepDescription;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the name property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString255 }
	 * 
	 * 
	 */
	public List<CultureSpecificString255> getName() {
		if (name == null) {
			name = new ArrayList<CultureSpecificString255>();
		}
		return this.name;
	}

	/**
	 * Gets the value of the appAuthRequired property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAppAuthRequired() {
		return appAuthRequired;
	}

	/**
	 * Sets the value of the appAuthRequired property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAppAuthRequired(Boolean value) {
		this.appAuthRequired = value;
	}

	/**
	 * Gets the value of the restrictAppUsers property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRestrictAppUsers() {
		return restrictAppUsers;
	}

	/**
	 * Sets the value of the restrictAppUsers property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRestrictAppUsers(Boolean value) {
		this.restrictAppUsers = value;
	}

	/**
	 * Gets the value of the isPublished property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsPublished() {
		return isPublished;
	}

	/**
	 * Sets the value of the isPublished property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsPublished(Boolean value) {
		this.isPublished = value;
	}

	/**
	 * Gets the value of the actionUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActionUrl() {
		return actionUrl;
	}

	/**
	 * Sets the value of the actionUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActionUrl(String value) {
		this.actionUrl = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the description property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificStringnz }
	 * 
	 * 
	 */
	public List<CultureSpecificStringnz> getDescription() {
		if (description == null) {
			description = new ArrayList<CultureSpecificStringnz>();
		}
		return this.description;
	}

	/**
	 * Gets the value of the authReason property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the authReason property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuthReason().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificStringnz }
	 * 
	 * 
	 */
	public List<CultureSpecificStringnz> getAuthReason() {
		if (authReason == null) {
			authReason = new ArrayList<CultureSpecificStringnz>();
		}
		return this.authReason;
	}

	/**
	 * Gets the value of the domainName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Sets the value of the domainName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDomainName(String value) {
		this.domainName = value;
	}

	/**
	 * Gets the value of the clientServiceToken property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientServiceToken() {
		return clientServiceToken;
	}

	/**
	 * Sets the value of the clientServiceToken property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientServiceToken(String value) {
		this.clientServiceToken = value;
	}

	/**
	 * Gets the value of the largeLogo property.
	 * 
	 * @return possible object is {@link AppLargeLogoInfo }
	 * 
	 */
	public AppLargeLogoInfo getLargeLogo() {
		return largeLogo;
	}

	/**
	 * Sets the value of the largeLogo property.
	 * 
	 * @param value
	 *            allowed object is {@link AppLargeLogoInfo }
	 * 
	 */
	public void setLargeLogo(AppLargeLogoInfo value) {
		this.largeLogo = value;
	}

	/**
	 * Gets the value of the smallLogo property.
	 * 
	 * @return possible object is {@link AppSmallLogoInfo }
	 * 
	 */
	public AppSmallLogoInfo getSmallLogo() {
		return smallLogo;
	}

	/**
	 * Sets the value of the smallLogo property.
	 * 
	 * @param value
	 *            allowed object is {@link AppSmallLogoInfo }
	 * 
	 */
	public void setSmallLogo(AppSmallLogoInfo value) {
		this.smallLogo = value;
	}

	/**
	 * Gets the value of the persistentTokens property.
	 * 
	 * @return possible object is {@link AppPersistentTokens }
	 * 
	 */
	public AppPersistentTokens getPersistentTokens() {
		return persistentTokens;
	}

	/**
	 * Sets the value of the persistentTokens property.
	 * 
	 * @param value
	 *            allowed object is {@link AppPersistentTokens }
	 * 
	 */
	public void setPersistentTokens(AppPersistentTokens value) {
		this.persistentTokens = value;
	}

	/**
	 * Gets the value of the personOnlineBaseAuthXml property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOnlineBaseAuthXml() {
		return personOnlineBaseAuthXml;
	}

	/**
	 * Sets the value of the personOnlineBaseAuthXml property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOnlineBaseAuthXml(AuthXml value) {
		this.personOnlineBaseAuthXml = value;
	}

	/**
	 * Gets the value of the personOfflineBaseAuthXml property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOfflineBaseAuthXml() {
		return personOfflineBaseAuthXml;
	}

	/**
	 * Sets the value of the personOfflineBaseAuthXml property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOfflineBaseAuthXml(AuthXml value) {
		this.personOfflineBaseAuthXml = value;
	}

	/**
	 * Gets the value of the privacyStatement property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getPrivacyStatement() {
		return privacyStatement;
	}

	/**
	 * Sets the value of the privacyStatement property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setPrivacyStatement(StatementInfo value) {
		this.privacyStatement = value;
	}

	/**
	 * Gets the value of the termsOfUse property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getTermsOfUse() {
		return termsOfUse;
	}

	/**
	 * Sets the value of the termsOfUse property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setTermsOfUse(StatementInfo value) {
		this.termsOfUse = value;
	}

	/**
	 * Gets the value of the dtcSuccessMessage property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getDtcSuccessMessage() {
		return dtcSuccessMessage;
	}

	/**
	 * Sets the value of the dtcSuccessMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setDtcSuccessMessage(StatementInfo value) {
		this.dtcSuccessMessage = value;
	}

	/**
	 * Gets the value of the appAttributes property.
	 * 
	 * @return possible object is {@link ApplicationAttributes }
	 * 
	 */
	public ApplicationAttributes getAppAttributes() {
		return appAttributes;
	}

	/**
	 * Sets the value of the appAttributes property.
	 * 
	 * @param value
	 *            allowed object is {@link ApplicationAttributes }
	 * 
	 */
	public void setAppAttributes(ApplicationAttributes value) {
		this.appAttributes = value;
	}

	/**
	 * Gets the value of the appType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppType() {
		return appType;
	}

	/**
	 * Sets the value of the appType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppType(String value) {
		this.appType = value;
	}

	/**
	 * Gets the value of the masterAppId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMasterAppId() {
		return masterAppId;
	}

	/**
	 * Sets the value of the masterAppId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMasterAppId(String value) {
		this.masterAppId = value;
	}

	/**
	 * Gets the value of the masterAppName property.
	 * 
	 * @return possible object is {@link CultureSpecificString255 }
	 * 
	 */
	public CultureSpecificString255 getMasterAppName() {
		return masterAppName;
	}

	/**
	 * Sets the value of the masterAppName property.
	 * 
	 * @param value
	 *            allowed object is {@link CultureSpecificString255 }
	 * 
	 */
	public void setMasterAppName(CultureSpecificString255 value) {
		this.masterAppName = value;
	}

	/**
	 * Gets the value of the publicKeys property.
	 * 
	 * @return possible object is {@link PublicKeys }
	 * 
	 */
	public PublicKeys getPublicKeys() {
		return publicKeys;
	}

	/**
	 * Sets the value of the publicKeys property.
	 * 
	 * @param value
	 *            allowed object is {@link PublicKeys }
	 * 
	 */
	public void setPublicKeys(PublicKeys value) {
		this.publicKeys = value;
	}

	/**
	 * Gets the value of the methods property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMethods() {
		return methods;
	}

	/**
	 * Sets the value of the methods property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMethods(String value) {
		this.methods = value;
	}

	/**
	 * Gets the value of the isMaster property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsMaster() {
		return isMaster;
	}

	/**
	 * Sets the value of the isMaster property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsMaster(Boolean value) {
		this.isMaster = value;
	}

	/**
	 * Gets the value of the childBaseAuthCeiling property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getChildBaseAuthCeiling() {
		return childBaseAuthCeiling;
	}

	/**
	 * Sets the value of the childBaseAuthCeiling property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setChildBaseAuthCeiling(AuthXml value) {
		this.childBaseAuthCeiling = value;
	}

	/**
	 * Gets the value of the childMethodMaskCeiling property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChildMethodMaskCeiling() {
		return childMethodMaskCeiling;
	}

	/**
	 * Sets the value of the childMethodMaskCeiling property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChildMethodMaskCeiling(String value) {
		this.childMethodMaskCeiling = value;
	}

	/**
	 * Gets the value of the createdDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the value of the createdDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreatedDate(XMLGregorianCalendar value) {
		this.createdDate = value;
	}

	/**
	 * Gets the value of the updatedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Sets the value of the updatedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUpdatedDate(XMLGregorianCalendar value) {
		this.updatedDate = value;
	}

	/**
	 * Gets the value of the validIpPrefixes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidIpPrefixes() {
		return validIpPrefixes;
	}

	/**
	 * Sets the value of the validIpPrefixes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidIpPrefixes(String value) {
		this.validIpPrefixes = value;
	}

	/**
	 * Gets the value of the vocabularyAuthorizations property.
	 * 
	 * @return possible object is {@link VocabularyAuthorizations }
	 * 
	 */
	public VocabularyAuthorizations getVocabularyAuthorizations() {
		return vocabularyAuthorizations;
	}

	/**
	 * Sets the value of the vocabularyAuthorizations property.
	 * 
	 * @param value
	 *            allowed object is {@link VocabularyAuthorizations }
	 * 
	 */
	public void setVocabularyAuthorizations(VocabularyAuthorizations value) {
		this.vocabularyAuthorizations = value;
	}

	/**
	 * Gets the value of the childVocabularyAuthorizationsCeiling property.
	 * 
	 * @return possible object is {@link VocabularyAuthorizations }
	 * 
	 */
	public VocabularyAuthorizations getChildVocabularyAuthorizationsCeiling() {
		return childVocabularyAuthorizationsCeiling;
	}

	/**
	 * Sets the value of the childVocabularyAuthorizationsCeiling property.
	 * 
	 * @param value
	 *            allowed object is {@link VocabularyAuthorizations }
	 * 
	 */
	public void setChildVocabularyAuthorizationsCeiling(VocabularyAuthorizations value) {
		this.childVocabularyAuthorizationsCeiling = value;
	}

	/**
	 * Gets the value of the supportedInstances property.
	 * 
	 * @return possible object is {@link SupportedInstanceList }
	 * 
	 */
	public SupportedInstanceList getSupportedInstances() {
		return supportedInstances;
	}

	/**
	 * Sets the value of the supportedInstances property.
	 * 
	 * @param value
	 *            allowed object is {@link SupportedInstanceList }
	 * 
	 */
	public void setSupportedInstances(SupportedInstanceList value) {
		this.supportedInstances = value;
	}

	/**
	 * Gets the value of the eprepWelcome property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getEprepWelcome() {
		return eprepWelcome;
	}

	/**
	 * Sets the value of the eprepWelcome property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setEprepWelcome(StatementInfo value) {
		this.eprepWelcome = value;
	}

	/**
	 * Gets the value of the eprepDescription property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getEprepDescription() {
		return eprepDescription;
	}

	/**
	 * Sets the value of the eprepDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setEprepDescription(StatementInfo value) {
		this.eprepDescription = value;
	}

}
