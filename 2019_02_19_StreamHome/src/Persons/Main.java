package Persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Address a1 = new Address("Askanierring", 57);
		Address a2 = new Address("Seegefelder", 72);
		Address a3 = new Address("Ring", 57);
		Address a4 = new Address("Londonska", 5);
		Address a5 = new Address("Moskovska", 1);
		Address a6 = new Address("WhallStreet", 12);
		Address a7 = new Address("Shokoladnaya", 658);
		Address a8 = new Address("Rostovska", 666);
		Address a9 = new Address("BerlinerKindl", 14);
		Address a10 = new Address("Gazovaya", 999);
		
		Person p1 = new Person("Petrov",17, a1);
		Person p2 = new Person("Petrov",22, a2);
		Person p3 = new Person("Ostapenko",23, a3);
		Person p4 = new Person("Ostapenko",10, a4);
		Person p5 = new Person("Putin",17, a5);
		Person p6 = new Person("Tramp",45, a6);
		Person p7 = new Person("Poroshenko", 17, a7);
		Person p8 = new Person("Yanukovich",24 , a8);
		Person p9 = new Person("Merkel",22, a9);
		Person p10 = new Person("Timoshenko", 23, a10);
		
		
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
		List<String> names = list.stream().map(p -> p.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		System.out.println(removeDublicates(names));
		
		List<Person> addresses = list.stream().filter(x -> x.equals(x.getAge())).collect(Collectors.toList());
		
	}
	
	public static List<String> removeDublicates(List<String> names){
		return	names.stream().distinct().collect(Collectors.toList());
	}
	
//	public List<Address> get17YearsOld(List<Person> persons){
//	//	List<Address> addresses = new ArrayList<>();
//		Stream<Person> stream = persons.stream();
//		stream.filter(x -> x.equals(x.getAge()
//		List<Address> addresses = persons.stream().filter(x -> )		
//		return addresses ;
//	}

	
}


