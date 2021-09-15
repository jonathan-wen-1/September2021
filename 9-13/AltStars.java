/**
 * 
 */
package com.ss.java.introduction;

/**
 * @author jswen
 * This is the alternative version I made where instead of coding each line of stars individually, each pattern is treated as a String and put into a list of Strings
 * that is then looped through. 
 */
public class AltStars {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		String [] stars = new String[4]; //string list, takes in the patterns
		stars[0] = "*\n" + 
				"**\n" + 
				"***\n" + 
				"****\n" + 
				".........";
		stars[1] = "..........\n" +
				"****\n" +
				"***\n" +
				"**\n" + 
				"*";
		stars[2] = "     *     \n" +
				"    ***    \n" +
				"   *****   \n" + 
				"  *******  \n" +
				"...........";
		stars[3] = "...........\n" +
				"  *******  \n" +
				"   *****   \n" + 
				"    ***    \n" +
				"     *     ";
		for(int k = 0; k<stars.length; k++) {
			System.out.println(k+1 + ")\n" + stars[k]); //outputs {pattern-num}) then the pattern
		}
	}

}