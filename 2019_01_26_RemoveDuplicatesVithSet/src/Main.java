import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<String> duplicates = Arrays.asList("Ivan", "petr", "Ivan", " Anna");
		//System.out.println(removeDuplicates(duplicates));
		
		System.out.println(getDuplicates(duplicates));
		
	}

//	public static List<String> removeDuplicates(List<String> strings){
//		
//		Set<String> set = new HashSet<>();
//		set.addAll(strings);
//		
//		return new ArrayList<>(set);
//	}
	  public static List<String> getDuplicates(List<String> strings){
		
		Set<String> set = new HashSet<>();
		List<String> ret = new ArrayList<>();

		for(String s:strings) {
			if(!set.add(s)) {
				ret.add(s);
			}
		}
//		set.addAll(strings);
		
		return ret;
	}

	  
	  
	  public static List<String> removeDuplicatesVithoutSet(List<String> strings){
		  
		  return null;
	  }
	  
}


//��: ���������� ��� ����
//1.List<String> getDuplicates(List<String> strings){}
//2remove duplicates without Sets
//���������� � ������ (HashMap)