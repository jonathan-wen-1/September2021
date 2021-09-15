/**
 * 
 */
package com.ss.java.introduction;

/**
 * @author jswen
 *
 */
import java.util.Scanner;
import java.util.Random;

public class RandNumAssignment {
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in); //initializing scanner to detect user input 
		int randomVal = getRand();
//		System.out.println(randomVal); 
		for(int k = 0; k<5 ; k++) {
			System.out.print("Guess a value: ");
			int guess = scan.nextInt(); //uses Scanner to take in user's next integer input 
			if(randomVal-10 <= guess && guess <= randomVal+10) {
				System.out.println("You were within 10 of the value: " + randomVal); //if user is within +-10 of value, will show value and exit
				System.exit(0);
			}
		}
		System.out.println("Sorry, the random value was: " + randomVal); //once user has tried 5 times, will output sorry and exit
	}
	//Helper method for getting a random number-- not necessary but helps in case someone wants multiple numbers
	public static int getRand() {
		//To get a random number from 0-100, do Math.random()*(max-(min+1))+min
		//Also need to typecast to int since return type is int
		return (int)(Math.random()*99);
	}
}
