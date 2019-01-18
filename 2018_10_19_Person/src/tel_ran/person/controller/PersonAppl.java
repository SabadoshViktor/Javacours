package tel_ran.person.controller;

import tel_ran.person.data.Person;

public class PersonAppl {

	public static void main(String[] args) {

		Person p1=new Person();
		p1.setAge(41);
		p1.setName("Adam");
		p1.setSurName("Kupedman");
		p1.setTaxID(777);
		p1.setSex(true);
		
		p1.display();
		
		Person p2 = new Person(888, "Eva", "Adamovna", 18, false);
		p2.display();
		
		p2.display("Dear", 2);
		p1.display("Ugly", 4);
	}

}
