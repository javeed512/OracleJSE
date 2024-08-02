package exceptions;

public class ExpDemo {

	public static void main(String[] args) { // caller

		System.out.println("Open file");
		System.out.println("Read file");
		
		
		
		int result =0;
		try {
			String name = null;
			
			System.out.println(name.length());
			
			
		 result = div(10, 0);
		}
		catch (ArithmeticException e) {
		
			e.printStackTrace();
			
			
			System.err.println("Sorry You can't divide number by zero");
		}
		catch (NullPointerException e) {

				e.printStackTrace();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		finally {
			System.out.println("File close");
			
		}
		
		
		
		System.out.println("Result : " + result);

		System.out.println("Read more data");
		

	}

	public static int div(int a, int b)throws ArithmeticException { // callee or sub program

		return a / b; // new ArithmeticException();

	}

}
