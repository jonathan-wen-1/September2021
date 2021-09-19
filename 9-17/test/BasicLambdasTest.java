package com.ss.java.sept17.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.java.sept17.BasicLambdas;

class BasicLambdasTest {
	BasicLambdas b = new BasicLambdas();
	@Test
	void testLength() {
		String [] list1 = {"aa", "aaaa", "a", "aaa"};
		String [] list2 = {"a", "aa", "aaa", "aaaa"};
		b.sortLength(list1);
		for(int k = 0; k<list1.length; k++) {
			assertEquals(list1[k], list2[k]);
		}
	}
	@Test
	void testRevLength() {
		String [] list1 = {"aa", "aaaa", "a", "aaa"};
		String [] list2 = {"aaaa", "aaa", "aa", "a"};
		b.revSortLength(list1);
		for(int k = 0; k<list1.length; k++) {
			assertEquals(list1[k], list2[k]);
		}
	}
	@Test
	void testsortAlpha(){
		String [] list1 = {"f", "e", "d", "c", "b", "a"};
		String [] list2 = {"c", "f", "a", "b", "e", "d"};
		String [] list3 = {"a", "b", "c", "d", "e", "f"};
		b.sortAlpha(list1);
		b.sortAlpha(list2);
		for(int k = 0; k<list1.length; k++) {
			assertEquals(list1[k], list3[k]);
			assertEquals(list2[k], list3[k]);
		}
	}
	@Test
	void testSortE() {
		String [] list1 = {"nnnn", "e", "nn", "eeeee"};
		int eCount = 0;
		for(int k = 0; k< list1.length; k++) {
			if(list1[k].charAt(0)=='e') {
				eCount++;
			}
		}
		b.sortByE(list1);
		for(int j = 0; j<eCount; j++) { //the first eCount indexes in the sorted list should all have charAt(0) e
			assertEquals('e', list1[j].charAt(0));
		}
	}
	
	@Test
	void testStaticSortE() {
		String [] list1 = {"nnsdfnn", "e", "nn", "eeeee", "asdfadsf", "eeee", "easdf"};
		int eCount = 0;
		for(int k = 0; k< list1.length; k++) {
			if(list1[k].charAt(0)=='e') {
				eCount++;
			}
		}
		b.staticSortByE(list1);
		for(int j = 0; j<eCount; j++) { //the first eCount indexes in the sorted list should all have charAt(0) e
			assertEquals('e', list1[j].charAt(0));
		}
	}
}
