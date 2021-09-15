package com.ss.java.sept14;
/**
 * @author jswen
 * Interface "Shape" that is implemented by Rectangle, Circle, and Triangle
 */
public interface Shape {
	abstract Double calculateArea(); // no need to create a default, as there is no defualt formula for area
	
	default String display() { //just wanted to try out default methods we learned in class here-- abstract format below
		return "Nothing to show here";
	}
	//abstract String display();
}
