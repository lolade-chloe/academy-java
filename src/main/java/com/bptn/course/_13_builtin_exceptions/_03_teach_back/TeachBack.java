package com.bptn.course._13_builtin_exceptions._03_teach_back;

public class TeachBack {

	
	    public static void main(String[] args) {
	    	  
	    	
	    	 try {
	             // Simulating different exceptions
	             int result = 10 / 0; // This will throw ArithmeticException
	             String str = null;
	             System.out.println(str.length()); // This will throw NullPointerException

	         } catch (ArithmeticException  |NullPointerException e) { // Multi-catch block
	             // e is implicitly final; it cannot be reassigned
	             // e = new ArithmeticException(); // This line would cause a compile error
	             
	             System.out.println("Caught an exception: " + e.getMessage());
	         }

	         System.out.println("End of program.");
	    
	    	}  
	

}

