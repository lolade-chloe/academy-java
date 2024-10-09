package com.bptn.course._16_java_collection_list._06_sets;

import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		//create an object of HashSet
		Set<String> linkHash = new LinkedHashSet<>();
		
		linkHash.add("apple");
		linkHash.add("banana");
		linkHash.add("cherry");
		linkHash.add("mango");
		linkHash.add("apple");
		linkHash.add(null);// you can add null values
		
		System.out.println("The hashset of fruits"+ linkHash);

	}

}
//allows max 1 null value
//does preserve insertion or natural order because it uses hash table as well as a doubly linked list
//does not allow duplicates
//underlying implementation - Hash Table and doubly linked list
//Not indexed
