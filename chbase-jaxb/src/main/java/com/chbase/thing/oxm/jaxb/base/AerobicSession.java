//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:23:59 PM PDT 
//

package com.chbase.thing.oxm.jaxb.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;AerobicSession&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     Defines a lap within a single aerobic session.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for aerobic-session complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="aerobic-session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="distance" type="{urn:com.microsoft.wc.thing.types}length-value" minOccurs="0"/>
 *         &lt;element name="minutes" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="intensity" type="{urn:com.microsoft.wc.thing.types}one-to-five" minOccurs="0"/>
 *         &lt;element name="peak-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="avg-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="min-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="energy" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="energy-from-fat" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="peak-speed" type="{urn:com.microsoft.wc.thing.types}speed-value" minOccurs="0"/>
 *         &lt;element name="avg-speed" type="{urn:com.microsoft.wc.thing.types}speed-value" minOccurs="0"/>
 *         &lt;element name="min-speed" type="{urn:com.microsoft.wc.thing.types}speed-value" minOccurs="0"/>
 *         &lt;element name="peak-pace" type="{urn:com.microsoft.wc.thing.types}pace-value" minOccurs="0"/>
 *         &lt;element name="avg-pace" type="{urn:com.microsoft.wc.thing.types}pace-value" minOccurs="0"/>
 *         &lt;element name="min-pace" type="{urn:com.microsoft.wc.thing.types}pace-value" minOccurs="0"/>
 *         &lt;element name="peak-power" type="{urn:com.microsoft.wc.thing.types}power-value" minOccurs="0"/>
 *         &lt;element name="avg-power" type="{urn:com.microsoft.wc.thing.types}power-value" minOccurs="0"/>
 *         &lt;element name="min-power" type="{urn:com.microsoft.wc.thing.types}power-value" minOccurs="0"/>
 *         &lt;element name="peak-torque" type="{urn:com.microsoft.wc.thing.types}torque-value" minOccurs="0"/>
 *         &lt;element name="avg-torque" type="{urn:com.microsoft.wc.thing.types}torque-value" minOccurs="0"/>
 *         &lt;element name="min-torque" type="{urn:com.microsoft.wc.thing.types}torque-value" minOccurs="0"/>
 *         &lt;element name="left-right-balance" type="{urn:com.microsoft.wc.thing.types}percentage" minOccurs="0"/>
 *         &lt;element name="peak-cadence" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="avg-cadence" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="min-cadence" type="{urn:com.microsoft.wc.thing.types}positiveDouble" minOccurs="0"/>
 *         &lt;element name="peak-temperature" type="{urn:com.microsoft.wc.thing.types}temperature-value" minOccurs="0"/>
 *         &lt;element name="avg-temperature" type="{urn:com.microsoft.wc.thing.types}temperature-value" minOccurs="0"/>
 *         &lt;element name="min-temperature" type="{urn:com.microsoft.wc.thing.types}temperature-value" minOccurs="0"/>
 *         &lt;element name="peak-altitude" type="{urn:com.microsoft.wc.thing.types}altitude-value" minOccurs="0"/>
 *         &lt;element name="avg-altitude" type="{urn:com.microsoft.wc.thing.types}altitude-value" minOccurs="0"/>
 *         &lt;element name="min-altitude" type="{urn:com.microsoft.wc.thing.types}altitude-value" minOccurs="0"/>
 *         &lt;element name="elevation-gain" type="{urn:com.microsoft.wc.thing.types}length-value" minOccurs="0"/>
 *         &lt;element name="elevation-loss" type="{urn:com.microsoft.wc.thing.types}length-value" minOccurs="0"/>
 *         &lt;element name="number-of-steps" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="number-of-aerobic-steps" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="aerobic-step-minutes" type="{urn:com.microsoft.wc.thing.types}nonNegativeDouble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aerobic-session", propOrder = { "mode", "distance", "minutes", "intensity", "peakHeartrate",
		"avgHeartrate", "minHeartrate", "energy", "energyFromFat", "peakSpeed", "avgSpeed", "minSpeed", "peakPace",
		"avgPace", "minPace", "peakPower", "avgPower", "minPower", "peakTorque", "avgTorque", "minTorque",
		"leftRightBalance", "peakCadence", "avgCadence", "minCadence", "peakTemperature", "avgTemperature",
		"minTemperature", "peakAltitude", "avgAltitude", "minAltitude", "elevationGain", "elevationLoss",
		"numberOfSteps", "numberOfAerobicSteps", "aerobicStepMinutes" })
