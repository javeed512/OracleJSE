package controlstructures;
import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {

		
		/*
		 * int i = 0;
		 * 
		 * while (i < 5) {
		 * 
		 * System.out.println("I value is " + i); i++; }
		 * 
		 */
		boolean flag = true;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		

		while (flag) {
			System.out.println("1.ADD");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT ALL");
			System.out.println("5. EXIT");

			int choice =	scanner.nextInt(); // "1"
			
			
			switch (choice) {
			case 1:
				System.out.println("ADD Success");
				break;
			case 2:
				System.out.println("UPDATE Success");
				break;
			case 3:
				System.out.println("DELETE Success");
				break;
			case 4:
				System.out.println("SELECT ALL Success");
				
				break;
				
			case 5:
				
				flag = false;
				System.out.println("Thank you visit again..");
				
				break;

			default:
				break;
			}

		}

	}

}
