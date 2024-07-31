package demo;

import java.lang.String;

import  static java.lang.System.out;

 public class Demo extends Object{
	
	protected int id;
	
	static String name;
	
	
	/*
	 * public String toString() {
	 * 
	 * 
	 * return id+""; }
	 */
	
	
	public Demo() {
		super();
		
	}
	

	public Demo(int id) {
		super();
		this.id = id;
	}


	public static void main(String[] args) {

		
		
			
			
			/*
			 * d.methodOne();
			 * 
			 * methodTwo();
			 * 
			 * out.println("hello"+" friends"); out.println(5+4);
			 */
			
			Demo d1 = new Demo(101);
			
			System.out.println(d1);  //d.toString
			
			
			Demo d2 = d1;   // new Demo(102);
			
			System.out.println(d2);
			
			
			//java.util.Scanner s1;
			
			System.out.println(d1.equals(d2));
			System.out.println(d1 == d2);
			int x = 10;
			int y = 5;
			
			System.out.println(x == y);
			
	}
	
	public void methodOne() {
		
		System.out.println("methodOne is called..");
		
		Demo.methodTwo();
		
	}
	
	public void methodOne(int x,int y) {
		
		
		
	}
	
	
	
	public static void methodTwo() {
		
		System.out.println("static method called...");
		
	}
	
	

}
