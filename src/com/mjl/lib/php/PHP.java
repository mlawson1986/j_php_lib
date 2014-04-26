/**
 * As an experiment, I've decided to try and implement the PHP standard
 * function library. Additional function libraries can be grabbed as additional
 * jars. This is pretty much just for fun.
 * 
 * This is the "front controller" as it were (even though this isn't an MVC framework) where all
 * calls take place, and all global items are setup. The main request,response cycle is handled here.
 */
package com.mjl.lib.php;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.channels.FileChannel;

import sun.nio.ch.*;

import java.util.*;

import com.mjl.lib.php.core.Mixed;
import com.mjl.lib.php.exceptions.InvalidPHPArgumentException;
import com.mjl.lib.php.exceptions.UndefinedPHPTypeException;
import com.mjl.lib.php.string.*;

/**
 * @author Michael Lawson
 * The main PHP function library class, full of all static methods.
 */
public final class PHP {
	
	//as this is mainly for web, we need to maintain the http request throught execution
	//in order for the libs to act correctly on gets and posts.
	protected static HttpServletRequest request;
	protected static HttpServletResponse response;
	public static HashMap<String,String> p_GET;
	public static HashMap<String,String> p_POST;
	public static HashMap<String,String> p_SERVER;
	public static HashMap<String,String> p_REQUEST;
	public static HashMap<String,String> p_COOKIE;
	public static HashMap<String,String> p_SESSION;
	public static HashMap<String,String> p_ENV;
	public static HashMap<String,String> p_FILES;
	
	/**
	 * No need to use a constructor, everything here is static.
	 */
	protected PHP(){}
	
	/**
	 * We need to maintain the request object for use by PHP HTTP related functions and constructions.
	 * @param request
	 */
	public static void setHttpRequest(HttpServletRequest httpRequest){
		request = httpRequest;
	}
	
	/**
	 * We need to maintain the response object  for us by PHP HTTP related functions and constructions.
	 */
	public static void setHttpResponse(HttpServletResponse httpResponse){
		response = httpResponse;
	}
	
	/**
	 * Print the string to standard out
	 * @param echoString
	 * @throws IOException
	 */
	public static void echo(Object echoString) throws IOException{
		PHPStringOut.echo(response,echoString);
	}
	/**
	 * Print the string to standard out. Always returns 1
	 * @param printString
	 * @throws IOException
	 */
	public static int print(Object printString) throws IOException{
		return PHPStringOut.print(response, printString);
	}
	/**
	 * Returns an ASCII string containing the hexadecimal representation of str. The conversion is done byte-wise with the high-nibble first. 
	 * @param str
	 * @return
	 */
	public static String bin2hex(String str){
		return PHPStringManip.bin2hex(str);
	}
	/**
	 * Returns a string with backslashes before the characters that are listed in the charlist parameter
	 * @param str The string to be escaped
	 * @param charlist A list of characters to be escaped. If charlist contains characters \n, \r etc., they are converted in C-like style, while other non-alphanumeric characters with ASCII codes lower than 32 and higher than 126 converted to octal representation. 
	 * @return
	 */
	public static String addcslashes(String str, String charlist){
		return PHPStringManip.addcslashes(str, charlist);
	}
	/**
	 * Returns a string with backslashes before characters that need to be escaped. These characters are single quote ('), double quote ("), backslash (\) and NUL (the NULL byte). 
	 * @param str
	 * @return
	 */
	public static String addcslashes(String str){
		return PHPStringManip.addslashes(str);
	}
	/**
	 * Find the position of the first occurrence of a substring in a string starting at a given offset
	 * @param haystack
	 * @param needle
	 * @param offset
	 * @return
	 * @throws InvalidPHPArgumentException
	 * @throws UndefinedPHPTypeException
	 */
	public static Mixed strpos(String haystack,String needle, int offset) throws IOException{
		try {
			return PHPStringUtil.strpos(haystack, needle, offset);
		} catch (InvalidPHPArgumentException e) {
			PHPStringOut.echo(response, e.getMessage());
			return null;
		} catch (UndefinedPHPTypeException e) {
			PHPStringOut.echo(response, e.getMessage());
			return null;
		}
		
	}
	/**
	 * Find the position of the first occurrence of a substring in a string
	 * @param haystack
	 * @param needle
	 * @return
	 * @throws InvalidPHPArgumentException
	 * @throws UndefinedPHPTypeException
	 */
	public static Mixed strpos(String haystack, String needle) throws IOException{
		try {
			return PHPStringUtil.strpos(haystack, needle);
		} catch (InvalidPHPArgumentException e) {
			PHPStringOut.echo(response, e.getMessage());
			return null;
		} catch (UndefinedPHPTypeException e) {
			PHPStringOut.echo(response, e.getMessage());
			return null;
		}
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
		return PHPStringUtil.count_chars(str,mode);
	}
	/**
	 * Counts the number of occurrences of every byte-value (0..255) in string and returns it in various ways. 
	 *  Depending on mode count_chars() returns one the default mode of 0:
	 *  an array with the byte-value as key and the frequency of every byte as value.
	 * @param str The examined string
	 * @param mode See return values
	 * @return
	 */
	public static Mixed count_chars(String str){
		return PHPStringUtil.count_chars(str);
	}
}
