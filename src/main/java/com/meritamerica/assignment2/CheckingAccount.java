package com.meritamerica.assignment2;
import java.text.DecimalFormat;


public class CheckingAccount extend BankAccount{
	private double bal;
	private double intRate = 0.01;
	private int yrs = 0;
	//interest value in the future
	private double IV = 0;
	
	public CheckingAccount(double checkingAccountStartBal) {
		bal = checkingAccountStartBal;
	}
	
	public double getTheBalance() {
		return bal;
	}
	
	public double getIntRate() {
		return intRate;
	}
	
	public boolean withdraw(double amnt) {
		if(amnt > 0 && amnt <= bal) {
			bal -= amnt;
			System.out.println("This is your new balance $" + bal);
			return true;
		} else {
			System.out.println("You dont have enough money to withdrawl. You have $" + bal + " in your account");
			return false;
		}
		
	}
	
	public boolean deposit(double amnt) {
		if(amnt > 0 ) {
			bal += amnt;
			System.out.println("This is your new balance $" + bal);
			return true;
		} else {
			System.out.println("You dont have enough money to deposit. You have $" + bal + " in your account");
			return false;
		}
		
	}
	
	
	
	//calculates the interest rate
	public double interestVal(int yrs) {
		double val = 0.00;
		this.yrs = yrs;
		double exp = Math.pow((1 + intRate), yrs);
		val = bal * exp;
		IV = val;
		return IV;
	}
	
	public String toString() {
		double IV = interestVal(yrs);
		DecimalFormat decf = new DecimalFormat("0.##");
		return "The savings account balance is " + decf.format(bal) + "\n"
				+ "Your savings account balance in " + yrs + " years is " + decf.format(IV) + "\n"
				+ "This is at the current interest rate  of " + intRate;
			
	}
	
	
	
}