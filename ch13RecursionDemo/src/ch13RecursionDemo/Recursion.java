/**
 *   file: Recursion.java
 */
package ch13RecursionDemo;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class Recursion {

	static String strReverse( String str ) {
		if( str.length() <= 0 ) 
			return "";
		
		String c1 = str.substring(0, 1);
		return strReverse( str.substring(1)) + c1;
	}
}
