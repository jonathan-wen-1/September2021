package com.ss.java.sept17;

import java.util.Arrays;
public class BasicLambdas {
		
	public static void main(String[] args) {
		BasicLambdas tester = new BasicLambdas();
		String [] words = {"i", "tester", "am", "ecast", "try", "longestInList", "ecars", "eee", "e", "not-e"};
//		tester.sortLength(words);
//		tester.revSortLength(words);
//		tester.sortAlpha(words);
		tester.staticSortByE(words);
		for(int k = 0; k < words.length; k++) {
			System.out.println(words[k]);
		}
	}
	//Arrays.sort here takes in the array, and a comparator and sorts by that comparator
	public String[] sortLength(String [] words) {
		Arrays.sort(words, (String a, String b) -> a.length()-b.length()); //-1 goes before, 0 is same, +1 goes after
		return words;
	}
	public String[] revSortLength(String [] words) {
		Arrays.sort(words, (String a, String b) -> b.length()-a.length());//reverses the comparator so longer words will be first
		return words;
	}
	public String[] sortAlpha(String [] words) {
		Arrays.sort(words, (String a, String b) -> a.charAt(0) - b.charAt(0));//look at charAt(0), and subtract by ascii value 
		return words;
	}
	public String[] sortByE(String [] words) {
		Arrays.sort(words, (String a, String b) -> 
			a.charAt(0)=='e' ? -1 : b.charAt(0)=='e' ? 1 : 0); //series of conditions, if charAt(0) for a is e, puts it before, else if b has an e, puts a after b, else 
															   //they are treated as the same (non-e starting strings)

		return words;
	}
	public String[] staticSortByE(String [] words) {
		Arrays.sort(words, (String s1, String s2) ->LambdaHelper.sortbyE(s1, s2));
		return words;
	}
}
	