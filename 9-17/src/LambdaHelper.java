package com.ss.java.sept17;

public class LambdaHelper {
	public static Integer sortbyE(String s1, String s2) {
		if(s1.charAt(0) == 'e') {
			return -1;
		}
		else if(s2.charAt(0) == 'e') {
			return 1;
		}
		return 0;
	}
}
