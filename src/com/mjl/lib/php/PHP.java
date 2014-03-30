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
	 * Provide simple handles to all the core library functions, that way
	 * the client only needs to import the single PHP class, allowing PHP to do all the work.
	 */
	public static void echo(Object echoString) throws IOException{
		PHPStringOut.echo(response,echoString);
	}
	
	public static void print(Object printString) throws IOException{
		PHPStringOut.print(response, printString);
	}
	
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
}
