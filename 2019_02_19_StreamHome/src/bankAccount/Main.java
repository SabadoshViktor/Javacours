package bankAccount;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("DE111", new Person("Ivan"));
		BankAccount b2 = new BankAccount("DE222", new Person("Sasha"));
		BankAccount b3 = new BankAccount("DE3333", new Person("Kolya"));
		BankAccount b4 = new BankAccount("DE44445", new Person("Ivan"));
		BankAccount b5 = new BankAccount("DE555555", new Person("Sasha"));
		BankAccount b6 = new BankAccount("DE666655", new Person("Lesya"));
		
		List<BankAccount> accounts = Arrays.asList(b1, b2, b3, b4, b5, b6);
		System.out.println(getBankAccounts(accounts));
		System.out.println(getBankAccountsFromName(accounts));
		System.out.println(getIbansWithoutSymbols(accounts));
		
	}
	
	public static Map<Person, List<BankAccount>> getBankAccounts(List<BankAccount> accounts){
		return accounts.stream()
				.collect(Collectors
						.groupingBy(BankAccount::getOwner));
	}
	
	public static Map<String, List<String>> getBankAccountsFromName(List<BankAccount> accounts){
		
			return accounts.stream()
					.collect(Collectors
							.groupingBy(b->b.getOwner().getName(),
									Collectors.mapping(b->b.getIBAN(),
											Collectors.toList())));
			
	}
	
	public static List<String> getIbansWithoutSymbols(List<BankAccount> accounts){
		return accounts.stream()
		.map(BankAccount::getIBAN)
		.map(s -> stars(s))
		.collect(Collectors.toList());
		
	}
	
	public static String stars(String ibans) {
		return ibans.substring(0, 3) + ibans.substring(3).replace("\\d", "*");
	}
	
	
	

}
