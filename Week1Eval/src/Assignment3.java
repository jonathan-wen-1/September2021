package com.ss.java.JBWeek1;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
	public List<Integer> doubleVal(List<Integer> ints) {
		List<Integer> returnList = ints.stream().map(ind -> ind * 2).collect(Collectors.toList());
		// maps the value *2 using intermediate operation map, then collects to new list
		return returnList;
	}
}
