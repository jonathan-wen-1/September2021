package com.ss.java.sept16;

public class SingletonDC {
	volatile private static SingletonDC inst;
	
	private SingletonDC(){
		//private constructor for singleton so it can't be called by anything
	}
	
	public static SingletonDC getInstance() {
		if(inst ==null) { //first unlocked check for if inst isn't null
			synchronized(SingletonDC.class) {//synchronized for second locked check so if
											 //multiple threads cannot instantiate the singleton in parallel
				if(inst ==null) {
					inst = new SingletonDC(); //if both checks pass then it will create only one
				}
			}
		}
		return inst;//returns the instance
	}
}
