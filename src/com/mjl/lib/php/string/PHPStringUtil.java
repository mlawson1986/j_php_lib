package com.mjl.lib.php.string;

import com.mjl.lib.php.core.Mixed;
import com.mjl.lib.php.exceptions.InvalidPHPArgumentException;
import com.mjl.lib.php.exceptions.UndefinedPHPTypeException;

public class PHPStringUtil {
	private PHPStringUtil(){}
	
	/**
	 * Find the position of the first occurrence of a substring in a string
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
		int index = haystack.lastIndexOf(needle);
		
		if(index >= 0){
			return new Mixed(Mixed.INT,new Integer(index));
		}
		else{
			return new Mixed(Mixed.BOOL, new Boolean(false));
		}
		
	}
	public static Mixed strpos(String haystack, String needle) throws InvalidPHPArgumentException, UndefinedPHPTypeException{
		return strpos(haystack, needle, 0);
	}
	
}
