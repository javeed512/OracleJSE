package com.bank.atm;


/*
 * @author: harsh
 * 
 */

public abstract class BankImp1 implements IBank {

	public void deposit() {
		
		System.out.println("deposit success..");
		
	}
	
	public abstract void withdraw();
}
