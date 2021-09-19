package com.ss.java.sept17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnAList {
	public List<String> aReturn(List <String> s){
		List <String> aRet = s.stream().filter(ind -> ind.startsWith("a")).collect(Collectors.toList());
		return aRet;
	}
}
