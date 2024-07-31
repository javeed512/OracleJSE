package com.bank.atm;

import java.util.Scanner;
/*
 * @author: sneha
 * 
 * 
 */


public class ClientUI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		
	IBank  bank =	BankUtil.getObject();

		while (flag) {

			System.out.println("1. Deposit");
			System.out.println("2. Witdraw");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
						// deposit
						bank.deposit();
						
				break;
			case 2:
						// withdraw
				
						bank.withdraw();
				break;

			case 3:
						// exit
					System.out.println("Thank You visit again");
						flag = false;
				
				break;

			default:
					System.err.println("Invalid Option");
				
				break;
			}

		}

	}

}
