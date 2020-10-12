package com.meritamerica.assignment2;
import java.util.Date;

public class CDAccount extends BankAccount{
	
	private int accInt = 1;
	private CDOffering offering;
	Date date;
	private double balance;
	private long accountNumber;
		
	
	CDAccount(CDOffering offering, double balance) 
	{
			super(balance, offering.getInterestRate());
			this.offering = offering;
			this.date = date;
			
			accountNumber = accInt++;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return offering.getInterestRate();
	}
	
	public int getTerm() {
		return offering.getTerm();
	}
	
	public java.util.Date getStartDate(){
		return date;
	}
	
	public long getAccountNumber() {
		return accountNumber;	
	}
	
	public double futureValue() {
		return balance*Math.pow(1 + getInterestRate(), getTerm());
	}

}
