package com.ss.java.sept17;

import java.util.List;
import java.util.stream.Collectors;

public class Java8List {

	public List<String> appendOE(List <Integer> s){
		List <String> ret = s.stream().map(ind->appendHelper(ind)).collect(Collectors.toList());
		
		return ret;
	}
	public String appendHelper(Integer i) {
		if(i%2==0) {
			return "e"+i;
		}
		else {
			return "o"+i;
		}
	}
}
