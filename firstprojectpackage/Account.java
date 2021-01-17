package firstprojectpackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$' ###,##0.00");
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	// set the customer number
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	// get the customer number
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	// set the pin number
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	// get the pin number
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	// get Checking Account Balance
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	// get Saving Account Balance
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	// Calculate Checking Account Withdrawal
	
	public double calCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount); 
		return checkingBalance;
	}
	
	// Calculate Saving Account Withdrawal
	
	public double calSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount); 
		return savingBalance;
	}
	
	// Calculate Checking Account Deposit
	
	public double calCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount); 
		return checkingBalance;
	}
	
	// Calculate Saving Account Deposit
	
	public double calSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount); 
		return savingBalance;
	}
	// Customer Checking Account Withdraw input
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance :"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw From Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannaot be Negative."+"\n");
		}
	}
	
	// Customer Saving Account Withdraw input
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw From saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calSavingWithdraw(amount);
			System.out.println("New saving Account balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannaot be Negative."+"\n");
		}			
		}
	
	// Customer Checking Account Deposit input 
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance :"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit From Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calCheckingDeposit(amount);
			System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannaot be Negative."+"\n");
		}
	}
	
	// Customer Saving Account Deposit input 
	 
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit From saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calSavingDeposit(amount);
			System.out.println("New saving Account balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannaot be Negative."+"\n");
		}			
		}
	}

