package com.bptn.course._15_big_coding_wk2;

public class Triangle{

    private int a, b, c, h;
	// Write perimeterCalculator method 
    public int perimeterCalculator(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        return a+b+c;
    }

    // Write areaCalculator method
	public int areaCalculator(int b, int h){
    this.b =b;
    this.h = h;
    return (b*h)/2;
  }

    // Do not modify the code below:
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
}
