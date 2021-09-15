package com.ss.java.sept14;
/**
 * @author jswen
 *  * This implements the shape interface, where it creates 1 new instance variable
 * Initializing a new Circle requires the user to input a radius (in the constructor) to calculate the area 
 */
public class Circle implements Shape{
	private Double radius;
	public Circle(Double radius) {
		this.radius = radius;
	}
	public static void main(String [] args) {
		Circle test = new Circle(2.0);
		System.out.println(test.display());
	}

	public Double calculateArea() {
		
		return 	Math.PI*Math.pow(radius, 2);
	}

	public String display() {
		return "The area of this circle is: " + calculateArea();
	}
	
}
