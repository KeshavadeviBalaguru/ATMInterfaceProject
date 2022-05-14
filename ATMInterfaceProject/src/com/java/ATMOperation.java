package com.java;

public  class ATMOperation implements ATMInterface{

	ATM atm=new ATM();

	@Override
	public void deposit_Amount(double deposit_amount) {
		System.out.println(deposit_amount+"Deposited Successfully..");
		atm.setAccount_Balance(atm.getAccount_Balance()+deposit_amount);
		ViewBalance();
		
	}

	@Override
	public void withdraw_Amount(double withdraw_amount) {
		if(withdraw_amount<500)
		{
			System.out.println(" Sorry !!! ATM Machine have only 500 Rupees Note.");
		}else
		{
		if(withdraw_amount<atm.getAccount_Balance())
		{
		System.out.println("Collect your Cash..");
		atm.setAccount_Balance(atm.getAccount_Balance()-withdraw_amount);
		ViewBalance();
		}
		/*else if()
		{
			System.out.println("ATM Machine have only 500 Rupees Note.");
		}*/
		else
		{
			System.out.println("Insufficient Balance..");
		}
		}
		
	}

	@Override
	public void ViewBalance() {
		System.out.println("Available Balance="+atm.getAccount_Balance());
		
	}

	@Override
	public void Transaction() {
	
		
	}

	
}
