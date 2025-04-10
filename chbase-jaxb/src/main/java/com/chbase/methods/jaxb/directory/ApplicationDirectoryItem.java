//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.chbase.methods.jaxb.directory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.chbase.methods.jaxb.application.AppLargeLogoInfo;
import com.chbase.methods.jaxb.location.SupportedLocationList;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificExtensionItems;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificString;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificString1024Nw;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificString255Nw;
import com.chbase.thing.oxm.jaxb.types.CultureSpecificUrl;
import com.chbase.thing.oxm.jaxb.types.Guids;

/**
 * <p>
 * Java class for ApplicationDirectoryItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDirectoryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:com.microsoft.wc.directory}DirectoryItemBase"/>
 *         &lt;element name="is-popular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="popularity-rank" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="application-logo" type="{urn:com.microsoft.wc.application}AppLargeLogoInfo" minOccurs="0"/>
 *         &lt;element name="privacy-statement-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terms-of-use-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connection-description" type="{urn:com.microsoft.wc.types}CultureSpecificString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="screenshots" type="{urn:com.microsoft.wc.directory}Screenshots" minOccurs="0"/>
 *         &lt;element name="supported-record-locations" type="{urn:com.microsoft.wc.location}SupportedLocationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationDirectoryItem", propOrder = { "id", "name", "companyInformation", "categories",
		"dataProviderCategories", "shortDescription", "longDescription", "thingTypes", "infoUrl", "facebooklikeUrl",
		"mobilePlatformCollection", "extensionItems", "directoryState", "createdDate", "updatedDate", "isPopular",
		"popularityRank", "applicationLogo", "privacyStatementUrl", "termsOfUseUrl", "connectionDescription",
		"screenshots", "supportedRecordLocations" })
public class ApplicationDirectoryItem {

	@XmlElement(required = true)
	protected String id;
	@XmlElement(required = true)
	protected List<CultureSpecificString255Nw> name;
	@XmlElement(name = "company-information")
	protected CompanyInformation companyInformation;
	@XmlElement(required = true)
	protected DirectoryCategories categories;
	@XmlElement(name = "data-provider-categories")
	protected DirectoryDataProviderCategories dataProviderCategories;
	@XmlElement(name = "short-description", required = true)
	protected List<CultureSpecificString1024Nw> shortDescription;
	@XmlElement(name = "long-description")
	protected List<CultureSpecificString> longDescription;
	@XmlElement(name = "thing-types")
	protected Guids thingTypes;
	@XmlElement(name = "info-url")
	protected List<CultureSpecificUrl> infoUrl;
	@XmlElement(name = "facebooklike-url")
	protected List<CultureSpecificUrl> facebooklikeUrl;
	@XmlElement(name = "mobile-platform-collection")
	protected MobilePlatformCollection mobilePlatformCollection;
	@XmlElement(name = "extension-items")
	protected CultureSpecificExtensionItems extensionItems;
	@XmlElement(name = "directory-state", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger directoryState;
	@XmlElement(name = "created-date")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createdDate;
	@XmlElement(name = "updated-date")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar updatedDate;
	@XmlElement(name = "is-popular")
	protected Boolean isPopular;
	@XmlElement(name = "popularity-rank")
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger popularityRank;
	@XmlElement(name = "application-logo")
	protected AppLargeLogoInfo applicationLogo;
	@XmlElement(name = "privacy-statement-url")
	protected List<CultureSpecificUrl> privacyStatementUrl;
	@XmlElement(name = "terms-of-use-url")
	protected List<CultureSpecificUrl> termsOfUseUrl;
	@XmlElement(name = "connection-description")
	protected List<CultureSpecificString> connectionDescription;
	protected Screenshots screenshots;
	@XmlElement(name = "supported-record-locations")
	protected SupportedLocationList supportedRecordLocations;

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
	 * {@link CultureSpecificString255Nw }
	 * 
	 * 
	 */
	public List<CultureSpecificString255Nw> getName() {
		if (name == null) {
			name = new ArrayList<CultureSpecificString255Nw>();
		}
		return this.name;
	}

	/**
	 * Gets the value of the companyInformation property.
	 * 
	 * @return possible object is {@link CompanyInformation }
	 * 
	 */
	public CompanyInformation getCompanyInformation() {
		return companyInformation;
	}

	/**
	 * Sets the value of the companyInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link CompanyInformation }
	 * 
	 */
	public void setCompanyInformation(CompanyInformation value) {
		this.companyInformation = value;
	}

	/**
	 * Gets the value of the categories property.
	 * 
	 * @return possible object is {@link DirectoryCategories }
	 * 
	 */
	public DirectoryCategories getCategories() {
		return categories;
	}

	/**
	 * Sets the value of the categories property.
	 * 
	 * @param value
	 *            allowed object is {@link DirectoryCategories }
	 * 
	 */
	public void setCategories(DirectoryCategories value) {
		this.categories = value;
	}

	/**
	 * Gets the value of the dataProviderCategories property.
	 * 
	 * @return possible object is {@link DirectoryDataProviderCategories }
	 * 
	 */
	public DirectoryDataProviderCategories getDataProviderCategories() {
		return dataProviderCategories;
	}

	/**
	 * Sets the value of the dataProviderCategories property.
	 * 
	 * @param value
	 *            allowed object is {@link DirectoryDataProviderCategories }
	 * 
	 */
	public void setDataProviderCategories(DirectoryDataProviderCategories value) {
		this.dataProviderCategories = value;
	}

	/**
	 * Gets the value of the shortDescription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the shortDescription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getShortDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString1024Nw }
	 * 
	 * 
	 */
	public List<CultureSpecificString1024Nw> getShortDescription() {
		if (shortDescription == null) {
			shortDescription = new ArrayList<CultureSpecificString1024Nw>();
		}
		return this.shortDescription;
	}

	/**
	 * Gets the value of the longDescription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the longDescription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLongDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString }
	 * 
	 * 
	 */
	public List<CultureSpecificString> getLongDescription() {
		if (longDescription == null) {
			longDescription = new ArrayList<CultureSpecificString>();
		}
		return this.longDescription;
	}

	/**
	 * Gets the value of the thingTypes property.
	 * 
	 * @return possible object is {@link Guids }
	 * 
	 */
	public Guids getThingTypes() {
		return thingTypes;
	}

	/**
	 * Sets the value of the thingTypes property.
	 * 
	 * @param value
	 *            allowed object is {@link Guids }
	 * 
	 */
	public void setThingTypes(Guids value) {
		this.thingTypes = value;
	}

	/**
	 * Gets the value of the infoUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the infoUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInfoUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getInfoUrl() {
		if (infoUrl == null) {
			infoUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.infoUrl;
	}

	/**
	 * Gets the value of the facebooklikeUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the facebooklikeUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFacebooklikeUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getFacebooklikeUrl() {
		if (facebooklikeUrl == null) {
			facebooklikeUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.facebooklikeUrl;
	}

	/**
	 * Gets the value of the mobilePlatformCollection property.
	 * 
	 * @return possible object is {@link MobilePlatformCollection }
	 * 
	 */
	public MobilePlatformCollection getMobilePlatformCollection() {
		return mobilePlatformCollection;
	}

	/**
	 * Sets the value of the mobilePlatformCollection property.
	 * 
	 * @param value
	 *            allowed object is {@link MobilePlatformCollection }
	 * 
	 */
	public void setMobilePlatformCollection(MobilePlatformCollection value) {
		this.mobilePlatformCollection = value;
	}

	/**
	 * Gets the value of the extensionItems property.
	 * 
	 * @return possible object is {@link CultureSpecificExtensionItems }
	 * 
	 */
	public CultureSpecificExtensionItems getExtensionItems() {
		return extensionItems;
	}

	/**
	 * Sets the value of the extensionItems property.
	 * 
	 * @param value
	 *            allowed object is {@link CultureSpecificExtensionItems }
	 * 
	 */
	public void setExtensionItems(CultureSpecificExtensionItems value) {
		this.extensionItems = value;
	}

	/**
	 * Gets the value of the directoryState property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDirectoryState() {
		return directoryState;
	}

	/**
	 * Sets the value of the directoryState property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDirectoryState(BigInteger value) {
		this.directoryState = value;
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
	 * Gets the value of the isPopular property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsPopular() {
		return isPopular;
	}

	/**
	 * Sets the value of the isPopular property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsPopular(Boolean value) {
		this.isPopular = value;
	}

	/**
	 * Gets the value of the popularityRank property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getPopularityRank() {
		return popularityRank;
	}

	/**
	 * Sets the value of the popularityRank property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setPopularityRank(BigInteger value) {
		this.popularityRank = value;
	}

	/**
	 * Gets the value of the applicationLogo property.
	 * 
	 * @return possible object is {@link AppLargeLogoInfo }
	 * 
	 */
	public AppLargeLogoInfo getApplicationLogo() {
		return applicationLogo;
	}

	/**
	 * Sets the value of the applicationLogo property.
	 * 
	 * @param value
	 *            allowed object is {@link AppLargeLogoInfo }
	 * 
	 */
	public void setApplicationLogo(AppLargeLogoInfo value) {
		this.applicationLogo = value;
	}

	/**
	 * Gets the value of the privacyStatementUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the privacyStatementUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPrivacyStatementUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getPrivacyStatementUrl() {
		if (privacyStatementUrl == null) {
			privacyStatementUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.privacyStatementUrl;
	}

	/**
	 * Gets the value of the termsOfUseUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the termsOfUseUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTermsOfUseUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getTermsOfUseUrl() {
		if (termsOfUseUrl == null) {
			termsOfUseUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.termsOfUseUrl;
	}

	/**
	 * Gets the value of the connectionDescription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the connectionDescription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getConnectionDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString }
	 * 
	 * 
	 */
	public List<CultureSpecificString> getConnectionDescription() {
		if (connectionDescription == null) {
			connectionDescription = new ArrayList<CultureSpecificString>();
		}
		return this.connectionDescription;
	}

	/**
	 * Gets the value of the screenshots property.
	 * 
	 * @return possible object is {@link Screenshots }
	 * 
	 */
	public Screenshots getScreenshots() {
		return screenshots;
	}

	/**
	 * Sets the value of the screenshots property.
	 * 
	 * @param value
	 *            allowed object is {@link Screenshots }
	 * 
	 */
	public void setScreenshots(Screenshots value) {
		this.screenshots = value;
	}

	/**
	 * Gets the value of the supportedRecordLocations property.
	 * 
	 * @return possible object is {@link SupportedLocationList }
	 * 
	 */
	public SupportedLocationList getSupportedRecordLocations() {
		return supportedRecordLocations;
	}

	/**
	 * Sets the value of the supportedRecordLocations property.
	 * 
	 * @param value
	 *            allowed object is {@link SupportedLocationList }
	 * 
	 */
	public void setSupportedRecordLocations(SupportedLocationList value) {
		this.supportedRecordLocations = value;
	}

}
