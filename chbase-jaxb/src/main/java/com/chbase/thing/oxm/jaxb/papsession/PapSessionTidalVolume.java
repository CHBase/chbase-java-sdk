//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:03 AM PST 
//

package com.chbase.thing.oxm.jaxb.papsession;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.VolumeValue;

/**
 * <p>
 * Java class for pap-session-tidal-volume complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="pap-session-tidal-volume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mean" type="{urn:com.microsoft.wc.thing.types}volume-value" minOccurs="0"/>
 *         &lt;element name="median" type="{urn:com.microsoft.wc.thing.types}volume-value" minOccurs="0"/>
 *         &lt;element name="maximum" type="{urn:com.microsoft.wc.thing.types}volume-value" minOccurs="0"/>
 *         &lt;element name="percentile-95th" type="{urn:com.microsoft.wc.thing.types}volume-value" minOccurs="0"/>
 *         &lt;element name="percentile-90th" type="{urn:com.microsoft.wc.thing.types}volume-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pap-session-tidal-volume", propOrder = { "mean", "median", "maximum", "percentile95Th",
		"percentile90Th" })
public class PapSessionTidalVolume {

	protected VolumeValue mean;
	protected VolumeValue median;
	protected VolumeValue maximum;
	@XmlElement(name = "percentile-95th")
	protected VolumeValue percentile95Th;
	@XmlElement(name = "percentile-90th")
	protected VolumeValue percentile90Th;

	/**
	 * Gets the value of the mean property.
	 * 
	 * @return possible object is {@link VolumeValue }
	 * 
	 */
	public VolumeValue getMean() {
		return mean;
	}

	/**
	 * Sets the value of the mean property.
	 * 
	 * @param value
	 *            allowed object is {@link VolumeValue }
	 * 
	 */
	public void setMean(VolumeValue value) {
		this.mean = value;
	}

	/**
	 * Gets the value of the median property.
	 * 
	 * @return possible object is {@link VolumeValue }
	 * 
	 */
	public VolumeValue getMedian() {
		return median;
	}

	/**
	 * Sets the value of the median property.
	 * 
	 * @param value
	 *            allowed object is {@link VolumeValue }
	 * 
	 */
	public void setMedian(VolumeValue value) {
		this.median = value;
	}

	/**
	 * Gets the value of the maximum property.
	 * 
	 * @return possible object is {@link VolumeValue }
	 * 
	 */
	public VolumeValue getMaximum() {
		return maximum;
	}

	/**
	 * Sets the value of the maximum property.
	 * 
	 * @param value
	 *            allowed object is {@link VolumeValue }
	 * 
	 */
	public void setMaximum(VolumeValue value) {
		this.maximum = value;
	}

	/**
	 * Gets the value of the percentile95Th property.
	 * 
	 * @return possible object is {@link VolumeValue }
	 * 
	 */
	public VolumeValue getPercentile95Th() {
		return percentile95Th;
	}

	/**
	 * Sets the value of the percentile95Th property.
	 * 
	 * @param value
	 *            allowed object is {@link VolumeValue }
	 * 
	 */
	public void setPercentile95Th(VolumeValue value) {
		this.percentile95Th = value;
	}

	/**
	 * Gets the value of the percentile90Th property.
	 * 
	 * @return possible object is {@link VolumeValue }
	 * 
	 */
	public VolumeValue getPercentile90Th() {
		return percentile90Th;
	}

	/**
	 * Sets the value of the percentile90Th property.
	 * 
	 * @param value
	 *            allowed object is {@link VolumeValue }
	 * 
	 */
	public void setPercentile90Th(VolumeValue value) {
		this.percentile90Th = value;
	}

}
