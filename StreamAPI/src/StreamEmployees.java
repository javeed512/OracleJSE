import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamEmployees {

	public static void main(String[] args) {


		
			List<Employee>  empList = new ArrayList<Employee>();
			
					empList.add(new Employee(101, "king", 5000, "Finance"));
					empList.add(new Employee(102, "tom", 4000, "HR"));
					empList.add(new Employee(103, "scott", 7000, "Development"));
					empList.add(new Employee(104, "ford", 9000, "Development"));
					empList.add(new Employee(105, "raju", 7000, "Development"));
					empList.add(new Employee(106, "ford", 12000, "Testing"));
		
						//empList.forEach(System.out::println);
					
				Stream<Employee>  stream =	empList.stream();
				
			//	stream.filter( emp ->  emp.getEname().startsWith("f") )
					//	.forEach(System.out::println);
						
				
				stream.sorted(Comparator.comparing(Employee::getSalary).reversed())
					.forEach(System.out::println);
				
				Supplier<Employee>  s=		Employee::new;
					
						Employee e1 =	s.get();
						
					Supplier<String>  s2 =			String::new;
		
		
	}

}
