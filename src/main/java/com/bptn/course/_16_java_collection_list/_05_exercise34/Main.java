package com.bptn.course._16_java_collection_list._05_exercise34;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
       //create an ArrayList of names
       List<String> nameList = new ArrayList<String>();
       nameList.add("Robert");
       nameList.add("Samson");
       nameList.add("Alex");
       nameList.add("William");
       // print the element of the ArrayList
       System.out.println("Elements of List: " + nameList);
       // Create an array of String named output of the same size as nameList.
       String[] output = new String[nameList.size()];
       // Fetch the elements from the nameList and insert them into the newly created array.
       for (int i = 0; i < nameList.size(); i++) {
            output[i] = nameList.get(i);
        }
       // Hint: Use the get() method to fetch the elements from the arraylist
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + "  ");
        }
    }
}
