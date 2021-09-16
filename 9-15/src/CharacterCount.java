/**
 * 
 */
package com.ss.java.sept15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author jswen
 *
 */
public class CharacterCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What character do you want to count?");
		Character countVal = sc.next().charAt(0);//to only take in the first character to account
		int numCount = 0;
		//putting BufferedReader in the parentheses will let the auto close work so i don't need to close it
		//manually in a finally bracket
		try(BufferedReader reader = new BufferedReader(new FileReader("testResources/tester.txt"));) {
			String fileToString="";
			for(String firstChar; (firstChar = reader.readLine())!=null;) {
			/*need this kind of for loop because otherwise the first character would not be counted
			 *as in the for loop when we call readLine() that counts a character read and replaces it, 
			 *meaning the count would be off by 1 if the desired character is in the first position
			 *NOTE: had to reference a stackoverflow post to solve this error*/
				fileToString += firstChar; //concats the lines of the file into our string
			}
//			System.out.println(fileToString); 
			for(int k = 0; k<fileToString.length(); k++) {//loop through the string version of the file 
				if(countVal == fileToString.charAt(k)) {//compare our desired char with the current char in string
					numCount++; 
				}
			}
			System.out.println("The character" + countVal + " has appeared " + numCount + " times");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found"); // in case file does not exist
		} catch(IOException e) {
			System.out.println("IO Exception"); // in case we read a null
		}
		

	}

}
