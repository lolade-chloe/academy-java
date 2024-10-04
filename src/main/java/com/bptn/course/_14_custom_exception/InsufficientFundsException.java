package com.bptn.course._14_custom_exception;

public class InsufficientFundsException extends Exception {
	private double amount;//Instance variable
	
	private static final long serialVersionUID =1L;
	
	public InsufficientFundsException(double amount) {
		
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	
}
