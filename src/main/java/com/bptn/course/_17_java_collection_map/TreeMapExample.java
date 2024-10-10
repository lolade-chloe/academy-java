package com.bptn.course._17_java_collection_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> tree = new TreeMap<>();
		
		tree.put("Jane", 24);
		tree.put("Joseph", 24);
		tree.put("Janet", 55);
		tree.put("Janet", 34);
		tree.put("Jacob", null);
		tree.put("Janine", null);
		//tree.put(null, 64);
		
		System.out.println(tree);
		
		//access an element
		System.out.println("Johnson's age is: "+tree.get("Jane"));
		
		//access the first key
		System.out.println("Get the first key"+ tree.firstKey());
		
		//Access first entry
		System.out.println("Get the first key"+ tree.firstEntry());
	}

}
//Major Key Takeaways
//
//1. does it preserve insertion order? Yes;
//2. Does keys allow null values? no null keys
//3. Does value allow null values? As many as you like
//4.Does keys allow duplicates? The second overrides the first
//5. Does value allow duplicates? Yes
//
