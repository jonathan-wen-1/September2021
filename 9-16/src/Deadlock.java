package com.ss.java.sept16;

public class Deadlock {
	public static void main(String [] args) {
		String subOne = "first";
		String subTwo = "second";
		Object lock1 = new Object();
		Object lock2 = new Object();
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(lock1) { //first sync
						Thread.sleep(1000);//To ensure deadlock will happen, and let deadlockRun lock sub2 before continuing
						System.out.println("Appending sub1 to sub2");
						synchronized(lock2) { //second sync
							System.out.println(subTwo + subOne);
						}
					}
				}catch(InterruptedException e) {
					System.out.println("Interrupted");
				}
				
			}
		};
		
		Runnable deadlockRun = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized(lock2) {//first sync, opposite parameter from run1
						Thread.sleep(1000);//To ensure deadlock
						System.out.println("Appending sub2 to sub1");
						synchronized(lock1) {//second sync, should cause deadlock because requesting 
											  //the other value from run1 
							System.out.println(subOne + subTwo);
						}
					}
				}catch(InterruptedException e) {
					System.out.println("Interrupted");
				}
			}
			
		};
		
		new Thread(run1).start();
		new Thread(deadlockRun).start();
		//Deadlock happens because of Thread.sleep, which will help allow deadlockRun start and lock on lock2
		//while run1 is still locked on lock1, so when they go into their second synchronized blocks they want the other
		//run's resources while still locked on the one the other one wants thus creating deadlock
		System.out.println("Even though this is printed, code may not terminate");
	}
}
