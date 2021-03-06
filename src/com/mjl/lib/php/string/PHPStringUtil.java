package com.mjl.lib.php.string;



import java.util.ArrayList;

import com.mjl.lib.php.core.Mixed;
import com.mjl.lib.php.core.PHPAssocArray;
import com.mjl.lib.php.exceptions.InvalidPHPArgumentException;
import com.mjl.lib.php.exceptions.UndefinedPHPTypeException;

public class PHPStringUtil {
	private PHPStringUtil(){}
	
	/**
	 * Find the position of the first occurrence of a substring in a string starting at a given offset.
	 * @param haystack
	 * @param needle
	 * @param offset
	 * @return
	 * @throws InvalidPHPArgumentException
	 * @throws UndefinedPHPTypeException
	 */
	public static Mixed strpos(String haystack, String needle, int offset) throws InvalidPHPArgumentException, UndefinedPHPTypeException{
		if(offset < 0){
			//unlike strrpos() and strripos(), offset cannot be negative
			throw new InvalidPHPArgumentException("Offset cannot be negative.");
		}
		//TODO: This was more of a test for the mixed type than anything else, so we do need to refactor this
		//this returns the last index of, whereas in PHP we need to return the first index of.
		//char[] = haystack.indexOf(arg0)
		
		char[] characters = haystack.toCharArray();
		char[] running;
		for(int i = 0; i < characters.length; i++) {
			
		}
		
		
	/*	if(index >= 0){
			return new Mixed(Mixed.INT,new Integer(index));
		}
		else{
			return new Mixed(Mixed.BOOL, new Boolean(false));
		}*/
		
		return new Mixed(Mixed.BOOL, new Boolean(false));
		
	}
	/**
	 * Find the position of the first occurrence of a substring in a string
	 * @param haystack
	 * @param needle
	 * @return
	 * @throws InvalidPHPArgumentException
	 * @throws UndefinedPHPTypeException
	 */
	public static Mixed strpos(String haystack, String needle) throws InvalidPHPArgumentException, UndefinedPHPTypeException{
		return strpos(haystack, needle, 0);
	}
	
	/**
	 * Counts the number of occurrences of every byte-value (0..255) in string and returns it in various ways. 
	 *  Depending on mode count_chars() returns one of the following:

    0 - an array with the byte-value as key and the frequency of every byte as value.
    1 - same as 0 but only byte-values with a frequency greater than zero are listed.
    2 - same as 0 but only byte-values with a frequency equal to zero are listed.
    3 - a string containing all unique characters is returned.
    4 - a string containing all not used characters is returned.

	 * @param str The examined string
	 * @param mode See return values
	 * @return
	 */
	public static Mixed count_chars(String str, int mode){
		
		switch(mode){
			case 0:
				
				break;
		}
		
		return null;
	}
	public static Mixed count_chars(String str){
		count_chars(str,0);
		return null;
	}
	//modes for this method are 0, 1, and 2
	private static PHPAssocArray getCountCharArray(String str, int mode) {
		byte[] bytes;
		ArrayList<Byte> bytesPresent = new ArrayList<Byte>();
		char[] chars = str.toCharArray();
		PHPAssocArray assoc = new PHPAssocArray();
		for(int i = 0; i < chars.length; i++) {
			bytesPresent.add(new Byte((byte) chars[i]));
			
			
			
			switch(mode) {
			case 0:
				bytes = new byte[255];
				break;
			case 1:
				break;
			case 2:
				break;
			}
		}
		return null;
	}
	/**
	 * Returns a one-character string containing the character specified by ascii
	 * A negative number returns the empty string
	 * @param ascii The ascii code
	 * @return The specified character
	 */
	public static String chr(int ascii){
		
		if(ascii < 0) {
			return "";
		}
		//the PHP method of handling a number greater than or equal to 256 is to return the number mod 256 as the string
		if(ascii >= 256) {
			return new Integer(ascii%256).toString();
		}
		
		return getAsciiMappings()[ascii];
	}
	
	private static String[] getAsciiMappings() {
		
		String[] asciiMappings = new String[255];
		asciiMappings[0] = null;
		
		for(int i = 0; i < 255; i++) {
			asciiMappings[i] = Character.toString((char) i);
		}
		return asciiMappings;
		
	}
}
