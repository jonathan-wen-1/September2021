package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment5;

class Assignment5Test {
	Assignment5 tester = new Assignment5();

	@Test
	void test() {
		int[] test = { 1, -2, 3, 4, 5 };
		int[] test2 = { 1, 3, 3, 3, 4, 7, 9 };
		assertTrue(tester.groupSumClump(0, test, -1));
		assertTrue(tester.groupSumClump(0, test2, 25));
	}

}
