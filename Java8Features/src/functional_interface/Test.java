package functional_interface;

public class Test {

	public static void main(String[] args) {


//	MyInterface mi =	(int a,int b) -> {  return a+b; };
		
		
		MyInterface mi =	(a,b) -> a+b;
		
		
			System.out.println("Result using Lambda Exp "+ mi.add(4, 3));
			
				MyInterface.m1();
				
				mi.m2();
				
				
		
	}

}
