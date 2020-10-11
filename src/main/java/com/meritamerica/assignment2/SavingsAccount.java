package com.meritamerica.assignment2;

import java.text.DecimalFormat;


public class SavingsAccount extends BankAccount{
	
	private double bal;
	private double intRate = 0.01;
	private int yrs = 0;
	
	public SavingsAccount(double StartBalance, double balance, double interestRate) 
	{
		super(balance, interestRate);
		StartBalance = bal;
	}
	
	public double getTheBalance() 
	{
		return super.getBalance();
	}
	
	public double getIntRate( ) 
	{
		return super.getInterestRate();
	}
	
	//adding money for deposit
	public boolean deposit(double amount) 
	{
		return super.deposit(amount);
	}
	
	
	//subtracting money from account by withdraw
	public boolean withdraw(double amount) 
	{
		return super.withdraw(amount);
	}
	
	//calculates the interest rate
	public double futureValue(int years) 
	{
		return super.futureValue(years);
	}
	
	public String toString() {
		double IV = futureValue(yrs);
		DecimalFormat decf = new DecimalFormat("0.##");
		return "The savings account balance is " + decf.format(bal) + "\n"
				+ "Your savings account balance in " + yrs + " years is " + decf.format(IV) + "\n"
				+ "This is at the current interest rate  of " + intRate;
			
	}
	

}