public class AerobicSession {

	protected CodableValue mode;
	protected LengthValue distance;
	protected Double minutes;
	protected Integer intensity;
	@XmlElement(name = "peak-heartrate")
	protected Integer peakHeartrate;
	@XmlElement(name = "avg-heartrate")
	protected Integer avgHeartrate;
	@XmlElement(name = "min-heartrate")
	protected Integer minHeartrate;
	protected Double energy;
	@XmlElement(name = "energy-from-fat")
	protected Double energyFromFat;
	@XmlElement(name = "peak-speed")
	protected SpeedValue peakSpeed;
	@XmlElement(name = "avg-speed")
	protected SpeedValue avgSpeed;
	@XmlElement(name = "min-speed")
	protected SpeedValue minSpeed;
	@XmlElement(name = "peak-pace")
	protected PaceValue peakPace;
	@XmlElement(name = "avg-pace")
	protected PaceValue avgPace;
	@XmlElement(name = "min-pace")
	protected PaceValue minPace;
	@XmlElement(name = "peak-power")
	protected PowerValue peakPower;
	@XmlElement(name = "avg-power")
	protected PowerValue avgPower;
	@XmlElement(name = "min-power")
	protected PowerValue minPower;
	@XmlElement(name = "peak-torque")
	protected TorqueValue peakTorque;
	@XmlElement(name = "avg-torque")
	protected TorqueValue avgTorque;
	@XmlElement(name = "min-torque")
	protected TorqueValue minTorque;
	@XmlElement(name = "left-right-balance")
	protected Double leftRightBalance;
	@XmlElement(name = "peak-cadence")
	protected Double peakCadence;
	@XmlElement(name = "avg-cadence")
	protected Double avgCadence;
	@XmlElement(name = "min-cadence")
	protected Double minCadence;
	@XmlElement(name = "peak-temperature")
	protected TemperatureValue peakTemperature;
	@XmlElement(name = "avg-temperature")
	protected TemperatureValue avgTemperature;
	@XmlElement(name = "min-temperature")
	protected TemperatureValue minTemperature;
	@XmlElement(name = "peak-altitude")
	protected AltitudeValue peakAltitude;
	@XmlElement(name = "avg-altitude")
	protected AltitudeValue avgAltitude;
	@XmlElement(name = "min-altitude")
	protected AltitudeValue minAltitude;
	@XmlElement(name = "elevation-gain")
	protected LengthValue elevationGain;
	@XmlElement(name = "elevation-loss")
	protected LengthValue elevationLoss;
	@XmlElement(name = "number-of-steps")
	protected Integer numberOfSteps;
	@XmlElement(name = "number-of-aerobic-steps")
	protected Integer numberOfAerobicSteps;
	@XmlElement(name = "aerobic-step-minutes")
	protected Double aerobicStepMinutes;

	/**
	 * Gets the value of the mode property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getMode() {
		return mode;
	}

	/**
	 * Sets the value of the mode property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setMode(CodableValue value) {
		this.mode = value;
	}

	/**
	 * Gets the value of the distance property.
	 * 
	 * @return possible object is {@link LengthValue }
	 * 
	 */
	public LengthValue getDistance() {
		return distance;
	}

	/**
	 * Sets the value of the distance property.
	 * 
	 * @param value
	 *            allowed object is {@link LengthValue }
	 * 
	 */
	public void setDistance(LengthValue value) {
		this.distance = value;
	}

