//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:17 AM PST 
//

package com.chbase.thing.oxm.jaxb.explanationofbenefits;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Organization;
import com.chbase.thing.oxm.jaxb.base.Person;
import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.explanation-of-benefits"&gt;
 *                         An Explanation of Benefits (EOB) that contains information about an insurance claim.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date-submitted" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="patient" type="{urn:com.microsoft.wc.thing.types}person"/>
 *         &lt;element name="relationship-to-member" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="plan" type="{urn:com.microsoft.wc.thing.types}Organization"/>
 *         &lt;element name="group-id" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="member-id" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="claim-type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="claim-id" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="submitted-by" type="{urn:com.microsoft.wc.thing.types}Organization"/>
 *         &lt;element name="provider" type="{urn:com.microsoft.wc.thing.types}Organization"/>
 *         &lt;element name="currency" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="claim-totals" type="{urn:com.microsoft.wc.thing.explanation-of-benefits}ClaimAmounts"/>
 *         &lt;element name="services" type="{urn:com.microsoft.wc.thing.explanation-of-benefits}Service" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dateSubmitted", "patient", "relationshipToMember", "plan", "groupId", "memberId",
		"claimType", "claimId", "submittedBy", "provider", "currency", "claimTotals", "services" })
@XmlRootElement(name = "explanation-of-benefits")
public class ExplanationOfBenefits {
	public static String typeId = "356fbba9-e0c9-4f4f-b0d9-4594f2490d2f";

	@XmlElement(name = "date-submitted", required = true)
	protected DateTime dateSubmitted;
	@XmlElement(required = true)
	protected Person patient;
	@XmlElement(name = "relationship-to-member")
	protected CodableValue relationshipToMember;
	@XmlElement(required = true)
	protected Organization plan;
	@XmlElement(name = "group-id")
	protected String groupId;
	@XmlElement(name = "member-id", required = true)
	protected String memberId;
	@XmlElement(name = "claim-type", required = true)
	protected CodableValue claimType;
	@XmlElement(name = "claim-id", required = true)
	protected String claimId;
	@XmlElement(name = "submitted-by", required = true)
	protected Organization submittedBy;
	@XmlElement(required = true)
	protected Organization provider;
	@XmlElement(required = true)
	protected CodableValue currency;
	@XmlElement(name = "claim-totals", required = true)
	protected ClaimAmounts claimTotals;
	@XmlElement(required = true)
	protected List<Service> services;

	/**
	 * Gets the value of the dateSubmitted property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getDateSubmitted() {
		return dateSubmitted;
	}

	/**
	 * Sets the value of the dateSubmitted property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setDateSubmitted(DateTime value) {
		this.dateSubmitted = value;
	}

	/**
	 * Gets the value of the patient property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getPatient() {
		return patient;
	}

	/**
	 * Sets the value of the patient property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setPatient(Person value) {
		this.patient = value;
	}

	/**
	 * Gets the value of the relationshipToMember property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getRelationshipToMember() {
		return relationshipToMember;
	}

	/**
	 * Sets the value of the relationshipToMember property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setRelationshipToMember(CodableValue value) {
		this.relationshipToMember = value;
	}

	/**
	 * Gets the value of the plan property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getPlan() {
		return plan;
	}

	/**
	 * Sets the value of the plan property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setPlan(Organization value) {
		this.plan = value;
	}

	/**
	 * Gets the value of the groupId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * Sets the value of the groupId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupId(String value) {
		this.groupId = value;
	}

	/**
	 * Gets the value of the memberId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * Sets the value of the memberId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMemberId(String value) {
		this.memberId = value;
	}

	/**
	 * Gets the value of the claimType property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getClaimType() {
		return claimType;
	}

	/**
	 * Sets the value of the claimType property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setClaimType(CodableValue value) {
		this.claimType = value;
	}

	/**
	 * Gets the value of the claimId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClaimId() {
		return claimId;
	}

	/**
	 * Sets the value of the claimId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClaimId(String value) {
		this.claimId = value;
	}

	/**
	 * Gets the value of the submittedBy property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getSubmittedBy() {
		return submittedBy;
	}

	/**
	 * Sets the value of the submittedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setSubmittedBy(Organization value) {
		this.submittedBy = value;
	}

	/**
	 * Gets the value of the provider property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getProvider() {
		return provider;
	}

	/**
	 * Sets the value of the provider property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setProvider(Organization value) {
		this.provider = value;
	}

	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setCurrency(CodableValue value) {
		this.currency = value;
	}

	/**
	 * Gets the value of the claimTotals property.
	 * 
	 * @return possible object is {@link ClaimAmounts }
	 * 
	 */
	public ClaimAmounts getClaimTotals() {
		return claimTotals;
	}

	/**
	 * Sets the value of the claimTotals property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimAmounts }
	 * 
	 */
	public void setClaimTotals(ClaimAmounts value) {
		this.claimTotals = value;
	}

	/**
	 * Gets the value of the services property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the services property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getServices().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Service }
	 * 
	 * 
	 */
	public List<Service> getServices() {
		if (services == null) {
			services = new ArrayList<Service>();
		}
		return this.services;
	}

}
