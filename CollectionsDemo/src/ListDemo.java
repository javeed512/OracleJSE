import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {


	List<Object>  list =	new  ArrayList<Object>();
	
			list.add(new String("hello"));
			list.add(new Integer(10));
			list.add(new Double(4.55));
			list.add(new Integer(10));
			list.add(null);
			list.add(20);// new Intege(20)
			
			
			
			System.out.println(list);
			
			
			List<Integer>  list2  = new ArrayList<Integer>(5);
			
					list2.add(5);
					list2.add(15);
					list2.add(25);
					list2.add(35);
					list2.add(45);
					list2.add(90);
					list2.add(145);
					list2.add(215);
					
					
			System.out.println(list2);
			
			System.out.println("List2 using foreach");
			
			for(Integer i:list2) {
				
				System.out.println(i);
				
			}
			
			System.out.println("List2 using Iterator");
		Iterator<Integer> it =	list2.iterator();
		
			while(it.hasNext()) {
				
			Integer x = 	it.next();
			
			System.out.println(x);
				
			}
			
			
			List<Number>  list3 = new ArrayList<Number>();
			list3.add(500);
			list3.add(15.8888);
			list3.add(25.99F);
			
		
	}

}
