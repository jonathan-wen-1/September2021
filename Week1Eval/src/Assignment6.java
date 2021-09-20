package com.ss.java.JBWeek1;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment6 { // removed it due to "illegal modifier error

	private static Connection conn = null;
	private static Assignment6 instance = null;
	static String lock = "lock";// needed for the synchronized block-- cannot use the above conn as it is null

	public static Assignment6 getInstance() {
		if (instance == null) { // using double check-- initially check if it's null, if not return the already
								// instantiated singleton
			synchronized (lock) {
				if (instance == null) { // in cases where multiple threads are running in parallel, run the check again
										// so you can't make 2 if they are instnatiated at
										// the same time
					instance = new Assignment6();
				}
			}
		}
		return instance;
	}
}
