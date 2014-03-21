package com.mjl.lib.php.core;

/**
 * PHP functions can have return values of multiple types. This serves as a data structure to represent
 * those types where it is necessary. For example, strpos() returns the numeric index of the start of a given
 * string, or boolean false if the character is not found.
 * @author Michael Lawson
 *
 */
public class MixedType {

	private String type;
	
	public static final String INT = "int";
	public static final String STRING = "string";
	public static final String BOOL = "boolean";
	public static final String FLOAT = "float";
	public static final String STRARRAY = "string_array";
	public static final String INTARRAY = "int_array";
	public static final String BOOLARRAY = "boolean_array";
	public static final String ASSOCARRAY = "associative_array";
	//more as I remember them -_-
	
	
	/**
	 * Takes an object that represents a particular return type and allows the MixedType object to return it
	 * as a value.
	 * @param type
	 */
	public MixedType(String type){
		this.type = type;
	}
	
	
	
	
}
