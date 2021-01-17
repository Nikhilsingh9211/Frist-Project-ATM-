package firstprojectpackage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	int selection;
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
	
	/* Validate Login Information customer number and pin */
	
	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				data.put(123456789, 1234);
				data.put(987654321, 4321);
				
				System.out.println("Welcome to the ATM Project!");
				
				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				System.out.println("\n"+" INVALID Character(s).  |* Only NUMBER *| "
						+ "\n");
				//System.out.println("Try again \n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if  (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
				if (selection!= 3 && selection!= 4) {
				System.out.println("\n" + "Wrong Customer Number or Pin Number. "+"\n");
				}
			}
			
		}while (x == 1);
		
	}

	/* Display Account Type Menu with Selection */
	
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Enter 1 - Checking Account");
		System.out.println("Enter 2 - Saving Account ");
		System.out.println("Enter 3 - Exit ");
		System.out.print("Enter your Choice: ");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1: 
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You Using \n BYE...");
			break;
			
		default:
			System.out.println("\n"+ "INVALID INPUT "+"\n"+ "Bye..."+"\n");
			getAccountType();
		}
	}


	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Enter 1 - Display Balance");
		System.out.println("Enter 2 - Withdraw Funds");
		System.out.println("Enter 3 - Deposit Funds ");
		System.out.println("Enter 4 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Checking Acount Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using ATM");
			break;
		default:
			System.out.println("\n"+"Inavlid Choice.."+"\n");
			getChecking();
		}		
	}
	
	// Display Saving Account Menu With selection 
	
	public void getSaving() {
		System.out.println("Saving");
		System.out.println("Enter 1 - View Balance");
		System.out.println("Enter 2 - Withdraw Funds");
		System.out.println("Enter 3 - Deposit Funds ");
		System.out.println("Enter 4 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using ATM");
		default:
			System.out.println("\n"+"Inavlid Choice.."+"\n");
			getSaving();

		}
	}
	
}
