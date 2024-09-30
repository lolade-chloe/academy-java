package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 23;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int guess = sc.nextInt();
        
        if (guess>=1 && guess<=100 ){
            if(guess== targetNumber){
                System.out.println("Congratulations! You guessed the number correctly!");
            } else if(guess > targetNumber){
                System.out.println("Too high! Try again.");
            } else if(guess < targetNumber){
                System.out.println("Too low! Try again.");
            }
        } 
         else{
            System.out.println("Please enter a number between 1 and 100.");
        }

        sc.close();
        }


    }

