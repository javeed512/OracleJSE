package com.arrays;

public class Demo {

	public static void main(String[] args) {

		int  ar1[] = {10,20,30,40,50};
		
			
		System.out.println(ar1);
		
		System.out.println(ar1.length);
		
		for (int i = 0; i < ar1.length; i++) {
			
			System.out.println(ar1[i]);
		}
		
		System.out.println("for each");
		
		for (int x : ar1) {
			System.out.println(x);
		}
		
		
		int  ar2[]  = new int[4];
		
		
			ar2[0] = 11;
			ar2[1] = 22;
			System.out.println("ar2 elements");
		
		for (int n : ar2) {
			
			System.out.println(n);
		}
		
		
		
		
		

	}

}
