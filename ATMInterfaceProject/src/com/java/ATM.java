package com.java;

public class ATM {
	private double Account_Balance;
	private double deposit_amount;
	private double withdraw_amount;
	
	public ATM()
	{
		
	}

	public double getAccount_Balance() {
		return Account_Balance;
	}

	public void setAccount_Balance(double account_Balance) {
		Account_Balance = account_Balance;
	}

	public double getDeposit_amount() {
		return deposit_amount;
	}

	public void setDeposit_amount(double deposit_amount) {
		this.deposit_amount = deposit_amount;
	}

	public double getWithdraw_amount() {
		return withdraw_amount;
	}

	public void setWithdraw_amount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	
	

}
