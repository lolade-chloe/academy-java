package com.bptn.course._07_OOP;

public class Phone {

	
		
		
		//declare instance variables = properties/attribiutes
		//weight, height width, color
		
		private int weight;
		private int height;
		private int width;
		private String color;
		
		
		//Constructor
		//Has the same name as the ClassName (Phone)
		//Does not have a return type
		//Default constructor -does have any parameters passed
		public Phone() {
			
			//default values
			weight = 150;
			height = 140;
			width = 70;
			color = "Black";
		}
		
		//4 parameters Paramaterized constructor - which has parameters passed
		public Phone(int w, int h, int wi, String c) {
			weight = w;
			height = h;
			width = wi;
			color = c;
		}
		//3 parameters Paramaterized constructor - which has parameters passed
		public Phone(int w, int h, int wi) {
			weight = w;
			height = h;
			width = wi;
			
		}
		
		
		
		//declare instance methods -behaviour/ functionality
		public void makePhoneCall() {
			System.out.println("Make a phone call");
		}
		
		public void sendTextMessage() {
			System.out.println("Send a text message");
		}
		public static void main(String[] args) {
			
			//Create an object of the phone class using the default constructor
			Phone myObj1 = new Phone();
			System.out.println("Default Phone: "+"Width: "+ myObj1.width +"Height: " +myObj1.height);
			
			Phone myObj2 = new Phone(200, 100, 50, "Yellow");
			System.out.println("My Weight: "+ myObj2.weight +" My Height: "+ myObj2.height +" My Width: "+ myObj2.width +"My Color: "+ myObj2.color);
			
			Phone myObj3 = new Phone(250, 10, 150);
			System.out.println("My Weight: "+ myObj3.weight +" My Height: "+ myObj3.height +" My Width: "+ myObj3.width);
		}
// instance variables are always declared as a private - because we want to encapsulate this from being accessed from another class
		//Instance methods are always declared as public we want it to be accessible
}
