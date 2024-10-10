package com.bptn.course._17_java_collection_map;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("Ang", 33);
		linkedhashMap.put("Cassie", 34);
		//`linkedhashMap.put("Ang", 50);
		linkedhashMap.put("Johnnie", 21);
		linkedhashMap.put(null, 33);
		//linkedhashMap.put(null, 23);
		linkedhashMap.put("Bola", null);
		linkedhashMap.put("Joke", null);
		
		System.out.println(linkedhashMap);
		//access the value in LinkedHashMap
		System.out.println("Jane's age is: "+ linkedhashMap.get("Joke"));
		
		//loop over the LinkedhashMap using 
		for(Map.Entry<String, Integer> entry : linkedhashMap.entrySet()) {
			System.out.println("Name: "+ entry.getKey()+ " Age: "+entry.getValue());
		}
		
		Iterator<Map.Entry<String, Integer>> it = linkedhashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("Name: "+ entry.getKey()+" Age: "+ entry.getValue());
		}
	}

}
//Major Key Takeaways
//
//1. does it preserve insertion order? Yes;
//2. Does keys allow null values? allows max 1 null value
//3. Does value allow null values? As many as you like
//4.Does keys allow duplicates? The second overrides the first
//5. Does value allow duplicates? Yes
//