import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {


			Map<Integer,String> map = new  HashMap<Integer,String>();
		
				map.put(1, "One");
				map.put(23, "Two");
				map.put(13, "Three");
				map.put(71, "Four");
		
				System.out.println(map);
				
				
			Set<Integer>  keySet =	map.keySet();
			

			Iterator<Integer> it =	keySet.iterator();
			
			while(it.hasNext()) {
				
				Integer key =	it.next();
				
				System.out.println(key +" "+map.get(key));
			}
			
			
			
	}

}
