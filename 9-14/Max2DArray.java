package com.ss.java.sept14;

public class Max2DArray {

	public static void main(String[] args) {
		Integer [][] tester = {{1,2,999,4},{1,2,3,6},{9000,201010,1,45,11}}; //test case, should return max of 201010 and position 2,1
		Max2DArray maxFinder = new Max2DArray();
		System.out.println("Max value: " + maxFinder.maximum(tester));
	}
	public String maximum(Integer[][] a) {
		Integer maxVal = a[0][0];
		Integer xVal=0; //initial max position is at 0,0
		Integer yVal=0;
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<a[i].length; k++) {
				if(a[i][k] > maxVal){ //if the value at the current index is larger than the current maxVal
					maxVal = a[i][k];
					xVal=i; //to output the first position 
					yVal=k; //to output the second position
				}
			}
		}
		return "Maximum value is: " + maxVal + " at position: [" +xVal + "][" + yVal + "]";
	}
}	
