package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment2;

class Assignment2Test {
	
	Assignment2 tester = new Assignment2();
	@Test
	void testReturnDigit() {
		List<Integer> testList = new ArrayList<>();
		testList.add(111);
		testList.add(9432);
		testList.add(14913);
		testList.add(4);
		testList.add(9815);
		List<Integer> testList2 = new ArrayList<>();
		for(int k = 1; k<=5; k++) {
			testList2.add(k);
		}
		List<Integer> newList=tester.rightDig(testList);
		for(int j = 0; j< testList.size(); j++) {
			assertEquals(newList.get(j), testList2.get(j));
		}
	}

}
