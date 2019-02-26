package person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		BankAccount2 b1 = new BankAccount2("DE1132342341");
		BankAccount2 b2 = new BankAccount2("DE11345331");
		BankAccount2 b3 = new BankAccount2("DE444533341");
		BankAccount2 b4 = new BankAccount2("DE666653345111");
		BankAccount2 b5 = new BankAccount2("DE88815567511");
		BankAccount2 b6 = new BankAccount2("DE0015678686756411");
		BankAccount2 b7 = new BankAccount2("DE123321111");
		
		Person p1 = new Person("Sasha", Arrays.asList(b1,b2,b3));
		Person p2 = new Person("Lena", Arrays.asList(b1,b4,b5));
		Person p3 = new Person("Petya", Arrays.asList(b2,b6,b7));
		Person p4 = new Person("Vasya", Arrays.asList(b1,b7,b3));
		Person p5 = new Person("Ivan", Arrays.asList(b1,b5,b3));

		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(getIbansListWithStars(persons));
	}
	
	public static List<String> getIbansListWithStars (List<Person> persons){
		return persons
        .stream()
        .flatMap(p -> p.getBankAccounts().stream())
        .map(BankAccount2::getIBAN)
        .map(Main::stars)
        .collect(Collectors.toList());
	}
	
	public static String stars(String iban) {
        return iban.substring(0, 3) + iban.substring(3).replaceAll("\\w", "*");
    }
}
