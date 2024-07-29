package controlstructures;

public class ForLoopDemo {

	public static void main(String[] args) {


		int  arr[] = {10,20,30,40,50,60};
		
		
		
		for(int i=0; i< arr.length;i++)
		{
			
			System.out.println(i +" "+arr[i]);
			
			
			
		}
		
		System.out.println(arr);
		
		System.out.println("For Each Loop");
		
		for(int x:arr) {//enhance or for each loop
			
			System.out.println(x);
			
		}
		
		
		

	}

}