	/**
	 * Gets the value of the minutes property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMinutes() {
		return minutes;
	}

	/**
	 * Sets the value of the minutes property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMinutes(Double value) {
		this.minutes = value;
	}

	/**
	 * Gets the value of the intensity property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIntensity() {
		return intensity;
	}

	/**
	 * Sets the value of the intensity property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIntensity(Integer value) {
		this.intensity = value;
	}

	/**
	 * Gets the value of the peakHeartrate property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPeakHeartrate() {
		return peakHeartrate;
	}

	/**
	 * Sets the value of the peakHeartrate property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPeakHeartrate(Integer value) {
		this.peakHeartrate = value;
	}

	/**
	 * Gets the value of the avgHeartrate property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAvgHeartrate() {
		return avgHeartrate;
	}

	/**
	 * Sets the value of the avgHeartrate property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAvgHeartrate(Integer value) {
		this.avgHeartrate = value;
	}

	/**
	 * Gets the value of the minHeartrate property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMinHeartrate() {
		return minHeartrate;
	}

	/**
	 * Sets the value of the minHeartrate property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMinHeartrate(Integer value) {
		this.minHeartrate = value;
	}

	/**
	 * Gets the value of the energy property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getEnergy() {
		return energy;
	}

	/**
	 * Sets the value of the energy property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setEnergy(Double value) {
		this.energy = value;
	}

	/**
	 * Gets the value of the energyFromFat property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getEnergyFromFat() {
		return energyFromFat;
	}

	/**
	 * Sets the value of the energyFromFat property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setEnergyFromFat(Double value) {
		this.energyFromFat = value;
	}

	/**
	 * Gets the value of the peakSpeed property.
	 * 
	 * @return possible object is {@link SpeedValue }
	 * 
	 */
	public SpeedValue getPeakSpeed() {
		return peakSpeed;
	}

	/**
	 * Sets the value of the peakSpeed property.
	 * 
	 * @param value
	 *            allowed object is {@link SpeedValue }
	 * 
	 */
	public void setPeakSpeed(SpeedValue value) {
		this.peakSpeed = value;
	}

	/**
	 * Gets the value of the avgSpeed property.
	 * 
	 * @return possible object is {@link SpeedValue }
	 * 
	 */
	public SpeedValue getAvgSpeed() {
		return avgSpeed;
	}

	/**
	 * Sets the value of the avgSpeed property.
	 * 
	 * @param value
	 *            allowed object is {@link SpeedValue }
	 * 
	 */
	public void setAvgSpeed(SpeedValue value) {
		this.avgSpeed = value;
	}

	/**
	 * Gets the value of the minSpeed property.
	 * 
	 * @return possible object is {@link SpeedValue }
	 * 
	 */
	public SpeedValue getMinSpeed() {
		return minSpeed;
	}

	/**
	 * Sets the value of the minSpeed property.
	 * 
	 * @param value
	 *            allowed object is {@link SpeedValue }
	 * 
	 */
	public void setMinSpeed(SpeedValue value) {
		this.minSpeed = value;
	}

	/**
	 * Gets the value of the peakPace property.
	 * 
	 * @return possible object is {@link PaceValue }
	 * 
	 */
	public PaceValue getPeakPace() {
		return peakPace;
	}

	/**
	 * Sets the value of the peakPace property.
	 * 
	 * @param value
	 *            allowed object is {@link PaceValue }
	 * 
	 */
	public void setPeakPace(PaceValue value) {
		this.peakPace = value;
	}

	/**
	 * Gets the value of the avgPace property.
	 * 
	 * @return possible object is {@link PaceValue }
	 * 
	 */
	public PaceValue getAvgPace() {
		return avgPace;
	}

	/**
	 * Sets the value of the avgPace property.
	 * 
	 * @param value
	 *            allowed object is {@link PaceValue }
	 * 
	 */
	public void setAvgPace(PaceValue value) {
		this.avgPace = value;
	}

	/**
	 * Gets the value of the minPace property.
	 * 
	 * @return possible object is {@link PaceValue }
	 * 
	 */
	public PaceValue getMinPace() {
		return minPace;
	}

	/**
	 * Sets the value of the minPace property.
	 * 
	 * @param value
	 *            allowed object is {@link PaceValue }
	 * 
	 */
	public void setMinPace(PaceValue value) {
		this.minPace = value;
	}

