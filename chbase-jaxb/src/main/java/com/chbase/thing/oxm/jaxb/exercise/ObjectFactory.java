//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:14 AM PST 
//

package com.chbase.thing.oxm.jaxb.exercise;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.microsoft.hsg.thing.oxm.jaxb.exercise
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.microsoft.hsg.thing.oxm.jaxb.exercise
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ExerciseSegment }
	 * 
	 */
	public ExerciseSegment createExerciseSegment() {
		return new ExerciseSegment();
	}

	/**
	 * Create an instance of {@link StructuredNameValue }
	 * 
	 */
	public StructuredNameValue createStructuredNameValue() {
		return new StructuredNameValue();
	}

	/**
	 * Create an instance of {@link Exercise }
	 * 
	 */
	public Exercise createExercise() {
		return new Exercise();
	}

}
