package com.ss.java.sept16;

public class SingletonDC {
	volatile private static SingletonDC inst;
	static String lock = "lock"; //lock on this
	private SingletonDC(){
		//private constructor for singleton so it can't be called by anything
	}
	
	public static SingletonDC getInstance() {
		if(inst ==null) { //first unlocked check for if inst isn't null
			synchronized(lock) {//synchronized for second locked check so if
											 //multiple threads cannot instantiate the singleton in parallel
				if(inst ==null) {
					inst = new SingletonDC(); //if both checks pass then it will create only one
				}
			}
		}
		return inst;//returns the instance
	}
}
