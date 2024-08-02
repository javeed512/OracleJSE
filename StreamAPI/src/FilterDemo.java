import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "kiwi", "guava", "orange","kiwi","orange");
	
	
		Stream<String> stream1 =		list.stream();
		
		
		/*
		 * stream1.filter( (name)->{ return name.length() > 5;} )
		 * .forEach(System.out::println);
		 */
		
		/*
		 * stream1.filter( (name)->{ return name.startsWith("k");} )
		 * .forEach(System.out::println);
		 */
		
		stream1.filter( (name)->{ return name.length() >= 5;} )
		  .distinct()
		  //.limit(2)
		  .skip(2)
		 .forEach(System.out::println);
		
		
		
		int a1[] = { 10, 23, 45, 2, 7, 80 };
		
		IntStream  stream =	Arrays.stream(a1);
		
	//	OptionalInt  optional =	stream.reduce((a,b)->{return a+b;});
		
			int result =	stream.reduce((a,b)->{return a+b;}).orElse(0);
	
				System.out.println(result);
				
				
				
		Stream<String> stream3 =		list.stream();		
		
		System.out.println("Sorted Names");
		
					//stream3.sorted().forEach(System.out::println);
					
		//stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	 
	}
		
		
		
}
