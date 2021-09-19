package com.ss.java.sept17.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.java.sept17.ReturnAList;

class ReturnAListTest {
	ReturnAList tester = new ReturnAList();
	@Test
	void returnATest() {
		List <String> origList = new ArrayList <>();
		origList.add("aVal");
		origList.add("angore");
		origList.add("dfsfafsdf");
		origList.add("aValue");
		origList.add("notA");
		origList.add("AVal");
		
		List <String> aList = tester.aReturn(origList);
		
		for(int k = 0; k<aList.size();k++) {
			assertEquals('a', aList.get(k).charAt(0));
		}
		
	}

}
