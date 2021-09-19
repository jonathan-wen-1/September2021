package com.ss.java.sept17.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import com.ss.java.sept17.DateTime;

class DateTimeTest {
	DateTime dt = new DateTime();
	@Test
	void daysInMonthTest() {
		assertThrows(NullPointerException.class, () ->{
			dt.daysInMonth(null);
		});
	}
	
	@Test
	void mondaysInMonthTest() {
		assertThrows(NullPointerException.class, ()->{
			dt.daysInMonth(null);
		});
	}
	
	@Test
	void friday13Test() {
		LocalDate fri13 = LocalDate.of(2021, Month.AUGUST, 13);
		LocalDate notFri = LocalDate.now();
		assertTrue(dt.friday13(fri13));
		assertFalse(dt.friday13(notFri));
	}
}
