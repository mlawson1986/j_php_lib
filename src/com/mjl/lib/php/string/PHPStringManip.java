package com.mjl.lib.php.string;

import com.mjl.lib.php.core.Mixed;
import com.mjl.lib.php.exceptions.InvalidPHPDataException;
import com.mjl.lib.php.exceptions.UndefinedPHPTypeException;

/**
 * All functions that would manipulate strings.
 * Documentation borrowed from php.net
 * @author Michael Lawson
 *
 */
public class PHPStringManip {
	
	/**
	 * Returns a string with backslashes before the characters that are listed in the charlist parameter
	 * @param str The string to be escaped
	 * @param charlist A list of characters to be escaped. If charlist contains characters \n, \r etc., they are converted in C-like style, while other non-alphanumeric characters with ASCII codes lower than 32 and higher than 126 converted to octal representation. 
	 * @return
	 */
	public static String addcslashes(String str, String charlist){
		//TODO
		return "";
	}
	
	/**
	 * Returns a string with backslashes before characters that need to be escaped. These characters are single quote ('), double quote ("), backslash (\) and NUL (the NULL byte). 
	 * @param str
	 * @return
	 */
	public static String addslashes(String str){
		//TODO
		return "";
	}
	
	
	/**
	 * Returns an ASCII string containing the hexadecimal representation of str. The conversion is done byte-wise with the high-nibble first. 
	 * @param str
	 * @return
	 */
	public static String bin2hex(String str){
		//TODO
		return "";
	}
	
	/**
	 * This function is an alias of rtrim()
	 * @param str
	 * @return
	 */
	public static String chop(String str){
		//TODO
		return "";
	}
	
	/**
	 * Returns a one-character string containing the character specified by ascii.<br />This function compliments ord()
	 * @param ascii
	 * @return
	 */
	public static String chr(int ascii){
		return "";
	}
	
	/**
	 * Split a string into smaller chunks
	 * @param body The string to be chunked
	 * @param chunklen The chunk length
	 * @param end The line ending sequence
	 * @return
	 */
	public static String chunk_split(String body, int chunklen, String end){
		//TODO
		return "";
	}
	
	public static String chunk_split(String body, int chunklen){
		return chunk_split(body,chunklen,"\r\n");
	}
	public static String chunk_split(String body){
		return chunk_split(body,76);
	}

	/**
	 * Convert from on Cyrillic character set to another
	 * k - koi8-r
	 * w - windows-1251
	 * i - iso8859-5
	 * a - x-cp866
	 * d - x-cp866
	 * m - x-mac-cyrllic
	 * @param str The string to be converted
	 * @param from The source Cyrillic character set, as a single character
	 * @param to The target Cyrillic character set, as a single character
	 * @return
	 */
	public static String convert_cry_string(String str, String from, String to){
		//TODO: This is going to be HELL!!!!
		return "";
	}
	
	/**
	 * Decode a uuencoded string
	 * @param data The uuencoded data
	 * @return Returns the decoded data as a string or FALSE on failure. 
	 */
	public static Mixed convert_uudecode(String data){
	/*	if(true){
			try {
				return new Mixed(Mixed.STRING,data);
			} catch (UndefinedPHPTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidPHPDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			try {
				return new Mixed(Mixed.BOOL,data);
			} catch (UndefinedPHPTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidPHPDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		return null;
	}
}
