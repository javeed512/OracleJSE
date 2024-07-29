package com.oracle;

public class Main {

	public static void main(String[] args) {

			Employee e1 = new Employee(101, "king", 90000);
			
			Employee e2 = new Employee(102, "tom", 50000);
		
			
			System.out.println(e1.getEid());
			System.out.println(e1.getEname());
			
			Employee e3 = new Employee();
			
			e3.setEname("raju");
			
		

	}

}
