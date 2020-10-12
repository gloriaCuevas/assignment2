package com.meritamerica.assignment2;
import java.text.DecimalFormat;

public class AccountHolder {
	
	private String fName = "";
	private String mName = "";
	private String lName = "";
	private String ssn = "";
	
	private BankAccount[] accnts;
	
	//The parameters for the account holder
	public AccountHolder(String fName, String mName, String lName, String ssn) 
	{
		
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.ssn = ssn;
		this.accnts = new BankAccount[0];
		this.addCheckingAccount(openingBalance);
		this.addSavingsAccount(openingBalance);
		
	}
	
	
	//getters and setters
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	
	
	public String getMiddleName() {
		return mName;
	}
	public void setMiddleName(String mName) {
		this.mName = mName;
	}
	
	
	public String getLastname() {
		return lName;
	}
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	
	
	CheckingAccount addCheckingAccount(double openingBalance) 
	{
		CheckingAccount checkAccount = new CheckingAccount(openingBalance);
		
		if(getCheckingBalance() + getSavingsBalance() + checkAccount.getTheBalance() >= 25000)
			return checkAccount;
	}	
		BankAccount[] more = new BankAccount[this.accnts.length + 1];
	
	
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		return;
	}
	CheckingAccount[] getCheckingAccounts() {
		return checkingaccount;
	}
	public int getNumberOfCheckingAccounts()
	{
		
	}
	public double getCheckingBalance()
	{
		
	}
	SavingsAccount addSavingsAccount(double openingBalance)
	{
	return;	
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
	{
	return;	
	}
	SavingsAccount[] getSavingsAccount() {
	}
		return savingaccount;
	}
	public int getNumberOfSavingsAccounts()
	{
		
	}
	public double getSavingsBalance()
	{
		
	}
	CDAccount addCDAccount (CDOffering offering, double openingBalance)
	{
		
	}
	
	CDAccount addCDAccount(CDAccount cdAccount)
	{
		
	}
	CDAccount[] getCDAccounts() 
	{
		
	}
	public int getNumberOfCDAccounts()
	{
		
	}
	public double getCDBalance()
	{
		
	}
	
	public double getCombinedBalance()
	{

	}
	
	
		
	
	/*public String toString() {
		DecimalFormat decf = new DecimalFormat("0.##");
		
		return "Acount holders name: " + fName + " " + mName + " " + lName + "\n"
				+ "Social Security number: " + ssn + "\n"
				+ "The checking account balance: " + decf.format(checkingaccount.getTheBalance()) + "\n"
				+ "The saving account balance:" + decf.format(savingaccount.getTheBalance()) + "\n"
				+ "Checking Account balance in 3 years: " + decf.format(checkingaccount.interestVal(3)) + "\n"
				+ "Savings Account balance in 3 n years: " + decf.format(savingaccount.interestVal(3)) + "\n"
				+ "The Checking Account with an interest rate of: " + checkingaccount.getIntRate() + "\n"
				+ "The Savings Account with an interest rate of: " + savingaccount.getIntRate();
		
	}*/
}






