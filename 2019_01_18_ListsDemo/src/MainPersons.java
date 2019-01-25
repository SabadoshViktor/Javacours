import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MainPersons {
	
	public static void main(String[] arg) {
		
		
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
		
		Person p1 = new Person("Ivanov", a1);
		Person p2 = new Person("Petrov", a2);
		Person p3 = new Person("Smirnov", a3);
		Person p4 = new Person("Ostapenko", a4);
		Person p5 = new Person("Putin", a5);
		Person p6 = new Person("Tramp", a6);
		Person p7 = new Person("Poroshenko", a7);
		Person p8 = new Person("Yanukovich", a8);
		Person p9 = new Person("Merkel", a9);
		Person p10 = new Person("Timoshenko", a10);
		

		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		persons.add(p9);
		persons.add(p10);
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(a1);
		addresses.add(a2);
		addresses.add(a3);
		addresses.add(a4);
		addresses.add(a5);
		addresses.add(a6);
		addresses.add(a7);
		addresses.add(a8);
		addresses.add(a9);
		addresses.add(a10);
		
//		System.out.println(persons);
		
	//	System.out.println(getAddresses(persons));
		
//		System.out.println(getAddressesByPersonName(persons, p4));
	
}
	
	
	public static List<Address> getAddresses(List<Person> persons){
		
		List<Address> res = new ArrayList<>();
		
		for (int i = 0; i < persons.size()-1; i++) {
				 res.add(persons.get(i).getAddress());
			}
		return res;
	}

public static List<Address> getAddressesByPerson(List<Person> persons, Person person){
		
		List<Address> res = new ArrayList<>();
		
		for (int i = 0; i < persons.size()-1; i++) {
			if(persons.get(i).getName().equals(person.getName())) {
				 res.add(persons.get(i).getAddress());
			}
		}
		
		return res;
	}

public static List<Address> getAddressesByPersonName(List<Person> persons, String name){
	
	List<Address> res = new ArrayList<>();
	
	for (int i = 0; i < persons.size()-1; i++) {
		if(persons.get(i).getName().equals(name)) {
			 res.add(persons.get(i).getAddress());
		}
	}
	
	return res;
}



	
}


//Person p1 = new Person("Ivanov", new Address("Askanierring", 57));
//Person p2 = new Person("Petrov", new Address("Seegefelder", 72));
//Person p3 = new Person("Smirnov", new Address("Ring", 57));
//Person p4 = new Person("Ostapenko", new Address("Londonska", 5));
//Person p5 = new Person("Putin", new Address("Moskovska", 1));
//Person p6 = new Person("Tramp", new Address("WhallStreet", 12));
//Person p7 = new Person("Poroshenko", new Address("Shokoladnaya", 658));
//Person p8 = new Person("Yanukovich", new Address("Rostovska", 666));
//Person p9 = new Person("Merkel", new Address("BerlinerKindl", 14));
//Person p10 = new Person("Timoshenko", new Address("Gazovaya", 999));
