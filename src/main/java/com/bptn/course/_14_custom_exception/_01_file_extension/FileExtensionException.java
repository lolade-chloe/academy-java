package com.bptn.course._14_custom_exception._01_file_extension;

//Create a class FileExtensionException here
public class  FileExtensionException extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//Instance Variables
private String message;

//Parameterized constructor
public FileExtensionException(String message){
 this.message = message;
}
}