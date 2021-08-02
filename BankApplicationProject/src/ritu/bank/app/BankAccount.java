package ritu.bank.app;
import java.util.Scanner;

public class BankAccount  {
		
	//non-static properties
	 int accNo;
	 double balance;
	 String accHName;
	 
	//constructor for initializing non-static properties 
	 BankAccount(int accNo, double balance, String accHName){
		 this.accNo=accNo;
		 this.balance=balance;
		 this.accHName=accHName;
	 }
	
	// for checking account balance...
	public double checkBalance() {
		System.out.println("Available balance is:"+balance);
		return balance;
	}
	
	// for performing deposit operation...
	public void deposit() throws IllegalArgumentException {
		int choice;
		System.out.println("==============================================================");
		System.out.println("Deposit operation start");
		System.out.println("1. Cash");
		System.out.println("2. Online");
		System.out.println("-------Please select an option for add amount----------");
		Scanner scn=new Scanner(System.in);
		choice=scn.nextInt();
		
		switch(choice) {
		case 1: case 2:
			double amt;
			System.out.println("Enter an amount to deposit:");
			amt=scn.nextDouble();
			if(amt<=0)
				throw new IllegalArgumentException("Do not pass negative amount");
			else
			   balance=balance+amt;
			    System.out.println("Amount deposited Successfully");
		        System.out.println("After deposited balance is: "+balance);
		        //System.out.println("Total Balance: " +balance);
		        System.out.println("Deposit operation end");
		        System.out.println("==========================================================");
			break;
		default:
			 System.out.println("Invalid option !! please enter again");
		
			}
		}
	
	// for performing withdraw operation...
	public void withDraw() throws IllegalArgumentException, IllegalStateException {
		int choice1;
		System.out.println("==============================================================");
		System.out.println("Withdrawl operation started");
		System.out.println("1. Cash");
		System.out.println("2. Online");
		System.out.println("3. ATM");
		System.out.println("-------Please select an option for withdraw amount----------");
		Scanner scn=new Scanner(System.in);
		choice1=scn.nextInt();
		switch(choice1) {
		case 1: case 2: case 3:
			double amt;
			System.out.println("Please enter an amount you would like to withdraw.");
			amt=scn.nextDouble();
			if(amt<=0)
				throw new IllegalArgumentException("Do not pass negative amount");
			else if(amt>balance)
				throw new IllegalStateException("Insufficient funds");
			else
				 balance = (balance - amt);
	          System.out.println("Please Collect your " + amt +" Rupees");
	          System.out.println("After withdraw, balance is: "+balance);
	          //System.out.println("Total Balance: " +balance);
	          System.out.println(" Withdraw operation completed");
	          System.out.println("===================================================");
		}
	}
	
	// for showing account holder details...
	public void showMenu() {
		char option='\0';
		Scanner scn=new Scanner(System.in);
		System.out.println("Account holder name is:"+accHName);
		System.out.println("Account number is:"+accNo);
		System.out.println("Account Balance is:"+balance);
		System.out.println("Welcome To Our Banking Services, "+accHName+"....");
		System.out.println();
		System.out.println("A. CheckBalance");
		System.out.println("B. Deposit");
		System.out.println("C. WithDraw");
		System.out.println("D. Exit");
		
		do {
			System.out.println("===================================================");
			System.out.println("-------Please select an option----------");
			System.out.println("===================================================");
			option=scn.next().charAt(0);
			System.out.println("\n");
			switch(option) {
			case 'A':
				System.out.println("==================================================");
				checkBalance();
				System.out.println("==================================================");
				System.out.println("\n");
				break;
				
			case 'B':	
			//	System.out.println("==================================================");
				deposit();
				//System.out.println("==================================================");
				System.out.println("\n");
				break;
		
			case 'C':	
				//System.out.println("==================================================");
				withDraw();
				//System.out.println("==================================================");
				System.out.println("\n");
				break;	
				
			case 'D':	
				System.out.println("==================================================");
				System.out.println("Exit");
				System.out.println("==================================================");
				System.out.println("\n");
				break;
				
			default:
				 System.out.println("Invalid option !! please enter again");		
			}
		}while(option!='E');
		  System.out.println("===================================================");
		  System.out.println("\"Thank You For Using Our Services\"");
		  System.out.println("====================================================");
	}
	
}
