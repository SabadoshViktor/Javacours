package ExtraHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ivan", 22);
		Person p2 = new Person("Petro", 34);
		Person p3 = new Person("Sveta", 12);
		Person p4 = new Person("Kolya", 99);
		Person p5 = new Person("Robi", 15);
		Person p6 = new Person("Sergey", 14);
		
		BankAccount b1 = new BankAccount(p1, "DE9883736");
		BankAccount b2 = new BankAccount(p2, "DE9883736");
		BankAccount b3 = new BankAccount(p1, "DE9883736");
		BankAccount b4 = new BankAccount(p2, "DE9883736");
		BankAccount b5 = new BankAccount(p2, "DE9883736");
		BankAccount b6 = new BankAccount(p3, "DE9883736");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Supplier<Box> sup = () ->{
			return new Box(0);
		};
		
		BiConsumer<Box, Person> cons = (result, person) -> {
			result.setCount(result.getCount() + person.getAge());
		};
		
		BinaryOperator<Box> combiner = (res1, res2) -> {
			res1.setCount(res1.getCount() + res2.getCount());
			return res1;
		};
		
		Function<Box, Integer> finisher = Box::getCount ;  // b1 -> b1.getCount()
		
		Collector<Person, Box, Integer> collector = Collector.of(
				sup,
				cons,
				combiner,
				finisher
		);
		
		
		Integer sum = persons.stream()
		.collect(collector);
		
		System.out.println(sum);
	}
	

}
