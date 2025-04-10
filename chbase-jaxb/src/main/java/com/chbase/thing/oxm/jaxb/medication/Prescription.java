//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:51 AM PST 
//

package com.chbase.thing.oxm.jaxb.medication;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.GeneralMeasurement;
import com.chbase.thing.oxm.jaxb.base.Person;
import com.chbase.thing.oxm.jaxb.dates.ApproxDateTime;
import com.chbase.thing.oxm.jaxb.dates.Date;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a medication prescription.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Prescription complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Prescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescribed-by" type="{urn:com.microsoft.wc.thing.types}person"/>
 *         &lt;element name="date-prescribed" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="amount-prescribed" type="{urn:com.microsoft.wc.thing.types}general-measurement" minOccurs="0"/>
 *         &lt;element name="substitution" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="refills" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="days-supply" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="prescription-expiration" type="{urn:com.microsoft.wc.dates}date" minOccurs="0"/>
 *         &lt;element name="instructions" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prescription", propOrder = { "prescribedBy", "datePrescribed", "amountPrescribed", "substitution",
		"refills", "daysSupply", "prescriptionExpiration", "instructions" })
public class Prescription {

	@XmlElement(name = "prescribed-by", required = true)
	protected Person prescribedBy;
	@XmlElement(name = "date-prescribed")
	protected ApproxDateTime datePrescribed;
	@XmlElement(name = "amount-prescribed")
	protected GeneralMeasurement amountPrescribed;
	protected CodableValue substitution;
	protected Integer refills;
	@XmlElement(name = "days-supply")
	protected Integer daysSupply;
	@XmlElement(name = "prescription-expiration")
	protected Date prescriptionExpiration;
	protected CodableValue instructions;

	/**
	 * Gets the value of the prescribedBy property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getPrescribedBy() {
		return prescribedBy;
	}

	/**
	 * Sets the value of the prescribedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setPrescribedBy(Person value) {
		this.prescribedBy = value;
	}

	/**
	 * Gets the value of the datePrescribed property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getDatePrescribed() {
		return datePrescribed;
	}

	/**
	 * Sets the value of the datePrescribed property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setDatePrescribed(ApproxDateTime value) {
		this.datePrescribed = value;
	}

	/**
	 * Gets the value of the amountPrescribed property.
	 * 
	 * @return possible object is {@link GeneralMeasurement }
	 * 
	 */
	public GeneralMeasurement getAmountPrescribed() {
		return amountPrescribed;
	}

	/**
	 * Sets the value of the amountPrescribed property.
	 * 
	 * @param value
	 *            allowed object is {@link GeneralMeasurement }
	 * 
	 */
	public void setAmountPrescribed(GeneralMeasurement value) {
		this.amountPrescribed = value;
	}

	/**
	 * Gets the value of the substitution property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getSubstitution() {
		return substitution;
	}

	/**
	 * Sets the value of the substitution property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setSubstitution(CodableValue value) {
		this.substitution = value;
	}

	/**
	 * Gets the value of the refills property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRefills() {
		return refills;
	}

	/**
	 * Sets the value of the refills property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRefills(Integer value) {
		this.refills = value;
	}

	/**
	 * Gets the value of the daysSupply property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDaysSupply() {
		return daysSupply;
	}

	/**
	 * Sets the value of the daysSupply property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDaysSupply(Integer value) {
		this.daysSupply = value;
	}

	/**
	 * Gets the value of the prescriptionExpiration property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getPrescriptionExpiration() {
		return prescriptionExpiration;
	}

	/**
	 * Sets the value of the prescriptionExpiration property.
	 * 
	 * @param value
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setPrescriptionExpiration(Date value) {
		this.prescriptionExpiration = value;
	}

	/**
	 * Gets the value of the instructions property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getInstructions() {
		return instructions;
	}

	/**
	 * Sets the value of the instructions property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setInstructions(CodableValue value) {
		this.instructions = value;
	}

}
