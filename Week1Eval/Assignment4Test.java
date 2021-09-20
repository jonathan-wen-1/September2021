package com.ss.java.JBWeek1Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.java.JBWeek1.Assignment3;
import com.ss.java.JBWeek1.Assignment4;

class Assignment4Test {
	Assignment4 tester = new Assignment4();

	@Test
	void test() {
		List<String> origList = new ArrayList<>();
		origList.add("aaxaaxx");
		origList.add("ofixi");
		origList.add("");
		origList.add("oiisix");
		origList.add("xxxxxxxxxxxxxx");
		origList = tester.removeX(origList);
		List<String> newList = new ArrayList<>();
		newList.add("aaaa");
		newList.add("ofii");
		newList.add("");
		newList.add("oiisi");
		newList.add("");
		for (int k = 0; k < origList.size(); k++) {
			assertEquals(origList.get(k), newList.get(k));
		}
	}

}
