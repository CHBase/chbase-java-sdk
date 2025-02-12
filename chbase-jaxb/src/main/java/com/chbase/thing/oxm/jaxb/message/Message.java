//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:55 AM PST 
//

package com.chbase.thing.oxm.jaxb.message;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.message"&gt;
 *                         The Message type is used to store a multipart message, including message text and attachments. 
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.message"&gt;
 *                         The message is stored in two forms.
 *                 
 *                         The "FullMessage" blob contains the message in the native format.
 *                 
 *                         The text of the message is available in the blobs denoted by the 'html-blob-name" and
 *                         "text-blob-name" element. Any attachments to the message are described in the "attachments"
 *                         element. 
 * 
 *                         The data stored is intended to be compatible with the SendMail Multipart MIME format
 *                     &lt;/remarks&gt;
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="headers" type="{urn:com.microsoft.wc.thing.message}message-header-item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="html-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="text-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="attachments" type="{urn:com.microsoft.wc.thing.message}message-attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "headers", "size", "summary", "htmlBlobName", "textBlobName", "attachments" })
@XmlRootElement(name = "message")
public class Message {
	public static String typeId = "72dc49e1-1486-4634-b651-ef560ed051e5";

	@XmlElement(required = true)
	protected DateTime when;
	protected List<MessageHeaderItem> headers;
	@XmlElement(required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger size;
	protected String summary;
	@XmlElement(name = "html-blob-name")
	protected String htmlBlobName;
	@XmlElement(name = "text-blob-name")
	protected String textBlobName;
	protected List<MessageAttachment> attachments;

	/**
	 * Gets the value of the when property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getWhen() {
		return when;
	}

	/**
	 * Sets the value of the when property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setWhen(DateTime value) {
		this.when = value;
	}

	/**
	 * Gets the value of the headers property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the headers property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHeaders().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MessageHeaderItem }
	 * 
	 * 
	 */
	public List<MessageHeaderItem> getHeaders() {
		if (headers == null) {
			headers = new ArrayList<MessageHeaderItem>();
		}
		return this.headers;
	}

	/**
	 * Gets the value of the size property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSize() {
		return size;
	}

	/**
	 * Sets the value of the size property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSize(BigInteger value) {
		this.size = value;
	}

	/**
	 * Gets the value of the summary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets the value of the summary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSummary(String value) {
		this.summary = value;
	}

	/**
	 * Gets the value of the htmlBlobName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHtmlBlobName() {
		return htmlBlobName;
	}

	/**
	 * Sets the value of the htmlBlobName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHtmlBlobName(String value) {
		this.htmlBlobName = value;
	}

	/**
	 * Gets the value of the textBlobName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextBlobName() {
		return textBlobName;
	}

	/**
	 * Sets the value of the textBlobName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextBlobName(String value) {
		this.textBlobName = value;
	}

	/**
	 * Gets the value of the attachments property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the attachments property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAttachments().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MessageAttachment }
	 * 
	 * 
	 */
	public List<MessageAttachment> getAttachments() {
		if (attachments == null) {
			attachments = new ArrayList<MessageAttachment>();
		}
		return this.attachments;
	}

}
