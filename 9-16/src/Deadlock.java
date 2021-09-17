package com.ss.java.sept16;

public class Deadlock {
	public static void main(String [] args) {
		String subOne = "first";
		String subTwo = "second";
		
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				synchronized(subOne) { //first sync
					System.out.println("Appending sub1 to sub2");
					synchronized(subTwo) { //second sync
						System.out.println(subTwo + subOne);//MAY sometimes print, but if deadlocked, will not
					}
				}
				
			}
		};
		
		Runnable deadlockRun = new Runnable() {

			@Override
			public void run() {
				synchronized(subTwo) {//first sync, opposite parameter from run1
					System.out.println("Appending sub2 to sub1");
					synchronized(subOne) {//second sync, should cause deadlock because requesting 
										  //the other value from run1 
						System.out.println(subOne + subTwo);//MAY sometimes print, but if deadlocked, will not
					}
				}
			}
			
		};
		
		new Thread(run1).start();
		new Thread(deadlockRun).start();
		/*
		 * NOTE: this will not always cause deadlock, only when the two runnables try to execute exactly
		 * parallel- this causes deadlock because in run1, the synchronized on sub2 is waiting on sub1 to 
		 * finish, while the opposite is happening in deadlockRun. The deadlock occurs when synchronize in
		 * run1 on subOne is finished and needs subTwo for the next synchronize, but deadlockRun is using
		 * that subTwo and needs run1-- thus both runnables are waiting for the other to finish and cannot
		 * continue unless it has the other
		 */
		System.out.println("Even though this is printed, code may not terminate");
	}
}
