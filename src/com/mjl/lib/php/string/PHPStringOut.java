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
	
	public static int print(HttpServletResponse response, String textToPrint) throws IOException{
		PrintWriter out = response.getWriter();
		out.print(textToPrint);
		return 1;
	}
	
	public static void echo(HttpServletResponse response, String textToPrint) throws IOException{
		PrintWriter out = response.getWriter();
		out.println(textToPrint);
	}
	
}
