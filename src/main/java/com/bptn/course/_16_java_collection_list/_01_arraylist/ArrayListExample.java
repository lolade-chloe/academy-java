package com.bptn.course._16_java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayyList<>();
		
		//2nd way of declaring an ArrayList
		List<Integer> arrayList = new ArrayList<>();
//		int[] arr = {1,2,3,4,5,5};
//		for(int i=0; i<6; i++) {
//		System.out.println(arr[i]);
//		}
		
		//add values into  arrayList
		arrayList.add(100);
		arrayList.add(null);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(null); //ArrayList allows duplicate null values
		arrayList.add(400);
		
		arrayList.add(6, 5000);
		arrayList.set(1, 200);
		
		arrayList.remove(0);
		System.out.println();
		
		System.out.println(arrayList); 
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for(Integer element: arrayList) {
			System.out.println(element);
		}
	}
}
//<> diamond operators -. java Generics
