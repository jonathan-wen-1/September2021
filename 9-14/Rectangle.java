package com.ss.java.sept14;
/**
 * @author jswen
 * This implements the shape interface, where it creates 2 new instance variables
 * Initializing a new Rectangle requires the user to input a length and width (in the constructor) to calculate the area 
 */
public class Rectangle implements Shape{
	private Double length;
	private Double width;
	public Rectangle(Double length,Double width) {
		this.length = length;
		this.width = width;
	}
	public static void main(String[] args) {
		Rectangle test = new Rectangle(333.00, 3.00); //test
		System.out.println(test.display());
		

	}
	public Double calculateArea() { //calculates the area of a rectangle, length*width
		return length*width;
	}
	public String display() { //Specifies that this is a rectangle and the area
		return "The area of this rectangle is: " + calculateArea();
	}
}
