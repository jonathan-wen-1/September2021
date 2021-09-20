package com.ss.java.JBWeek1;

public class Assignment5 {
	public static void main(String[] args) {
		Assignment5 tester = new Assignment5();
		int[] test = { 1, 2, 3, 4, 5 };
		System.out.print(tester.groupSumClump(0, test, 15));
	}

	// I am assuming that sumVal is not 0
	public Boolean groupSumClump(int addIndex, int[] list, int sumVal) {
		System.out.println("addInd:" + addIndex + "   sumVal: " + sumVal);
		if (sumVal == 0) {
			return true;
		}
		if (addIndex >= list.length) { // base case so this doens't run indefinitely-- if our reference index is
										// greater than list length we check if the
			return sumVal == 0; // sum (from which we've subtracted values) is equal to 0
		}
		int subAmount = 0; // how much we want to subtract in each step of recursion
		int k = addIndex;// we need to change our addIndex every step of recursion so we can look at
							// different numbers in the array
		while (k < list.length && list[addIndex] == list[k]) { // ASK-- why if i reverse this i get an index out of
																// bounds
			subAmount += list[k]; // for if multiple of one number appear multiple times in the list
			k++;
		}
		return groupSumClump(k, list, sumVal) || groupSumClump(k, list, sumVal - subAmount);

	}
}
