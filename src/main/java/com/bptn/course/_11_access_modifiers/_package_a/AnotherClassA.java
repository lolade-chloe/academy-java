package com.bptn.course._11_access_modifiers._package_a;

public class AnotherClassA {
	
//		// Declare a private variable
//		private int privateVar;

		// Declare a public variable
		public int publicVar;

		// declare a default variable
		int defaultVar;

		// Declare a protected variable
		protected int protectedVar;

//		// declare a private method
//		private void privateMethod() {
//			System.out.println("Private method");
//		}

		// declare a public method
		public void publicMethod() {
			System.out.println("Public method");
		}

		// declare a default method
		void defaultMethod() {
			System.out.println("Default method");
		}

		// declare a protected method
		protected void protectedMethod() {
			System.out.println("Protected method");
		}

		


	public static void main(String[] args) {
		ClassA myObj = new ClassA();
//		myObj.privateMethod();
//		System.out.println("Private Method "+ myObj.privateVar);
		myObj.publicMethod();
		System.out.println("Public Method "+ myObj.publicVar);
		myObj.defaultMethod();
		System.out.println("Default Method "+ myObj.defaultVar);
		myObj.protectedMethod();
		System.out.println("Protected Method "+ myObj.protectedVar);

	}

}
