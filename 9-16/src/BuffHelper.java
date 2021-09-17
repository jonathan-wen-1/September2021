package com.ss.java.sept16;

import java.util.LinkedList;

public class BuffHelper {
	Integer maxItems = 5;
	LinkedList <Integer> prodList = new LinkedList<>();
	Integer numAdd=0;
	public void prodItem() {
		try {

			while(true) { //referenced geeksforgeeks.org for this specific implementation, but infinitely
						  //loops between adding product and consuming
				synchronized(this) {//for thread safety, as we will have multiple threads accessing linked list
					while(prodList.size()==maxItems) {//if the list is full, will not add more
						wait();
					}
					 //to differentiate the items from eachother, should constantly increment
					System.out.println("Added product number: " + numAdd);
					prodList.add(numAdd++);
					System.out.println(prodList);
//					numAdd+=1;
					notify();
					Thread.sleep(1000);
				}
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	
	public void consItem() {
		try {
			while(true) { //this method is very similar to prodItem, but removes instead
				synchronized(this) {//for thread safety, as we will have multiple threads accessing linked list
					while(prodList.size()==0) {//if the list is empty, cannot consume
						wait();
					}
					Integer consumeProd= prodList.removeFirst();
					System.out.println("Consumed product: " + consumeProd);
					System.out.println(prodList);
					notify();
					Thread.sleep(1000);
				}
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
