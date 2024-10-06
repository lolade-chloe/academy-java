package com.bptn.course._15_big_coding_wk2._01_employee;

public class Employee {
	   // Instance variable to store salary
	   private int salary;
	   
	   // Instance variable to store hours per day worked by employee
	   private int hoursPerDay;  

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   public Employee(int salary, int hoursPerDay){
	    this.salary = salary;
	    this.hoursPerDay = hoursPerDay;
	    setSalary(salary);
	    setHoursPerDay(hoursPerDay);
	   }

	   // Set method to update salary
	   public void setSalary(int salary){
	    if(salary<500){
	      this.salary+=10;
	      //System.out.println("Updated salary" + this.salary);
	    } else{
	      //System.out.println(salary);
	    }
	    
	   }

	   // Set method to update hoursPerDay
	   public void setHoursPerDay(int hoursPerDay){
	    this.hoursPerDay = hoursPerDay;
	    if(hoursPerDay >6){
	      this.salary+= 5;
	      //System.out.println(salary);
	    } else{
	      //System.out.println(salary);
	    }
	   }

	   // Get method to return salary
	   public int getSalary(){
	    return salary;
	   }
	}
