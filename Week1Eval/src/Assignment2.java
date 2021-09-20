package com.ss.java.JBWeek1;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
	public List<Integer> rightDig(List<Integer> origList) {
		List<Integer> returnList = origList.stream().map(val -> val % 10).collect(Collectors.toList());
		// map takes in function val %10, terminal operation collect returns a new
		// collection to make returnList
		return returnList;
	}
}
