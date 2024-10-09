package com.bptn.course._16_java_collection_list._06_sets;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

	public static void main(String[] args) {
		//create an object of HashSet
				Set<String> tree = new TreeSet<>();
				
				tree.add("apple");
				tree.add("banana");
				tree.add("cherry");
				tree.add("mango");
				tree.add("apple");
				//tree.add(null);// you can add null values
				
				System.out.println("The hashset of fruits"+ tree);

	}

}
//does not allow null value
//does preserve insertion or natural order
//does not allow duplicates
//underlying implementation - Hash Table and doubly linked list
//Not indexed