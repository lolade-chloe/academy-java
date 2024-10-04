package com.bptn.course._08_polymorphism;

//Parent class
class Animal{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	
}


//Sub class
class Dog extends Animal{
	//has its methods
	@Override
	void makeSound() {
		System.out.println("Dog makes a barks");
	}
	
}




public class Polymorphism1 {

	public static void main(String[] args) {
		
		//create an object of animal class
		Animal al = new Animal();
		al.makeSound();
		
		Dog dg = new Dog();
		dg.makeSound();
		
	}

}
