package com.bptn.course._09_abstraction;


abstract class Shape{
	
	//abstract method have no implementation
	abstract void draw();
	abstract void print();
	
	
	//normal method -  which has implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: "+ x+y);
	}
}


//sub class (child class) extends shape class
class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Draw a circle");
	}
	
	
	@Override
	void print() {
		System.out.println("Print a circle");
	}
}

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Draw a rectangle");
	}
	
	
	@Override
	void print() {
		System.out.println("Print a rectangle");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		//Create objects from Circle class
		Circle c1 =  new Circle();
		Rectangle r1 = new Rectangle();
		
		r1.draw();
		r1.print();
		
		r1.moveTo(2,3);// this is an implementation
		
		
		c1.draw();
		c1.print();
		
		c1.moveTo(2,3);

	}

}
