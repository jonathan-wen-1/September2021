package com.ss.java.sept14;
/**
 * @author jswen
 * Takes in values from the command line and "adds" them together
 * We were told that handling non-number values would be up to us, so i decided to use the try/catch we learned today to ensure that the parseDouble 
 * I use will not cause and exceptions. 
 */
public class AddCmdLine {

	public static void main(String[] args) {
		Double finalVal = 0.0;
		for(String s: args) { //for each loop to look through command line values
			try {
				Double addVal = Double.parseDouble(s);
				finalVal += addVal;
			}
			catch(Exception e) { //as per instruction, handling non-numbers. command line arguments are strings (String [] args) so I did a try-catch
								 //trying to parse the string as a Double. in the case that an exception is thrown (in this case if we try to parse a non-Double
								 //will catch and print the String s that caused the exception
								
				System.out.println("Error, you tried to add string \"" + s + "\" to the sum");
				System.exit(0); //so that the last printline is not executed
			}
		}
		System.out.println(finalVal);
	}	
}
