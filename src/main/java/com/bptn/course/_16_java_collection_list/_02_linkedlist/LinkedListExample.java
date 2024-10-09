package com.bptn.course._16_java_collection_list._02_linkedlist;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedListExample {

	public static void main (String args[]) {
		
		List<String> col = new LinkedList<>();
		//add at the beginning
		col.addFirst("Red");
		//add at the end
		col.addLast("Green");
		
		System.out.println("LinkedList adding colors"+ col);
		
		//remove the first;
		col.removeLast();
		
		//to remove the first
		col.removeLast();
		
		System.out.println("LinkedList adding colors"+ col);
		
		col.add("blue");
		col.add("pink");
		col.add("yellow" );
		col.add("blue");
		col.add("pink");
		System.out.println("LinkedList adding colors"+ col);
		
		//remove at a certain index
		col.remove(1);
		
		System.out.println("LinkedList adding colors"+ col);
		
		//add at a certain index
		col.add(1, "purple");
		System.out.println("LinkedList adding colors"+ col);
		
//		//access elements at a specific index
//		System.out.println("Access an element at index 2 "+ col.get(2));
//		col.add(null);
//		System.out.println("LinkedList adding colors"+ col);
		
		//access elements using a for loop
		for(int i = 0; i<col.size(); i++) {
			System.out.println("LinkedList all colors "+ col.get(i));
		}
		
		//access elements 
		for(String element: col) {
			System.out.println("LinkedList  colors for each "+ element);
		}
		
		//Using an iterator to access elements
		//Iterator is not a class but an interface
		Iterator<String> it = col.iterator();
		
		//iterate through a while loop
		while(it.hasNext()) {
			System.out.println("LinkedList colors to get next using iterator "+ it.next());
		}
		
		//Remove an element
//		Iterator<String> iterate = col.iterator();
//		while(iterate.hasNext()) {
//			
//			String colos = iterate.next();
//			if(cols.equals("purple")) {
//				iterate.remove(); //This would cause a null pointer exception since the list consists of null values
//				System.out.println("LinkedList remove colors with iterator ");
//			}
//			
//		}
		//Add an element using listIterator (sub interface of iterator)
		ListIterator<String> listIt = col.listIterator();
		
		while(listIt.hasNext()) {
			String cols = listIt.next();
			if(cols.equals("pink")) {
				listIt.add("black");
				System.out.println("The color is added successfully");
			}
		}
		System.out.println("The list after adding color"+col);
		
	}
}
//Can have duplicates? Yes
//Can it preserve insertion order? Yes
//Can it have null values? Yes
