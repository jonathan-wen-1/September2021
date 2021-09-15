/**
 * 
 */
package com.ss.java.introduction;

/**
 * @author jswen
 *Code to print out the 4 patterns to the console using System.out.print() and for loops 
 *NOTE: I was unsure of exactly what methods were expected as the description in class and on the slide were a little vague but if there are any issues please 
 *let me know!
 *Alternatively the patterns could be copied/pasted into a list of strings and a for loop could go through 1-4 and do "System.out.print({index}): list[{index}] as well
 */
import java.util.*;
public class PrintStars {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//============================================
		System.out.println("1)");
		for(int k = 1; k<=4; k++) { // iteration for each line 
			for(int i=1; i<=k; i++) { // in each line, print out this many stars
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k = 1; k<=9; k++) {
			System.out.print("."); //for the 9 dots in the last line 
		}
		//============================================
		System.out.println("\n2)");
		for(int k = 1; k<=10; k++) {
			System.out.print("."); //for the 10 dots in the first line 
		}
		System.out.println(""); 
		for(int k = 4; k>=1; k--) {
			for(int i =1; i<=k; i++) { //same as the first pattern, but k is decrementing so that the stars go from 4 in a line to 1 instead of oppsite 
				System.out.print("*");
			}
			System.out.println("");
		}
		//============================================
		System.out.println("3)");
		int mirror= 0;
		for (int k = 0; k<=3; k++) { //3 here to print out the 3 lines of stars
			for(int i = 1; i <= 11; i++) {
				if(i >= 6-mirror && i <= 6+mirror) {//the line of dots have 11 so to have everything centered, 6 is used as the "middle point"
													//and "mirror" represents the range of how many stars need to be printed on the right and left of the middle (6)
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			mirror++;
			System.out.println();
		}
		for(int k = 0; k < 11; k++) {
			System.out.print("."); //there isn't really a pattern for the line of dots so i just print out 
		}
		//============================================
		System.out.println("\n4)");
		for(int k = 0; k < 11; k++) {
			System.out.print(".");
		}
		System.out.println();
		int mirror2 = 3;
		for(int k = 0; k<=3; k++) {
			for(int i =1; i<=11; i++) {
				if(i>=6-mirror2 && i<=6+mirror2) { //this time mirror decrements instead of increments so that the number of stars on each side will 
												   //decrease down the lines 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			mirror2--;
			System.out.println();
		}
	}//main

}//PrintStars
