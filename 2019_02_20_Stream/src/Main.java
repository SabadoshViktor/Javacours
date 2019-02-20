import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;


import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		
		Employee frank = new Employee("Frank", 2500);
		Employee john = new Employee("Frank", 200);
		Employee anna = new Employee("Frank", 1500);

		Integer salary = frank.getSalary();
		
		Supplier<Integer> sup = frank::getSalary;
		
		Function<Employee, String> employeeStringFunction = e -> "" + e.getSalary();
		
		List<Employee> employees = Arrays.asList(frank, john, anna);
		
		List<Employee> employees2 = new ArrayList<>();
		employees2.add(anna);
		employees2.add(frank);
		employees2.add(john);
		
		Stream<Employee> s1 = Stream.of(frank, john, anna);
		
		Optional<Integer> max = s1.map(p -> p.getSalary()).max(Integer::compare);
		
		System.out.println("Max " + max.get());
		
		List<Employee> e2 = Arrays.asList( john, anna);
		employees2.addAll(e2);
		
		System.out.println(employees2.size());
		
		Stream<Integer> map = employees2.stream().map(e -> {
			System.out.println("NAME" + e.getName());
			return e.getSalary();
		});
		map.forEach(System.out::println);
	}

}
