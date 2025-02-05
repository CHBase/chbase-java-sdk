//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:29 AM PST 
//

package com.chbase.thing.oxm.jaxb.labtestresults;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Organization;

/**
 * <p>
 * Java class for lab-test-results-group-type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="lab-test-results-group-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group-name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="laboratory-name" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="sub-groups" type="{urn:com.microsoft.wc.thing.lab-test-results}lab-test-results-group-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="results" type="{urn:com.microsoft.wc.thing.lab-test-results}lab-test-result-type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lab-test-results-group-type", propOrder = { "groupName", "laboratoryName", "status", "subGroups",
		"results" })
public class LabTestResultsGroupType {

	@XmlElement(name = "group-name", required = true)
	protected CodableValue groupName;
	@XmlElement(name = "laboratory-name")
	protected Organization laboratoryName;
	protected CodableValue status;
	@XmlElement(name = "sub-groups")
	protected List<LabTestResultsGroupType> subGroups;
	protected List<LabTestResultType> results;

	/**
	 * Gets the value of the groupName property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getGroupName() {
		return groupName;
	}

	/**
	 * Sets the value of the groupName property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setGroupName(CodableValue value) {
		this.groupName = value;
	}

	/**
	 * Gets the value of the laboratoryName property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getLaboratoryName() {
		return laboratoryName;
	}

	/**
	 * Sets the value of the laboratoryName property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setLaboratoryName(Organization value) {
		this.laboratoryName = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setStatus(CodableValue value) {
		this.status = value;
	}

	/**
	 * Gets the value of the subGroups property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the subGroups property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSubGroups().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LabTestResultsGroupType }
	 * 
	 * 
	 */
	public List<LabTestResultsGroupType> getSubGroups() {
		if (subGroups == null) {
			subGroups = new ArrayList<LabTestResultsGroupType>();
		}
		return this.subGroups;
	}

	/**
	 * Gets the value of the results property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the results property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getResults().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LabTestResultType }
	 * 
	 * 
	 */
	public List<LabTestResultType> getResults() {
		if (results == null) {
			results = new ArrayList<LabTestResultType>();
		}
		return this.results;
	}

}
