package com.bptn.course._16_java_collection_list._06_sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;


public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
    Set<String> link = new LinkedHashSet<>();
    link.add("A");
    link.add("B");
    link.add("C");


		// Print the size of the set
		System.out.println("Set size: "+ link.size());

		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for-each loop):");
		for(String s: link){
			System.out.println("Element: "+ s);
		}

		// Use iterator to print the elements in the set
		Iterator<String> it = link.iterator();

     System.out.println("Elements in the set (using iterator):");
		// Use remove() method to remove the element A from the set
		while(it.hasNext()){
			//String i =it.next();
			System.out.println("Element: "+ it.next());  
		}
  
    link.remove("A");
    System.out.println("Set after using remove(): "+link); 
		
    //  System.out.println("Set: "+ it.next());   
		// Use contains() method to check if the element B exists in the set
    if(link.contains("B")){
    System.out.println("Element 'B' exists in the set."); 
    }
		// Use clear() method to remove all elements from the set
		link.clear();
    System.out.println("Set after using clear(): "+link); 

        // Print the set to show that it is empty.
        
	}
}


