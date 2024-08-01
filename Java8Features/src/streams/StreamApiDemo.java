package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {

		
		List<Integer>  list2  = new ArrayList<Integer>(5);
		
		list2.add(5);
		list2.add(15);
		list2.add(25);
		list2.add(35);
		list2.add(45);
		list2.add(90);
		list2.add(145);
		list2.add(215);

		
			Stream<Integer>  stream1 =		list2.stream();
			
			
			long count =	stream1.count();
			
			System.out.println(count);
			
			Stream<Integer>  stream2 =		list2.stream();
			
				//stream2.forEach((Integer num)->{System.out.println(num);});

			stream2.filter( (Integer num)->{ return num > 50;}  )
			        .forEach((Integer num)->{System.out.println(num);});
			
			
	}

}
