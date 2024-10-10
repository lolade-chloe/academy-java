package com.bptn.course._16_java_collection_list._07_maps._01_self_led;

import java.util.Set;
import java.util.HashSet;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		Set<String> set = new HashSet<> ();
		set.add("A");
		set.add("B");
		set.add("C");

		// Print the size of the set
		System.out.println("Set size: "+ set.size());

		// Use for loop to print the values in the set
		for(String i : set){
			System.out.println("Value: "+i);
		}

		// Use add() method to add a new value to the set
		System.out.println("Set after using add():");
		set.add("D");
		for(String i : set){
			System.out.println("Value: "+i);
		}

		// Use remove() method to remove a value from the set
		set.remove("A");

		System.out.println("Set after using remove():");
		for(String i : set){
			System.out.println("Value: "+i);
		}
		// Use contains() method to check if the value "C" exists in the set
		if(set.contains("C")){
			System.out.println("Value 'C' exists in the set.");
		} else{
			System.out.println("Value 'C' does not exist in the set."); 
		}
		

	}
}