package exceptions;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		
		
			System.out.println("Hello");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Friends");
		
		

	}

}
