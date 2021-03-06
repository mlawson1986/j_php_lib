package com.mjl.lib.php.string;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.mjl.lib.php.PHP;

public class PHPStringOut{
	
	private PHPStringOut(){
		
	}
	
	/**
	 * The ubiquitous print function. Unfortunately we can't really define a new language construct for java
	 * but print can be called as a function in PHP, so I'm going to have to go with that
	 * @param String textToPrint
	 * @return int
	 */
	
	/**
	 * Print the string to standard out. Always returns 1.
	 * @param response
	 * @param textToPrint
	 * @return
	 * @throws IOException
	 */
	public static int print(HttpServletResponse response, Object textToPrint) throws IOException{
		PrintWriter out = response.getWriter();
		out.print(textToPrint.toString());//may not always be a string
		return 1;
	}
	
	/**
	 * Print the string to standard out.
	 * @param response
	 * @param textToPrint
	 * @throws IOException
	 */
	public static void echo(HttpServletResponse response, Object textToPrint) throws IOException{
		PrintWriter out = response.getWriter();
		out.print(textToPrint.toString());//may not always be a string
	}
	
}
