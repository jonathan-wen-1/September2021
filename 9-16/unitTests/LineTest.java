package com.ss.java.sept16.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.java.sept16.Line;

class LineTest {
	
	@Test
	void testGetSlope() {
		Line lineTest1 = new Line(2, 4, 2, 1);
		assertThrows(ArithmeticException.class, lineTest1::getSlope);
		Line lineTest2 = new Line(2,4,1,1);
		assertEquals(3,lineTest2.getSlope());
	}
	
	@Test
	void testGetDistance() {
		Line lineTest1 = new Line(1,2,4,7);
		assertEquals(Math.sqrt(34),lineTest1.getDistance());
		assertNotEquals(100, lineTest1.getDistance());
	}
	
	@Test
	void testParallel() {
		Line lineTest1 = new Line(1,2,3,4);
		Line lineTest2 = new Line(2,4,6,8);
		Line lineTest3 = new Line(2,9,1,5);
		assertEquals(true, lineTest1.parallelTo(lineTest2));
		assertEquals(false, lineTest1.parallelTo(lineTest3));
	}
}
