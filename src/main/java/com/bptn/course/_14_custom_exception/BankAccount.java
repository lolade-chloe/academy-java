package com.bptn.course._14_custom_exception;

public class BankAccount {
	public double balance;
	private String accountNumber;
	
	public BankAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > balance) {
			double needs  = amount - balance;
			
			throw new InsufficientFundsException(needs);
			
		}
		balance -= amount;
		System.out.println("Withdrawal of $ "+ amount + " successful. New balance $" +balance);
	}
	
	
}
