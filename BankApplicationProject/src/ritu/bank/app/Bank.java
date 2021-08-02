package ritu.bank.app;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Bank {
 
	static String bankName;
	static String branchName;
	static String Ifsc;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new FileReader("A:\\API\\BankApplicationProject\\src\\BankDetails.txt"));
			bankName=br.readLine();
			branchName=br.readLine();
			Ifsc=br.readLine();
			
			/*System.out.println("BankName:"+bankName);
			System.out.println("BranchName:"+branchName);
			System.out.println("Ifsc Code:"+Ifsc);*/
			
		}catch(FileNotFoundException e) {
			System.out.println("Error:"+e.getMessage());
		}
		catch(IOException e1) {
			System.out.println("Error:"+e1.getMessage());
		}
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Account holder name:");
		String Name=scn.next();
		System.out.println("Enter Account number:");
		int Num=scn.nextInt();
		System.out.println("Enter initial balance:");
		int balance=scn.nextInt();
		System.out.println("BankName:"+bankName);
		System.out.println("BranchName:"+branchName);
		System.out.println("Ifsc Code:"+Ifsc);
		
		
		BankAccount b1=new BankAccount(Num, balance, Name);
		
           b1.showMenu();		   
		
		   }
		   
	}


