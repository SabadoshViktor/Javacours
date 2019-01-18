import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Copyable c1 = new CopyFaxMachine();
		Faxable f3 = new CopyFaxMachine();
		
		CopyFaxMachine c2 = new CopyFaxMachine();
		
	/*	c1.copy();
		f3.fax();
		
		c2.copyAndFax();
		copyAndSendByEmail(c2);
		
	*/	
		
		
		
		
		Faxable2 f0 = new Faxable2() {    //локально
			
			@Override
			public boolean fax(String document) {
				return document.length() == 5;
			}
		};
		
		
		Faxable2 f1 = s -> s.length() == 3;  // лямбда ф-ия
		// домашка н3. трансформер зробити за допомогою лямбда ф-ій
		
		Faxable2 f2 = new FaxDevice();
		
		
		//System.out.println(f1.fax("abcde")+ " " + f2.fax("abcde"));
		
		
		
		Person p1 = new Person(25, "Ili");
		Person p2 = new Person(15, "sis");
		Person p3 = new Person(7, "Papa");
		
		Person [] persons = {p3 , p2 , p1};
		
		Comparator<Person> personComparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		

		Arrays.sort(persons, new PersonComparatorByName());
		
		
		
		System.out.println(Arrays.asList(persons));

	}
	
	public static void copyAndSendByEmail(Copyable copy) {
		copy.copy();
	}

}
