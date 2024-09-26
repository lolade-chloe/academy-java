package com.bptn.course._03_flow_control._01_while_loop;

public class StepsToZero {


	    public static int numberOfSteps(int num) {
	        int steps = 0;

	        // Fill in the code below based on the problem statement
	      
	      
	        if (num>=0 && num<= Math.pow(10, 6)){
	          while(num>0){
	          if (num%2 == 0){
	             num/=2;
	            
	            
	          } else{
	           num -=1;
	            
	          }
	          
	          steps+=1;
	          }
	        }
	      
	        return steps;
	    }
	    
	// FREEZE CODE BEGIN
	    public static void main(String[] args) {
	        // Test 1
	        int num = 123;
	        int steps = numberOfSteps(num);
	        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

	        // Test 2
	        num = 14;
	        steps = numberOfSteps(num);
	        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
	    }
	}
	// FREEZE CODE END


