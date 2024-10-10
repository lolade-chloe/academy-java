package com.bptn.course._17_java_collection_map;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		
		//Create an object
		Map<String, Integer> hashMap = new HashMap<>();
		
		
		//K -> Key -> String
		//V -> Value -> Integer
		
		hashMap.put("Ang", 33);
		hashMap.put("Cassie", 34);
		hashMap.put("Ang", 50);
		hashMap.put("Johnnie", 21);
		hashMap.put(null, 33);
		hashMap.put(null, 23);
		hashMap.put("Bola", null);
		hashMap.put("Joke", null);
		
		System.out.println(hashMap);
		
		
		//keySet() -> return Set view of the keys
		//get(Object k) -> return the value
		for(String key: hashMap.keySet()) {
			System.out.println("Name: "+ key+ " Age: "+ hashMap.get(key));
			
		}
		
		//retrieve the age of Johnnie and print
		System.out.println("Age of Johnnie is: "+ hashMap.get("Johnnie"));
		
		//Update a value of existing key
		hashMap.replace("Joke", 40);
		
		System.out.println("The new age of Joke is: "+ hashMap.get("Joke"));
		
		//Check if a key is present in the map
		if(hashMap.containsKey("Joke")) {
			System.out.println("The key is existing.");
		} else {
			System.out.println("The key is not existing.");
		}
		
		//Check if the value is present  using containsValue
		if(hashMap.containsValue(34)) {
			System.out.println("The value is existing.");
		} else {
			System.out.println("The value is not existing.");
		}
		
		//putIfAbsent(Object k)
		hashMap.putIfAbsent("Lola", 45); // does not override already existing key pair
		
		System.out.println(hashMap);
		
		//Iterate with entrySet()
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Name: "+ entry.getKey()+ " Age: "+ entry.getValue());
		}
		
		
	}

}
//Major Key Takeaways
//
//1. does it preserve insertion order? No;
//2. Does keys allow null values? Just 1, if more the one, the newest overrides the oldest
//3. Does value allow null values? As many as you like
//4.Does keys allow duplicates? The second overrides the first
//5. Does value allow duplicates? Yes
//
