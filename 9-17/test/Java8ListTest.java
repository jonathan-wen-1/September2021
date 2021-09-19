package com.ss.java.sept17.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.java.sept17.Java8List;

class Java8ListTest {
	Java8List jList = new Java8List();
	@Test
	void OETest() {
		List <Integer> intList = new ArrayList<>();
		for(int k = 1; k<=5; k++) {
			intList.add(k);
		}
		List <String> strList = new ArrayList<>();
		strList.add("o1");
		strList.add("e2");
		strList.add("o3");
		strList.add("e4");
		strList.add("o5");
		
		List <String> strList2 = jList.appendOE(intList);
		
		for(int k = 0; k<strList2.size();k++) {
			assertEquals(strList.get(k),strList2.get(k));
		}
	}
	@Test
	void helperTest() {
		String s = "o101";
		String s2 = "e222222";
		Integer one = 101;
		Integer two = 222222;
		String sOne =jList.appendHelper(one);
		String sTwo = jList.appendHelper(two);
		
		assertEquals(s,sOne);
		assertEquals(s2,sTwo);
	}
}
