package com.meritamerica.assignment2;
import java.text.DecimalFormat;
import java.util.Arrays;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountBalance;
	private double savingsAccountBalance;
	private double cdAccountBalance;
	private int numberOfCDAccounts;
	private int numberOfSavingsAccounts;
	private int numberOfCheckingAccounts;
	private double totalBalance;
	private SavingsAccount[] savingsAccount = new SavingsAccount[initSize];
	private CheckingAccount[] checkingAccounts = new CheckingAccount[initSize];
	private CDAccount[] cdAccount = new CDAccount[initSize];
	private static int initSize = 5;
	
		
		public AccountHolder(String firstName, String middleName, String lastName, String ssn) 
		{
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.ssn = ssn;
			
		}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String mName) {
		this.middleName = mName;
	}
	
	
	public String getLastname() {
		return lastName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	
	
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		if ((openingBalance + getCheckingBalance() + getSavingsBalance()) < 250000) {
			numberOfCheckingAccounts++;
			
			if (numberOfCheckingAccounts > checkingAccounts.length)
			{
				CheckingAccount[] checkingAccountsTemp = 
						Arrays.copyOf(checkingAccounts, checkingAccounts.length + 5);
				checkingAccounts = checkingAccountsTemp;
			}
		checkingAccounts[numberOfCheckingAccounts - 1] = new CheckingAccount(openingBalance);
		return checkingAccounts[numberOfCheckingAccounts - 1];
		}
		return null;
	}

	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount)
	{
		if ((checkingAccount.getTheBalance() + getCheckingBalance() + getSavingsBalance()) < 250000)
		{
			checkingAccounts[numberOfSavingsAccounts] = checkingAccount;
			numberOfCheckingAccounts++;
			
			if(numberOfCheckingAccounts > checkingAccounts.length)
			{
				CheckingAccount[] checkingAccountsTemp = Arrays.copyOf(checkingAccounts, checkingAccounts.length + 5);
				checkingAccounts = checkingAccountsTemp;
				
			}
			checkingAccounts[numberOfCheckingAccounts - 1] = checkingAccount;
			return checkingAccounts[numberOfCheckingAccounts -1];
			} 
			else {
			return null;
		}
		return checkingAccount;
	}

	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
	}

	
	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}

	
	public double getCheckingBalance() {
		for (int x = 0; x < checkingAccount.length - 1; x++) {
			checkingAccountBalance += checkingAccount[x].getTheBalance();
		}
		return checkingAccountBalance;
	}

	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount savings = new SavingsAccount(openingBalance);
		if (getCombinedBalance() < 250000) {
			savingsAccount[numberOfSavingsAccount] = savings;
			numberOfSavingsAccount++;
		} else {
			return null;
		}
		return savings;
	}

	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (getCombinedBalance() < 250000) {
			this.savingsAccount[numberOfSavingsAccount] = savingsAccount;
			numberOfSavingsAccount++;
		} else {
			return null;
		}
		return savingsAccount;
	}

	
	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccount;
	}

	
	public int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccount;
	}

	
	public double getSavingsBalance() {
		for (int y = 0; y < savingsAccount.length - 1; y++) {
			savingsAccountBalance += savingsAccount[y].getBalance();
		}
		return savingsAccountBalance;
	}

	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cd = new CDAccount(offering, openingBalance);
		this.cdAccount[numberOfCDAccount] = cd;
		numberOfCDAccount++;
		return cd;
	}

	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		this.cdAccount[numberOfCDAccount] = cdAccount;
		numberOfCDAccount++;
		return cdAccount;
	}

	
	public CDAccount[] getCDAccounts() {
		return cdAccount;
	}

	
	public int getNumberOfCDAccounts() {
		return numberOfCDAccount;
	}

	public double getCDBalance() {
		for (CDAccount x : cdAccount) {
			cdAccountBalance += x.getBalance();
		}
		return cdAccountBalance;
	}

	public double getCombinedBalance() {
		totalBalance = checkingAccountBalance + savingsAccountBalance + cdAccountBalance;
		return totalBalance;
	}

}






