import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		List<Customer> customers = Arrays.asList(new Customer("Ivan","Ivanich", 22),
				new Customer("Sergio", "Pedro", 25),
				new Customer("Ishtvan", "Poladi", 79));



		System.out.println("******************Just reading file***************************************");
		FileReaderFromFile("/home/sabadosh/Documents/test.txt");

		System.out.println("******************Summing all integers in file****************************");
		sumIntFromFile("testWithIntegers");

		System.out.println("******************Sorting array with strings *****************************");
		System.out.println("BEFORE:");
		FileReaderFromFile("StringsWithDifferentLength");
		System.out.println("");
		System.out.println("After: ");
		sortingStrings("StringsWithDifferentLength");

		System.out.println("******************Sorting CSV file****************************************");
		sortingCSVfile("CSVfile");

		System.out.println("*******************Save list in CSV File**********************************");
		makeCSVFile(customers, "Customers");

		System.out.println("********************Copy file*********************************************");
		copyFile("Customers", "/home/sabadosh/Documents/copyCustomers.txt");

		System.out.println("********************Summing gadgets price*********************************");
		summingGadgetsPrice("NamesWithGadgets");




	}

	public static void FileReaderFromFile(String fileAddress) {
		try (FileReader reader = new FileReader(fileAddress)) {
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void sumIntFromFile(String fileAddress) {
		int res;
		try (BufferedReader br = new BufferedReader(new FileReader(fileAddress))) {
			res = br.lines().mapToInt(Integer::parseInt).sum();
			System.out.println("Sum is " + res );
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	public static void sortingStrings(String fileAddress) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(fileAddress));
		reader.lines()
				.sorted(Comparator.comparing(String::length))
				.forEach(System.out::println);

	}


	public static void sortingCSVfile(String fileAddress) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileAddress));
		br.lines()
				.map(Main::makePersons)
				.sorted(Comparator.comparing(Person::getAge))
				.forEach(System.out::println);
	}

	private static Person makePersons(String s) {
		String [] person = s.split(",");
		return new Person(person[0], Integer.parseInt(person[1]));
	}

	private static void makeCSVFile(List<Customer> customers, String outputFileAddress) throws IOException {
		try (
			 PrintWriter pw = new PrintWriter(new FileWriter(outputFileAddress))) {
			 customers.stream()
					.map(s -> customerToString(s))
					.forEach(pw::println);
		}
	}

	public static String customerToString(Customer customer) {
		return customer.getFirstName() +" "+customer.getLastName()+ "," + customer.getAge();
	}

	public static void copyFile(String inputFile, String outputFile) throws  IOException {
		File source = new File(inputFile);
		File dest = new File(outputFile);
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
		} finally {
			in.close();
			out.close();
		}
	}

	public static void summingGadgetsPrice(String fileAddres) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(fileAddres))) {

			Map<String, Integer> collect = br.lines()
					.map(s -> stringToPerson2(s))
					.collect(Collectors.groupingBy(Person2::getFullName, Collectors.summingInt(p->p.gadget.getPriceTag())));


			List<Map.Entry<String, Integer>> entries = new ArrayList<>(collect.entrySet());
			entries.sort(Map.Entry.comparingByValue());

			entries.forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
		}
	}

	public static Person2 stringToPerson2(String s) {
		String[] split = s.split(",");
		Gadget gadget = new Gadget(split[2], Integer.parseInt(split[3]));
		Person2 person = new Person2 (split[0], split[1], gadget);
		return person;
	}




}

