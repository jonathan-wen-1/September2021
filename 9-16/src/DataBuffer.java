package com.ss.java.sept16;


public class DataBuffer {
	public static void main(String [] args) {
		BuffHelper buff = new BuffHelper();
		
		Thread prodThread = new Thread(new Runnable() { //thread for adding product

			@Override
			public void run() {
				buff.prodItem();
				
			}
			
		});
		Thread constThread = new Thread(new Runnable() {//thread for consuming product 

			@Override
			public void run() {
				buff.consItem();
				
			}
			
		});
		
		prodThread.start();
		constThread.start();
		try {
			//joins make it so that one thread will wait until another completes execution
			//we have a wait inside the conditions while size==capacity for product and size==0 for consume
			//so when either happens the other thread will continue
			prodThread.join(); 
			constThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

