package com.mjl.lib.php.core;

/**
 * Represents a PHP null value. I still need to figure out exactly what that means.
 * @author Michael Lawson
 *
 */
public class PhpNull {
	private PhpNull(){}
	
	public static PhpNull returnNull(){
		return new PhpNull();
	}
}
