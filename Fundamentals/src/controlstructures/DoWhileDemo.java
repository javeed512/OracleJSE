package controlstructures;

public class DoWhileDemo {

	public static void main(String[] args) {


		boolean flag = true;
		
		String name = "king";
		
		do {
			
			System.out.println("welcome");
			
			if(name.equals("javeed")) {
				
				System.out.println("Login success");
				
				break;
			}
			
			else {
				
				System.out.println("Invalid user");
				break;
				
			}
			
		} while (flag);
		

	}

}
