package com.ss.java.JBWeek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Assignment1{
	//Made the assumption that "locked stub code in your editor" implied either reading in user input or reading in a file
	//I implemented for reading in the user input-- if wanted to do through file you would chagne the input stream reader to a file rader 
	public static void main(String [] args) { 
		
		Assignment1 assign = new Assignment1();
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
			int operationNum = Integer.parseInt(read.readLine()); //takes the next input as the number of operations 
			ArrayList <String> outputs = new ArrayList<>();//to print the outputs all at once
			while (operationNum > 0) { //while we have more operations to do
				String values = read.readLine(); //should be in format like "1 3" or "2 155"
				StringTokenizer listVal = new StringTokenizer(values);//takes the input and separates the non space values into a list of tokens
				int opType = Integer.parseInt(listVal.nextToken()); //turns the first token into an int, used to determine which operation to do
				int valOper = Integer.parseInt(listVal.nextToken()); //turns next token into an int, used for operating on

				if (opType == 1) { //checks if the operation num is 1-- check odd or Even
					OperationFunctionalInterface ofi = (a) -> { //OFI is a functional interface, this lambda function implements the operate(int a) 
						return assign.oddEven(a); //implemented below for neatness
					};
					outputs.add(ofi.operate(valOper)); //add result to the output list
				} else if (opType == 2) { //if operation num is 2-- check for prime or composite
					OperationFunctionalInterface ofi2 = (a) -> {//explained above
						return assign.prime(a); //also below
					};
					outputs.add(ofi2.operate(valOper)); 
				} else if (opType == 3) {
					OperationFunctionalInterface ofi3 = (a) -> {//explained above
						return assign.palindrome(a); //return from method also belo
					};
					outputs.add(ofi3.operate(valOper));
				} else {
					System.out.println("This is not a valid operation type, try again"); //in case the operation number is invalid
					operationNum++; //so operation num doens't decrease if the value is incorrect
				}
				operationNum--;
			}
			for(int k = 0; k<outputs.size(); k++) {
				System.out.println(outputs.get(k)); //print out the results in one block
			}
		}catch(IOException e) {
			System.out.println("Parsing failed"); //if readline fails
		}
	}
	
	public String oddEven(Integer a) {
		return (a % 2 == 0) ? "EVEN" : "ODD"; //if a%2 is 0 it is even, else it is odd
	}
	
	public String prime(Integer a) {
		if (a <= 1) {
			return "NEITHER";
		}
		// Check from 2 to n-1
		for (int i = 2; i < a; i++) { //check method for prime 
			if (a % i == 0) {
				return "COMPOSITE";
			}
		}
		return "PRIME";
	}
	public String palindrome(Integer a) {
		String opertoStr = a + ""; //turns the value into a string
		int i = 0;
		int j = opertoStr.length() - 1;
		while (i < j) {

			// If there is a mismatch
			if (opertoStr.charAt(i) != opertoStr.charAt(j)) { //checks the values at the end and beginning, moving into the middle to see if the values are the same
				return "NON-PALINDROME"; //if not it is not a palindrome 
			}
			i += 1;
			j -= 1;
		}
		return "PALINDROME";
	}
}