	/**
	 * Gets the value of the peakPower property.
	 * 
	 * @return possible object is {@link PowerValue }
	 * 
	 */
	public PowerValue getPeakPower() {
		return peakPower;
	}

	/**
	 * Sets the value of the peakPower property.
	 * 
	 * @param value
	 *            allowed object is {@link PowerValue }
	 * 
	 */
	public void setPeakPower(PowerValue value) {
		this.peakPower = value;
	}

	/**
	 * Gets the value of the avgPower property.
	 * 
	 * @return possible object is {@link PowerValue }
	 * 
	 */
	public PowerValue getAvgPower() {
		return avgPower;
	}

	/**
	 * Sets the value of the avgPower property.
	 * 
	 * @param value
	 *            allowed object is {@link PowerValue }
	 * 
	 */
	public void setAvgPower(PowerValue value) {
		this.avgPower = value;
	}

	/**
	 * Gets the value of the minPower property.
	 * 
	 * @return possible object is {@link PowerValue }
	 * 
	 */
	public PowerValue getMinPower() {
		return minPower;
	}

	/**
	 * Sets the value of the minPower property.
	 * 
	 * @param value
	 *            allowed object is {@link PowerValue }
	 * 
	 */
	public void setMinPower(PowerValue value) {
		this.minPower = value;
	}

	/**
	 * Gets the value of the peakTorque property.
	 * 
	 * @return possible object is {@link TorqueValue }
	 * 
	 */
	public TorqueValue getPeakTorque() {
		return peakTorque;
	}

	/**
	 * Sets the value of the peakTorque property.
	 * 
	 * @param value
	 *            allowed object is {@link TorqueValue }
	 * 
	 */
	public void setPeakTorque(TorqueValue value) {
		this.peakTorque = value;
	}

	/**
	 * Gets the value of the avgTorque property.
	 * 
	 * @return possible object is {@link TorqueValue }
	 * 
	 */
	public TorqueValue getAvgTorque() {
		return avgTorque;
	}

	/**
	 * Sets the value of the avgTorque property.
	 * 
	 * @param value
	 *            allowed object is {@link TorqueValue }
	 * 
	 */
	public void setAvgTorque(TorqueValue value) {
		this.avgTorque = value;
	}

	/**
	 * Gets the value of the minTorque property.
	 * 
	 * @return possible object is {@link TorqueValue }
	 * 
	 */
	public TorqueValue getMinTorque() {
		return minTorque;
	}

	/**
	 * Sets the value of the minTorque property.
	 * 
	 * @param value
	 *            allowed object is {@link TorqueValue }
	 * 
	 */
	public void setMinTorque(TorqueValue value) {
		this.minTorque = value;
	}

	/**
	 * Gets the value of the leftRightBalance property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getLeftRightBalance() {
		return leftRightBalance;
	}

	/**
	 * Sets the value of the leftRightBalance property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setLeftRightBalance(Double value) {
		this.leftRightBalance = value;
	}

	/**
	 * Gets the value of the peakCadence property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPeakCadence() {
		return peakCadence;
	}

	/**
	 * Sets the value of the peakCadence property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPeakCadence(Double value) {
		this.peakCadence = value;
	}

	/**
	 * Gets the value of the avgCadence property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getAvgCadence() {
		return avgCadence;
	}

	/**
	 * Sets the value of the avgCadence property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAvgCadence(Double value) {
		this.avgCadence = value;
	}

	/**
	 * Gets the value of the minCadence property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMinCadence() {
		return minCadence;
	}

	/**
	 * Sets the value of the minCadence property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMinCadence(Double value) {
		this.minCadence = value;
	}

	/**
	 * Gets the value of the peakTemperature property.
	 * 
	 * @return possible object is {@link TemperatureValue }
	 * 
	 */
	public TemperatureValue getPeakTemperature() {
		return peakTemperature;
	}

	/**
	 * Sets the value of the peakTemperature property.
	 * 
	 * @param value
	 *            allowed object is {@link TemperatureValue }
	 * 
	 */
	public void setPeakTemperature(TemperatureValue value) {
		this.peakTemperature = value;
	}

