package functional_interface;

public class ImpDemo implements MyInterface {

	
	
	public static void main(String[] args) {


		MyInterface mi =		new ImpDemo();		
		
			int result = mi.add(5, 3);
			
			System.out.println("Result : "+result);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
