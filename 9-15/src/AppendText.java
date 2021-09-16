/**
 * 
 */
package com.ss.java.sept15;

import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author jswen
 * Code to append text to a file. 
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppendText useAppend = new AppendText(); //so i can call the method below
		Scanner sc = new Scanner(System.in); //so user can decide what they want to add to the file
		System.out.println("Path: "); //has user print the path-- both relative and absolute should work here
		String pathVal = sc.nextLine();
		System.out.println("Append: ");//prompt users to append the next line 
		useAppend.addMethod(Paths.get(pathVal), sc.nextLine() + " ");
		
	}
	public void addMethod(Path p, String s) {
		try{
			
			Files.write(p, s.getBytes(), StandardOpenOption.APPEND); //using NIO library mentioned in class
				//found a solution to append vs. overwrite using standard open operation
		}catch(IOException e) {//if path or file do not exist catch the IOException
			System.out.println("The Path or File are incorrect please try again");
			return; //so the last line isn't printed every time.
		}
		System.out.println("Successfully added.");
	}
}
