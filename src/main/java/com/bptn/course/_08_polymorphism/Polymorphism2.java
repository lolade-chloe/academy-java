package com.bptn.course._08_polymorphism;

class Shape{
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

class Rectangle extends Shape{
	
	@Override
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}

public class Polymorphism2 {
	

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.drawAngle();

	}

}
