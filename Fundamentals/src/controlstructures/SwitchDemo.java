package controlstructures;

import java.lang.*;

public class SwitchDemo extends Object {

	public SwitchDemo(int x) {
		super(); // Object();

		System.out.println("SwitchDemo obj created..");

	}

	public static void main(String[] args) {

		System.out.println("hi friends");

		SwitchDemo sd = new SwitchDemo(33);

		System.out.println(sd);

		int choice = 9;

		switch (choice) {

		case 1:

			System.out.println("case one");

				break;
		case 2:
			System.out.println("case two");
			break;
		case 3:
			System.out.println("case three");
			break;
		default:

			System.out.println("default");

		}

	}

}
