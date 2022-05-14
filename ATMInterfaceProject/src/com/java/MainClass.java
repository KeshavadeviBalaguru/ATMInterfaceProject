package com.java;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ATMInterface op=new ATMOperation();
		int ATMNumber=9876;
		int ATMPin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME!!!");
		System.out.println("Enter your ATM Number.");
		int ATMnumber=sc.nextInt();
		System.out.println("Enter your PIN.");
		int pin=sc.nextInt();
		if((ATMNumber==ATMnumber)&&(ATMPin==pin))
		{
			
			System.out.println("Successfull Validation..");
			while(true)
			{
				System.out.println("1.Deposit Amount");
				System.out.println("2.withdraw Amount");
				System.out.println("3.View Available Balance");
				System.out.println("4.View Transacction");
				System.out.println("5.Exit");
				System.out.println("Enter your choice.");
				int choice=sc.nextInt();
				if(choice==1)
				{
					
					System.out.println("Enter your Amount to Deposite:");
					double deposit_amount=sc.nextDouble();
					op.deposit_Amount(deposit_amount);
				}
				else if(choice==2)
				{ 
					System.out.println("Enter your Amount to withdraw:");
					double withdrawAmount=sc.nextDouble();
					op.withdraw_Amount(withdrawAmount);
				}
				else if(choice==3)
				{
					op.ViewBalance();
				}
				else if(choice==4)
				{
					
				}
				else if(choice==5) 
				{
					System.out.println("Please Colleect Your Card\n Thank You For visiting.");
				}
				else
				{
					System.out.println("Please enter your correct choice.");
				}
			}
			
			
		}
		else
		{
			System.out.println("Invalid Number");
			System.out.println("Please Enter the correct Number.");
			
			
		}
		
		

	}

}
