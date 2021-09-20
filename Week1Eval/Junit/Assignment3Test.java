package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment3;

class Assignment3Test {
	Assignment3 tester = new Assignment3();
	@Test
	void testDoubleVal() {
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		for(int k = 1; k<=5; k++) {
			firstList.add(k);
			secondList.add(k*2);
		}
		firstList = tester.doubleVal(firstList);
		for(int k = 0; k<firstList.size();k++) {
			assertEquals(firstList.get(k),secondList.get(k));
		}
	}
	void testEmpty() {
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		firstList = tester.doubleVal(firstList);
		for(int k = 0; k<firstList.size();k++) {
			assertEquals(firstList.get(k),secondList.get(k));
		}
	}
}
