//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:21:09 PM PST 
//

package com.chbase.methods.jaxb.getthingtype.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All requests contain the info element to pass parameters
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not take any
 *                         parameters.
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
 *         &lt;element name="thing-type" type="{urn:com.microsoft.wc.methods.response.GetThingType}ThingTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "thingType" })
@XmlRootElement(name = "info")
public class GetThingTypeResponse {

	@XmlElement(name = "thing-type")
	protected List<ThingTypeInfo> thingType;

	/**
	 * Gets the value of the thingType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the thingType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getThingType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ThingTypeInfo }
	 * 
	 * 
	 */
	public List<ThingTypeInfo> getThingType() {
		if (thingType == null) {
			thingType = new ArrayList<ThingTypeInfo>();
		}
		return this.thingType;
	}

}
