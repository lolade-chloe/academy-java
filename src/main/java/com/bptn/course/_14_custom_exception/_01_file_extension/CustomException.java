package com.bptn.course._14_custom_exception._01_file_extension;

import java.util.Scanner;

public class CustomException {

    

    private static void validateFileExtension(String fileName) throws FileExtensionException {
        
        if (!(fileName.endsWith(".txt"))){
            throw new FileExtensionException("File doesn't have .txt extension");
        } 
    } 
    public static void main(String[] args) {
        // Write your code below.
        //To read input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name with correct extension i.e. .txt ");
        String fileName = sc.nextLine();
        

        try{
            CustomException.validateFileExtension(fileName);
            System.out.println("Correct file name with extension .txt");
        } catch(FileExtensionException e){
            System.out.println("Error: " + e.getMessage());
        } finally{
            sc.close();
        }

    }
}

