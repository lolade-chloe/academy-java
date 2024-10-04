package com.bptn.course._10_static_concept;

public class ClassName {
	
	
	//declare a static variable
	static int staticVariable = 100;
	
	//declare an instance variable
	int instanceVariable;
	
	//declare a static method
	static void staticMethod() {
		
		System.out.println("Static method is called...");
	}
	
	void instanceMethod() {
		System.out.println("Instance method is called...");
		
		System.out.println("Static variable: "+ staticVariable);
		staticMethod();
	}
	
	public static void main(String[] args) {
		
		ClassName c1 = new ClassName();
		c1.instanceMethod();
		
		//Access the static variable
		System.out.println("Static variable: "+ staticVariable);
		staticMethod();

	}

}
