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
	
	List<String> strings = new ArrayList<>(Arrays.asList("Java" , "Method", "Jazz", "Rocky", "Lenovo", " Lexus", "Mazda"));

	
	System.out.println(findDuplicates(listA, listB));
	
	}
	
	public static List<String> findDuplicates(List<String> listA , List<String> listB){
		
		List<String> res = new ArrayList<>();
		HashSet<String> set = new HashSet<>(listA);
		  for (String s : listB) {
		    if (set.contains(s)) {
		    	res.add(s);
		  }
		}
		return res;
	}		
	
	public static Map<String, List<String>> task(List<String> strings){
		if((strings==null)||(strings.size()==0)) return Collections.emptyMap();
		
		Map<String, List<String>> res = new HashMap<String, List<String>>();
		
		
		
		return null;
	}
	
}
