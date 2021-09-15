/**
 * 
 */
package com.ss.java.sept14;

/**
 * @author jswen
 * This implements the shape interface, where it creates 2 new instance variables
 * Initializing a new Triangle requires the user to input a base and height (in the constructor) to calculate the area 
 */
public class Triangle implements Shape{
	
	private Double base;
	private Double height;
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height=height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle test = new Triangle(2.0,5.0);
		System.out.println(test.display());
	}
	
	public Double calculateArea() {
		return 0.5*base*height;
	}
	public String display() {
		// TODO Auto-generated method stub
		return "The area of this triangle is: " + calculateArea();
	}
	
}
