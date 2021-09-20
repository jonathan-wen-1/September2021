package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment6;

class Assignment6Test {
	@Test
	void testInstance() {
		Assignment6 test1 = Assignment6.getInstance();
		Assignment6 test2 = Assignment6.getInstance();

		assertTrue(test1.equals(test2));
		assertEquals(test1, test2);
	}

}
