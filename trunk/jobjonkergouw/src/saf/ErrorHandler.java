package saf;

import java.lang.Exception;

/** 
 * Single point deciding what to do with errors
 * @author job
 *
 */
public class ErrorHandler {
	public static void printException(Exception e) {
		System.out.println( e.getMessage() );
	}

	public static void printString(String s) {
		System.out.println(s);
	}	
	
	public static void exitWithException(Exception e) {
		System.out.println( e.getMessage() );
        java.lang.System.exit(1);
	}	
	
	public static void exitWithString(String s) {
		System.out.println(s);
        java.lang.System.exit(1);
	}		
}

