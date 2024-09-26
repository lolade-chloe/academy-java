package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Declare and initialize an array with 6 values
		
		int[] myArray = {3,5,7,9,11,13};
		
		//Print the first and second element to the console
		System.out.println("First element: "+ myArray[0]);
		System.out.println("Second element: "+ myArray[1]);
		
		//Update the first element to 30
		myArray[0] =30;
		
		System.out.println("Updated first element: "+ myArray[0]);
		
		//Updating the element of the array using length property (without the inde) and set it to 130
		
		myArray[myArray.length-1] = 130;
		
		System.out.println("Updated last element: "+ myArray[myArray.length-1]);
		
		//For loop to print values from 1 to 10
		
		
		//to print all elements of the array lvvbn/.,m 
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println(Arrays.toString(myArray));
	}
}
