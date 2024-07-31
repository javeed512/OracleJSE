package com.bank.atm;

public class BankUtil {
	
	public static   IBank    getObject(){
		
		
		return new BankImp2();
		
	}
	
	

}
