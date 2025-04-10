//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:47 AM PST 
//

package com.chbase.thing.oxm.jaxb.questionanswer;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.base.CodableValue;
import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.question-answer"&gt;
 *                         A question that was asked and the answers given.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="question" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="answer-choice" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="answer" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "question", "answerChoice", "answer" })
@XmlRootElement(name = "question-answer")
public class QuestionAnswer {
	public static String typeId = "55d33791-58de-4cae-8c78-819e12ba5059";

	@XmlElement(required = true)
	protected DateTime when;
	@XmlElement(required = true)
	protected CodableValue question;
	@XmlElement(name = "answer-choice")
	protected List<CodableValue> answerChoice;
	protected List<CodableValue> answer;

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
	 * Gets the value of the question property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getQuestion() {
		return question;
	}

	/**
	 * Sets the value of the question property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setQuestion(CodableValue value) {
		this.question = value;
	}

	/**
	 * Gets the value of the answerChoice property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the answerChoice property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnswerChoice().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getAnswerChoice() {
		if (answerChoice == null) {
			answerChoice = new ArrayList<CodableValue>();
		}
		return this.answerChoice;
	}

	/**
	 * Gets the value of the answer property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the answer property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnswer().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getAnswer() {
		if (answer == null) {
			answer = new ArrayList<CodableValue>();
		}
		return this.answer;
	}

}
