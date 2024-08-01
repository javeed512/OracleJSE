import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
			//	Set<String> set1 =		new HashSet<String>(); // hashing order
		
		
		//Set<String> set1 =		new LinkedHashSet<String>(); // insertion order is preserved
					
		Set<String> set1 =		new TreeSet<String>(); 
		
				set1.add("banana");
				System.out.println(set1.add("apple"));
					set1.add("orange");
					set1.add("kiwi");
					set1.add("mango");
				System.out.println(set1.add("apple"));
		
					Iterator<String> it =	set1.iterator();
					
					while(it.hasNext()) {
						
						System.out.println(it.next());
					}
					
					
	}

}
