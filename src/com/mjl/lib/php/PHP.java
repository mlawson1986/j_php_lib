/**
 * As an experiment, I've decided to try and implement the PHP standard
 * function library. Additional function libraries can be grabbed as additional
 * jars. This is pretty much just for fun.
 */
package com.mjl.lib.php;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.channels.FileChannel;
import sun.nio.ch.*;
import java.util.*;

/**
 * @author Michael Lawson
 * The main PHP function library class, full of all static methods.
 */
public class PHP {
	
	//as this is mainly for web, we need to maintain the http request throught execution
	//in order for the libs to act correctly on gets and posts.
	private static HttpServletRequest request;
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
	private PHP(){}
	
	/**
	 * We need to maintain the request object for use by PHP HTTP related functions and constructions.
	 * @param request
	 */
	public static void setHttpRequest(HttpServletRequest httpRequest){
		request = httpRequest;
	}
	/**
	 * 
	 * @param filename The full name or path to the file, relative to the current
	 * filepath context. 
	 * @param filemode Permissions to set on how the file can be used, such as readonly
	 * read/write, write, etc
	 * @return A FileChannel object that represents a PHP file pointer.
	 */
	/*public static FileChannel fopen(String filename, String filemode){
		
		//TODO: setup filemode switch
		return new FileChannelImpl(null, false, false, filename, false);
		
	}*/
	
	/**
	 * The ubiquitous print function. Unfortunately we can't really define a new language construct for java
	 * but print can be called as a function in PHP, so I'm going to have to go with that
	 * @param String textToPrint
	 * @return int
	 */
	
	public static int print(String textToPrint){
		//PrintWriter out = response.getWriter();
		//out.print(textToPrint);
		return 1;
	}
	
	public static void echo(String textToPrint){
		//PrintWriter out = response.getWriter();
		//out.println(textToPrint);
		System.out.print(textToPrint);
	}
	
}
