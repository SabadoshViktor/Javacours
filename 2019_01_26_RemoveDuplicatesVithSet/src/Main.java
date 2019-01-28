import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<String> duplicates = Arrays.asList("Ivan", "petr", "Ivan", " Anna");
		//System.out.println(removeDuplicates(duplicates));
		
		
	}

//	public static List<String> removeDuplicates(List<String> strings){
//		
//		Set<String> set = new HashSet<>();
//		set.addAll(strings);
//		
//		return new ArrayList<>(set);
//	}
	  public static List<String> removeDuplicateswithoutSets(List<String> strings){
		
		Set<String> set = new HashSet<>();
		set.addAll(strings);
		
		return new ArrayList<>(set);
	}

}


//��: ���������� ��� ����
//1.List<String> getDuplicates(List<String> strings){}
//2remove duplicates without Sets
//���������� � ������ (HashMap)