package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        //scanner objectto read user input 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int amt = sc.nextInt();
        sc.nextLine(); // To consume leftover newline after nextInt
        System.out.println("Enter a word");
        String word = sc.nextLine();
        int num1, num2;
        
        String str, str1 ="";
        String newString;
        if(amt>1 || amt==0){ //Check if it is plural
           num1 = word.length();
           num2 = word.length()-2;
           
           str = word.substring(num2, num1);
           str1 = word.substring(num1-1);
           //To replace last letters and make them plural
           if(str.equals("fe")){
            newString = word.replace(str, "ves");
            System.out.println(amt+ " " +newString);
           } else if((str1.equals("y"))&& (!str.equals("ay") && !str.equals("oy") && !str.equals("ey") && !str.equals("uy"))){
            newString = word.replace(str1, "ies");
            System.out.println(amt+ " "+ newString);
           } else if(str.equals("sh")|| str.equals("ch") ){
            newString = word.concat("es");
            System.out.println(amt+ " " +newString);
           } else if(str.equals("us")){
            newString = word.replace(str, "i");
            System.out.println(amt + " "+newString);
            }else if(str.equals("ay") || str.equals("oy") || str.equals("ey") || str.equals("uy")){
            newString = word.concat("s");
            System.out.println(amt+ " " +newString);
            } else{
                newString = word.concat("s");
                System.out.println(amt+" "+newString);
        } 
    
        


        }
        else{
            System.out.println(amt+" "+word);
        }


    }
}
