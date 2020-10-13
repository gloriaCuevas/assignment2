package com.meritamerica.assignment2;
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
	private SavingsAccount[] savingsAccounts = new SavingsAccount[initSize];
	private CheckingAccount[] checkingAccounts = new CheckingAccount[initSize];
	private CDAccount[] cdAccounts = new CDAccount[initSize];
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
		
			return null;
		}
	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;
	}

	
	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}

	
	public double getCheckingBalance() {
		for (int x = 0; x < checkingAccounts.length - 1; x++) {
			checkingAccountBalance += checkingAccounts[x].getTheBalance();
		}
		return checkingAccountBalance;
	}

	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		if ((openingBalance + getCheckingBalance() + getSavingsBalance()) < 250000) {
			numberOfSavingsAccounts++;
			
			if (numberOfSavingsAccounts > savingsAccounts.length)
			{
				SavingsAccount[] savingsAccountsTemp = 
						Arrays.copyOf(savingsAccounts, savingsAccounts.length + 5);
				savingsAccounts = savingsAccountsTemp;
			}
		savingsAccounts[numberOfSavingsAccounts - 1] = new SavingsAccount(openingBalance);
		return savingsAccounts[numberOfSavingsAccounts - 1];
		}
		return null;
	}

	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if((savingsAccount.getTheBalance() + getSavingsBalance() + getCheckingBalance()) < 250000)
		{
			savingsAccounts[numberOfSavingsAccounts] = savingsAccount;
			numberOfSavingsAccounts++;
			
			if(numberOfSavingsAccounts > savingsAccounts.length)
			{
				SavingsAccount[] savingsAccountsTemp = Arrays.copyOf(savingsAccounts, savingsAccounts.length + 5);
				savingsAccounts = savingsAccountsTemp;
				
			}
			savingsAccounts[numberOfSavingsAccounts - 1] = savingsAccount;
			return savingsAccounts[numberOfSavingsAccounts -1];
			} 
		
			return null;
		}
	
	
	public double getSavingsBalance() {
		for (int y = 0; y < savingsAccounts.length - 1; y++) {
			savingsAccountBalance += savingsAccounts[y].getBalance();
		}
		return savingsAccountBalance;
	}

	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) 
	{
		if (numberOfCDAccounts > cdAccounts.length)
		{
			CDAccount[] cdAccountsTemp = 
					Arrays.copyOf(cdAccounts, cdAccounts.length + 5);
			cdAccounts = cdAccountsTemp;
		}
	cdAccounts[numberOfCDAccounts - 1] = new CDAccount(offering, openingBalance);
	return cdAccounts[numberOfCDAccounts - 1];
	}
	

	
	public CDAccount addCDAccount(CDAccount cdAccount) 
	{
		if (numberOfCDAccounts > cdAccounts.length)
		{
			CDAccount[] cdAccountsTemp = 
					Arrays.copyOf(cdAccounts, cdAccounts.length + 5);
			cdAccounts = cdAccountsTemp;
		}
		cdAccounts[numberOfCDAccounts - 1] = cdAccount;
		return cdAccounts[numberOfCDAccounts - 1];
	}
	
	
	public CDAccount[] getCDAccounts() {
		return cdAccounts;
	}

	
	public int getNumberOfCDAccounts() {
		return numberOfCDAccounts;
	}

	public double getCDBalance() {
		for (CDAccount x : cdAccounts ){
			cdAccountBalance += x.getBalance();
		}
		return cdAccountBalance;
	}

	public double getCombinedBalance() {
		totalBalance = checkingAccountBalance + savingsAccountBalance + cdAccountBalance;
		return totalBalance;
	}

}






