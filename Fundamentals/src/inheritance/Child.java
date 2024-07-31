package inheritance;

public class Child extends Parent {

	int cid = 90;

	public Child() {
		//super(); // Parent();

		this(88);
		System.out.println("Child() called object created..");

	}

	public Child(int cid) {

		this.cid = cid;
		// this.m2();
	}

	public void m2() {

		System.out.println("m2() from Child class");

	}

	public static void main(String[] args) {

		Parent p = new Parent();
		
			String s1 = p.toString();

		p.m1();

		System.out.println(p.toString());

		Child c = new Child();

		c.m1();
		
		System.out.println(c.toString());

		
		//Object o =  new Child();   //new Parent();    //new Object();
		
		Parent p1 =  new Child();  // runtime polymorphism
		
		Child c1 = (Child)p1;
		
		p1.m1();
		
		
		//Child c2 = new Parent();	
		
		Object s = new String("hello");
		
		System.out.println( s instanceof String );
		
		System.out.println(p1 instanceof Parent);
		
		
	}
	
	@Override
	public void m1() {
		
		super.m1();
		System.out.println("m1() from Child class");
	}
	
	

}
