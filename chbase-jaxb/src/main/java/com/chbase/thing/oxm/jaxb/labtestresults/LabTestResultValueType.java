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
import com.chbase.thing.oxm.jaxb.base.GeneralMeasurement;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:lab="urn:com.microsoft.wc.thing.lab-test-results" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                    A clinical value within a laboratory result.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:lab="urn:com.microsoft.wc.thing.lab-test-results" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     This type is define a clinical value within a laboratory result, 
 *                     including value, unit, reference and toxic ranges.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for lab-test-result-value-type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="lab-test-result-value-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurement" type="{urn:com.microsoft.wc.thing.types}general-measurement"/>
 *         &lt;element name="ranges" type="{urn:com.microsoft.wc.thing.lab-test-results}test-result-range" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flag" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lab-test-result-value-type", propOrder = { "measurement", "ranges", "flag" })
public class LabTestResultValueType {

	@XmlElement(required = true)
	protected GeneralMeasurement measurement;
	protected List<TestResultRange> ranges;
	protected List<CodableValue> flag;

	/**
	 * Gets the value of the measurement property.
	 * 
	 * @return possible object is {@link GeneralMeasurement }
	 * 
	 */
	public GeneralMeasurement getMeasurement() {
		return measurement;
	}

	/**
	 * Sets the value of the measurement property.
	 * 
	 * @param value
	 *            allowed object is {@link GeneralMeasurement }
	 * 
	 */
	public void setMeasurement(GeneralMeasurement value) {
		this.measurement = value;
	}

	/**
	 * Gets the value of the ranges property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the ranges property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRanges().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TestResultRange }
	 * 
	 * 
	 */
	public List<TestResultRange> getRanges() {
		if (ranges == null) {
			ranges = new ArrayList<TestResultRange>();
		}
		return this.ranges;
	}

	/**
	 * Gets the value of the flag property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the flag property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFlag().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getFlag() {
		if (flag == null) {
			flag = new ArrayList<CodableValue>();
		}
		return this.flag;
	}

}
