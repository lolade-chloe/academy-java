package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				readFile("Result.txt");
			} catch(FileNotFoundException e) {
				System.out.println("An error occurres: "+ e.getMessage());
			}
			
			
	}
	
	//Create a method which reads the file
	public static void readFile(String fileName) throws FileNotFoundException{
		//create an object FileReader
		
		FileReader fileReader = new FileReader(fileName);
		
	}
	

}
