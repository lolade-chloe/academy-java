package com.bptn.course._11_access_modifiers._package_b;

import com.bptn.course._11_access_modifiers._package_a.ClassA;


public class ClassB extends ClassA{
	



	public static void main(String[] args) {
		ClassA myObj = new ClassA();
		ClassB myObj1 = new ClassB();
//		myObj.privateMethod();
//		System.out.println("Private Method "+ myObj.privateVar);
		myObj.publicMethod();
		System.out.println("Public Method "+ myObj.publicVar);
//		myObj.defaultMethod();
//		System.out.println("Default Method "+ myObj.defaultVar);
		myObj1.protectedMethod();
		System.out.println("Protected Method "+ myObj1.protectedVar);

	}

}
