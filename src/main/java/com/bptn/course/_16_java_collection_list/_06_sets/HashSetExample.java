package com.bptn.course._16_java_collection_list._06_sets;

import java.util.Set;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		
		//create an object of HashSet
		Set<String> hash = new HashSet<>();
		hash.add("apple");
		hash.add("banana");
		hash.add("cherry");
		hash.add("mango");
		hash.add("apple");
		hash.add(null);// you can add null values
		
		System.out.println("The hashset of fruits"+ hash);
		
	}

}
//allows max 1 null value
//does not preserve insertion or natural order
//does not allow duplicates
//underlying implementation - Hash Table
//Not indexed
