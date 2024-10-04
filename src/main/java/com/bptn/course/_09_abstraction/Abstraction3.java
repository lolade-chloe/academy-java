package com.bptn.course._09_abstraction;

//From Java-8

interface Operations{
	
	void draw(); //abstract method- it has o implementation
	
	
	//default method- has some implementation
	default int add(int a, int b) {
		return a+b;
	}
	
	//static method
	static double getRandomNumber(){
		return Math.random();
	}
}

//sub class -create a sub class that implements or override the methods in the abstract methods from the interface
class Calculator implements Operations{
	
	//compiler always enforces the sub class to implement or override the methods in the abstract methods from the interface
	@Override
	public void draw() {
		
		System.out.println("Draw method implemented by calculator class");
	}
}


public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2,3);
		
		System.out.println("The result is: " +result);
		System.out.println("The random number is: "+ Operations.getRandomNumber());

	}

}
