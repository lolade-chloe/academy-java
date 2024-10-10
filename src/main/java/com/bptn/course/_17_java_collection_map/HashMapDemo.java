package com.bptn.course._17_java_collection_map;

//Import the HashMap class
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

 public static void main(String[] args) {
     Map<String, Integer> people = new HashMap <>();
     people.put("Angie", 33);
     people.put("Steve", 30);
     people.put("John", 32);

     for(String i: people.keySet()){
         System.out.println("Name: "+i+", Age: "+people.get(i));
     }
     

 }
}

