package com.bptn.course._12_wrapper_class;

public class Main {

	public static void main(String[] args) {


//		Autoboxing -convert primitive type to wrapper class
		Integer intobj = Integer.valueOf(100);
		//Alternatively we can also convert a primitive type to a wrapper class
		Integer intobj1 = 20;
		
		//Unboxing
		int objpri = intobj; //This is preferred
		
		//alternatively
		int objpri1 = intobj1.intValue();
				
			

	}

}
