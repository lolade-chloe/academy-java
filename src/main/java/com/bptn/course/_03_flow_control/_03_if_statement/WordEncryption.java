package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class WordEncryption {

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        
        // Read the word from the user
        String word = sc.nextLine();
        String encrypt = "";  // String to hold the encrypted word
        
        // Loop through each character in the input word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);  // Get each character from the string
            char charac;  // To store the encrypted character
            
            // If the character is an uppercase letter (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Shift the character by one position in the alphabet
                charac = (char) (ch + 1);
                
                // If it exceeds 'Z', wrap around to 'A'
                if (charac > 'Z') {
                    charac = 'A';
                }
                
            } 
            // If the character is a lowercase letter (a-z)
            else if (ch >= 'a' && ch <= 'z') {
                // Shift the character by one position in the alphabet
                charac = (char) (ch + 1);
                
                // If it exceeds 'z', wrap around to 'a'
                if (charac > 'z') {
                    charac = 'a';
                }
                
            } 
            // For non-alphabetic characters, leave them unchanged
            else {
                charac = ch;
            }
            
            // Append the encrypted character to the result string
            encrypt += charac;
        }

        // Display the final encrypted word
        System.out.println("Encrypted word: " + encrypt);
    }
}

