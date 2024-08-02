import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Integer a1[] = { 10, 23, 45, 2, 7, 80 };

		Stream<Integer> stream1 = Arrays.stream(a1);

		stream1.forEach((n) -> {
			System.out.println(n);
		});

		List<String> list = Arrays.asList("apple", "banana", "kiwi", "guava", "orange");

			Stream<String> stream2 =		list.stream();
		
			/*
			 * stream2.map( (str)->{ System.out.print(str +" "); return str.length(); } )
			 * .forEach( (n)->{System.out.println(n);} );
			 */
		
	
  List<Integer>  list2 =	stream2.map( (str)->{ return str.length(); }  )
    .collect(Collectors.toList());
  
  				System.out.println(list2);
  				
  				list2.forEach((l1)->{System.out.println(l1);});
	
	
	}

}
