package com.bptn.course._03_flow_control._03_if_statement;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
    	
    	//Scanner object to read input from users
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        
        //loop to ensure valid number is being inputed from users
        while((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num!= 6) && (num != 7) ){
            System.out.println(num+ " is not valid. \nEnter a valid number");
            num = sc.nextInt();
        } 
        
        double a, b, add, sub, mul, div, sq,sqRt,rec;
        
        if (num == 1){
        	//Statement to add numbers
            System.out.println("Enter two numbers");
            a = sc.nextDouble(); 
            b = sc.nextDouble();
            add = a + b;
            System.out.println("The sum of "+ a+ " and "+ b+ " is: " +add);
        } else if(num == 2){
        	
            System.out.println("Enter two numbers");
            a = sc.nextDouble();
            b = sc.nextDouble();
          //Statement to subtract numbers
            sub = a - b;
            System.out.println(sub);
        } else if(num == 3){
            System.out.println("Enter two numbers");
            a = sc.nextDouble();
            b = sc.nextDouble();
          //Statement to multiply numbers
            mul = a * b;
            System.out.println(mul);
        } else if(num == 4){
            System.out.println("Enter a numbers");
            a = sc.nextDouble();
            b = sc.nextDouble();
          //Statement to divide numbers
            div = a / b;
            System.out.println(div);
        } else if(num == 5){
            System.out.println("Enter a number");
            a = sc.nextDouble();
          //Statement to find the square of a number
            sq = a * a;
            System.out.println(sq);
        }else if(num == 6){
            System.out.println("Enter a number");
            a = sc.nextDouble();
          //Statement to find the square root of a number
            sqRt = Math.sqrt(a);
            System.out.println(sqRt);
        }else if(num == 7){
            System.out.println("Enter a number");
            a = sc.nextDouble();
          //Statement to find the reciprocal of a number
            rec = 1/ a;
            System.out.println(rec);
        } else{
            System.out.println("Invalid choice! Please make a valid choice");
            System.out.println("To continue Press 1 or any valid number ");
        }
        sc.close();
         
    }
        
        
        
    }




