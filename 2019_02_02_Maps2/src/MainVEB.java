import java.util.*;

public class MainVEB {

	public static void main(String[] args) {

		List<String> listA = new LinkedList<>();
		List<String> listB = new LinkedList<>();
		listA.add("Java");
		listA.add("Method");
		listA.add("Picasso");
		listA.add("Sanadoval");
		listA.add("Armstrong");
		listA.add("Gilespy");
		
		listB.add("Dizzy");
		listB.add("Java");
		listB.add("Jazz");
		listB.add("Miller");
		listB.add("Rocky");
		listB.add("Picasso");
		listB.add("Method");
	System.out.println(listA);
	System.out.println(listB);
	
	System.out.println(findDuplicates(listA, listB));
	
	}
	
	public static List<String> findDuplicates(List<String> listA , List<String> listB){
		
		List<String> res = new LinkedList<>();
		HashSet<String> set = new HashSet<>(listA);
		  for (String s : listB) {
		    if (set.contains(s)) {
		    	res.add(s);
		  }
		}
		return res;
	}		
}
