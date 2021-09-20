package com.ss.java.JBWeek1;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment4 {
	public List<String> removeX(List<String> s) {
		List<String> returnList = s.stream().map(ind -> ind.replace("x", "")).collect(Collectors.toList());
		// .replace is String method
		return returnList;
	}
}
