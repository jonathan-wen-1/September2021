package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment1;

class Assignment1Test {
	Assignment1 tester = new Assignment1();

	@Test
	void testEvenOdd() {
		assertEquals("ODD", tester.oddEven(11));
		assertEquals("EVEN", tester.oddEven(10));
	}

	@Test
	void testPrime() {
		assertEquals("PRIME", tester.prime(7));
		assertEquals("NEITHER", tester.prime(1));
		assertEquals("COMPOSITE", tester.prime(12));
	}

	@Test
	void testPalindrome() {
		assertEquals("NON-PALINDROME", tester.palindrome(10100));
		assertEquals("PALINDROME", tester.palindrome(1442441));
	}
}
