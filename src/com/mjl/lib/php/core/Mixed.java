package com.mjl.lib.php.core;

import com.mjl.lib.php.exceptions.InvalidPHPDataException;
import com.mjl.lib.php.exceptions.UndefinedPHPTypeException;

/**
 * PHP functions can have return values of multiple types. This serves as a data structure to represent
 * those types where it is necessary. For example, strpos() returns the numeric index of the start of a given
 * string, or boolean false if the character is not found.
 * @author Michael Lawson
 *
 */
public class Mixed {

	private int type;
	
	private Object data;
	
	public static final int INT = 1;
	public static final int STRING = 2;
	public static final int BOOL = 3;
	public static final int FLOAT = 4;
	public static final int STRARRAY = 5;
	public static final int INTARRAY = 6;
	public static final int BOOLARRAY = 7;
	public static final int ASSOCARRAY = 8;
	public static final int PHPNULL = 9;
	//more as I remember them -_-
	
	
	/**
	 * Takes an object that represents a particular return type and allows the MixedType object to return it
	 * as a value.
	 * @param type
	 * @throws InvalidPHPDataException 
	 */
	public Mixed(int type,Object data) throws UndefinedPHPTypeException{
		this.type = type;
		this.data = data;
		switch(type){
		case INT:
			break;
		case STRING:
			break;
		case BOOL:
			break;
		case FLOAT:
			break;
		case STRARRAY:
			break;
		case INTARRAY:
			break;
		case BOOLARRAY:
			break;
		case ASSOCARRAY:
			break;
		case PHPNULL:
			
			break;
		default:
			throw new UndefinedPHPTypeException("No such type available");
				
		}
		
	}
	
	/**
	 * Just a simple getter to get the currently set type for using in casting
	 * @return int Should be compared against one of the public constants and not an arbitrary number.
	 */
	public int getMixedType(){
		return type;
	}
	
	/**
	 * Return the data object as a string from the mixed type.
	 * @param data
	 * @return
	 * @throws InvalidPHPDataException
	 */
	public String returnAsString(){
		return (String) data;
	}
	
	public Object returnAsNull(){
		return null;
	}
	public Integer returnAsInteger(){
		return (Integer) data;
	}
	public Boolean returnAsBoolean(){
		return (Boolean) data;
	}
	
	
	
	
}
