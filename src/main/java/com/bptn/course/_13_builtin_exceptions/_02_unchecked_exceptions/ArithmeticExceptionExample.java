package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
//		
//		try {
//		//Critical statement
//		int result = 10/0;
//		System.out.println(result);
//		} catch(ArithmeticException e) {
//			System.out.println("An error occured: "+ e);
//		}
//		
//		int[] myArray = {10,20,30,40,50};
//		try {
//			System.out.println(myArray[10]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("An error occurred: "+ e.getMessage());
//		}
		String a = null;
		try {
			System.out.println("Length of the string");
		} catch(NullPointerException e) {
			System.out.println("An error occurred :"+ e.getMessage());
		}

	}

}
