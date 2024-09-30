package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Get a number from the user
        System.out.println("Enter a number from 1 to 5. \nPress 1 for Palindrome Check\n"
                + "Press 2 to reverse a String\n"
                + "Press 3 to Concatenate two Strings\n"
                + "Press 4 for String Comparison\n"
                + "Press 5 to Calculate the Length of String");
        int num = sc.nextInt();
        
        // Consume the leftover newline after nextInt()
        sc.nextLine();
        
        // Validation to ensure valid input
        while((num < 1) || (num > 5)) {
            System.out.println(num + " is not a valid input, try again");
            num = sc.nextInt();
            
            // Consume the leftover newline again if user enters invalid input
            sc.nextLine();
        }
        
        switch(num) {
            case 1:
                // Palindrome check
            	System.out.println("Palindrome check");
                System.out.println("Enter a word");
                String palin = sc.nextLine();  // Properly read user input
                String reverse = "";
                
                // Loop to reverse the input string
                for(int i = palin.length() - 1; i >= 0; i--) {
                    reverse += palin.charAt(i);
                }
                
                // Print the reversed string
                System.out.println("Reversed: " + reverse);
                
                // Check if the word is a palindrome
                if(palin.equals(reverse)) {
                    System.out.println(palin + " is a palindrome");
                } else {
                    System.out.println(palin + " is not a palindrome");
                }
                break;
                
            case 2:
            	// To reverse a string
            	System.out.println("To reverse a string");
                System.out.println("Enter a word");
                String rev = sc.nextLine();  // Properly read user input
                String rever = "";
                
                // Loop to reverse the input string
                for(int i = rev.length() - 1; i >= 0; i--) {
                    rever += rev.charAt(i);
                }
                
                // Print the reversed string
                System.out.println(rev +" Reversed: " + rever);
                
                
                break;
                
            case 3:
            	// To concatenate a string
            	System.out.println("To concatenate a string");
                System.out.println("Enter two strings");
                String str1 = sc.nextLine();  // Properly read user input
                String str2 = sc.nextLine();
                String concat;
                
                // concatenate 2 strings
                concat = str1 + str2;
                // Print the concatenate string
                System.out.println("Concatenated String: " + concat);
                
            case 4:
            	// For String comparison
            	System.out.println("For string comparison");
                System.out.println("Enter two strings");
                String str = sc.nextLine();  // Properly read user input
                String stri = sc.nextLine();
                
                if(str.equals(stri)) {
                	System.out.println(str +" is equal to "+stri);
                } else {
                	System.out.println(str +" is not equal to "+stri);
                }
               break;
            
            case 5:
            	
            	// For String length
            	System.out.println("For string length");
                System.out.println("Enter a string");
                String l = sc.nextLine();  // Properly read user input
                int len = l.length();
                System.out.println("Then length of "+ l + " is: "+ len);
            	
           default:
        	   
        	   System.out.println("Invalid!");
        }
        
        // Close the scanner to avoid memory leak
        sc.close();
    }
}
