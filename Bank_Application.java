package bankApplication;
import java.util.Scanner;
public class Bank_Application {
public static void main (String args[])
{
	BankAccount BA=new BankAccount("Ayush Kumar","BOI34242");
	BA.showMenu();
}
}


class BankAccount
{
	int balance;
	int previousTransaction;
	String coustmerName;
	String coustmerId;
	
	BankAccount(String coustmerName,String coustmerId)
	{
		this.coustmerName=coustmerName;
		this.coustmerId=coustmerId;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
		balance=balance+amount;
		previousTransaction=amount;
	}
	
	void withdraw(int amount2)
	{
		if(amount2!=0)
		balance=balance-amount2;
		previousTransaction=-amount2;
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited"+previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdraw"+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome:"+coustmerName);
		System.out.println("Your Id:"+coustmerId);
		System.out.println("\n");
		System.out.println("A.checkBalance");
		System.out.println("B.Deposite");
		System.out.println("C.Withdraw");
		System.out.println("D.PreviousTransaction");
		System.out.println("E.Exit");
		
		do{
			System.out.println("=================================================");
			System.out.println("Enter a Option");
			System.out.println("=================================================");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("----------------------------");
				System.out.println("Balance:"+balance);
				System.out.println("----------------------------");
				System.out.println("\n");
				break;
			case 'B':
			    System.out.println("------------------------------");
			    System.out.println("Enter Amount for Deposite ");
			    System.out.println("-------------------------------");
			    int amount=sc.nextInt();
			    deposit(amount);
			    System.out.println("\n");
			    break;
			case 'C':
				System.out.println("------------------------------");
				System.out.println("Enter Amount You Want to Withdraw");
				System.out.println("------------------------------");
				int amount2=sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case'D':
				System.out.println("------------------------------");
				getPreviousTransaction();
				System.out.println("------------------------------");
				System.out.println("\n");
				break;
			case'E':
				System.out.println("***************************************");
				break;
				
			default:
				System.out.println("Invalid Option !!.Enter Again");
				break;   
			}
		}
		while(option!='E');
		System.out.println("Thankyou for Using our Service");
		
	}
	
	
}
