package com.chbase.thing.oxm.jaxb.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.base.Person;
import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;Task&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     Defines a task.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A task describes an activity that can be performed and tracks 
 *               the state of completion of that activity. It is a representation 
 *               that an activity should be or has been initiated, and eventually, 
 *               represents the successful or unsuccessful completion of that activity.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for task complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="task">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="business-status" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="task-reason" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="created-date" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="updated-date" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="completed-date" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="status-reason" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="owner" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" maxOccurs="1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task", propOrder = { "businessStatus", "taskReason", "createdDate", "updatedDate", "completedDate", "statusReason", "owner", "note"})
@XmlRootElement(name = "task")
public class Task {
	@XmlElement(name = "business-status")
	protected CodableValue businessStatus;
	@XmlElement(name = "task-reason")
	protected CodableValue taskReason;
	@XmlElement(name = "created-date")
	protected DateTime createdDate;
	@XmlElement(name = "updated-date")
	protected DateTime updatedDate;
	@XmlElement(name = "completed-date")
	protected DateTime completedDate;
	@XmlElement(name = "status-reason")
	protected CodableValue statusReason;
	protected Person owner;
	protected String note;

	/**
	 * Gets the value of the businessStatus property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getbusinessStatus() {
		return businessStatus;
	}

	/**
	 * Sets the value of the businessStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setBusinessStatus(CodableValue value) {
		this.businessStatus = value;
	}
	
	/**
	 * Gets the value of the taskReason property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getTaskReason() {
		return taskReason;
	}

	/**
	 * Sets the value of the taskReason property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setTaskReason(CodableValue value) {
		this.taskReason = value;
	}
	
	/**
	 * Gets the value of the createdDate property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the value of the createdDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setCreatedDate(DateTime value) {
		this.createdDate = value;
	}
	
	/**
	 * Gets the value of the updatedDate property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Sets the value of the updatedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setUpdatedDate(DateTime value) {
		this.updatedDate = value;
	}
	
	/**
	 * Gets the value of the completedDate property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getCompletedDate() {
		return completedDate;
	}

	/**
	 * Sets the value of the completedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setCompletedDate(DateTime value) {
		this.completedDate = value;
	}
	
	/**
	 * Gets the value of the statusReason property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getStatusReason() {
		return statusReason;
	}

	/**
	 * Sets the value of the statusReason property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setStatusReason(CodableValue value) {
		this.statusReason = value;
	}

	/**
	 * Gets the value of the owner property.
	 * 
	 * @return possible object is {@link Person }
	 * 
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *            allowed object is {@link Person }
	 * 
	 */
	public void setOwner(Person value) {
		this.owner = value;
	}	
	
	/**
	 * Gets the value of the note property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Sets the value of the note property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNote(String value) {
		this.note = value;
	}

}