	/**
	 * Gets the value of the avgTemperature property.
	 * 
	 * @return possible object is {@link TemperatureValue }
	 * 
	 */
	public TemperatureValue getAvgTemperature() {
		return avgTemperature;
	}

	/**
	 * Sets the value of the avgTemperature property.
	 * 
	 * @param value
	 *            allowed object is {@link TemperatureValue }
	 * 
	 */
	public void setAvgTemperature(TemperatureValue value) {
		this.avgTemperature = value;
	}

	/**
	 * Gets the value of the minTemperature property.
	 * 
	 * @return possible object is {@link TemperatureValue }
	 * 
	 */
	public TemperatureValue getMinTemperature() {
		return minTemperature;
	}

	/**
	 * Sets the value of the minTemperature property.
	 * 
	 * @param value
	 *            allowed object is {@link TemperatureValue }
	 * 
	 */
	public void setMinTemperature(TemperatureValue value) {
		this.minTemperature = value;
	}

	/**
	 * Gets the value of the peakAltitude property.
	 * 
	 * @return possible object is {@link AltitudeValue }
	 * 
	 */
	public AltitudeValue getPeakAltitude() {
		return peakAltitude;
	}

	/**
	 * Sets the value of the peakAltitude property.
	 * 
	 * @param value
	 *            allowed object is {@link AltitudeValue }
	 * 
	 */
	public void setPeakAltitude(AltitudeValue value) {
		this.peakAltitude = value;
	}

	/**
	 * Gets the value of the avgAltitude property.
	 * 
	 * @return possible object is {@link AltitudeValue }
	 * 
	 */
	public AltitudeValue getAvgAltitude() {
		return avgAltitude;
	}

	/**
	 * Sets the value of the avgAltitude property.
	 * 
	 * @param value
	 *            allowed object is {@link AltitudeValue }
	 * 
	 */
	public void setAvgAltitude(AltitudeValue value) {
		this.avgAltitude = value;
	}

	/**
	 * Gets the value of the minAltitude property.
	 * 
	 * @return possible object is {@link AltitudeValue }
	 * 
	 */
	public AltitudeValue getMinAltitude() {
		return minAltitude;
	}

	/**
	 * Sets the value of the minAltitude property.
	 * 
	 * @param value
	 *            allowed object is {@link AltitudeValue }
	 * 
	 */
	public void setMinAltitude(AltitudeValue value) {
		this.minAltitude = value;
	}

	/**
	 * Gets the value of the elevationGain property.
	 * 
	 * @return possible object is {@link LengthValue }
	 * 
	 */
	public LengthValue getElevationGain() {
		return elevationGain;
	}

	/**
	 * Sets the value of the elevationGain property.
	 * 
	 * @param value
	 *            allowed object is {@link LengthValue }
	 * 
	 */
	public void setElevationGain(LengthValue value) {
		this.elevationGain = value;
	}

	/**
	 * Gets the value of the elevationLoss property.
	 * 
	 * @return possible object is {@link LengthValue }
	 * 
	 */
	public LengthValue getElevationLoss() {
		return elevationLoss;
	}

	/**
	 * Sets the value of the elevationLoss property.
	 * 
	 * @param value
	 *            allowed object is {@link LengthValue }
	 * 
	 */
	public void setElevationLoss(LengthValue value) {
		this.elevationLoss = value;
	}

	/**
	 * Gets the value of the numberOfSteps property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfSteps() {
		return numberOfSteps;
	}

	/**
	 * Sets the value of the numberOfSteps property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfSteps(Integer value) {
		this.numberOfSteps = value;
	}

	/**
	 * Gets the value of the numberOfAerobicSteps property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfAerobicSteps() {
		return numberOfAerobicSteps;
	}

	/**
	 * Sets the value of the numberOfAerobicSteps property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfAerobicSteps(Integer value) {
		this.numberOfAerobicSteps = value;
	}

	/**
	 * Gets the value of the aerobicStepMinutes property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getAerobicStepMinutes() {
		return aerobicStepMinutes;
	}

	/**
	 * Sets the value of the aerobicStepMinutes property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAerobicStepMinutes(Double value) {
		this.aerobicStepMinutes = value;
	}

}
