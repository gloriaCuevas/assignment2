package com.meritamerica.assignment2;

public class BankAccount {
	protected double interestRate;  
	protected double balance;

	   
	
	public BankAccount(double balance, double interestRate)
	{
		 this.interestRate = interestRate;
	     this.balance = balance;
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate)
	{
		accountNumber = getAccountNumber();
		this.interestRate = interestRate;
	    this.balance = balance;
	}
	public long getAccountNumber()
	{
		return MeritBank.getNextAccountNumber();
	}
	double getBalance()
	{
		return balance;
	}
	double getInterestRate()
	{
		return interestRate;
	}
	
	boolean withdraw(double amount)
	{
		if (amount > 0) {
			balance += amount;
			System.out.println("This is your new balance $" + balance );
			return true;
		} else {
			System.out.println("You dont have any money to deposit");
			return false;
		}	
	}
	boolean deposit(double amount)
	{
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("This is your new balance $" + balance);
			return true;
		} else {
			System.out.println("You dont have enough money to withdrawl. You have $" + balance + " in your account");
			return false;
		}
	}
	double futureValue(int years)
	{

	double FV = Math.pow((1 + getInterestRate()), years);
	return FV;

	}
}
