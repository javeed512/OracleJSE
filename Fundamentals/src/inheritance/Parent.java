package inheritance;

public  class Parent extends Object{  // IS A relationship
	
	final int  pid = 100;
	
			
	
	public  void m1() {
		
		
		
		System.out.println("m1() from Parent class");
	}
	
	
	public Parent() {
		super();  //  Object();
		System.out.println("Parent() called object created..");
		
	}
	

}
