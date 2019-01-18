import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {
	
//		List<Integer> l1  = new LinkedList<>();	
		
		
		Integer[] inArr = {1, 2, 3, 4, 5};
//		List<Integer> l1 =   Arrays.asList(inArr);
		
		List<Integer> l1  = new LinkedList<>();	
		l1.add(1);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(5);
//		Collections.addAll(l1, 1, 2,  7, 5);
		
		List<Integer> l2  = new LinkedList<>();	
		l2.add(1);
		l2.add(4);
		l2.add(3);
		l2.add(6);
		l2.add(5);
//		Collections.addAll(l2, 2,  4, 5);

		
		
System.out.println(compareList(l1, l2));
		
		
		Integer min = Collections.min(l1);
		Integer max = Collections.max(l1);
		
//		Iterator<Integer> iterator = l1.iterator();
//		while(iterator.hasNext()) {
//			Integer next = iterator.next();
//			if(next>2) {
//				iterator.remove();
//			}
//		}
		System.out.println(getMoreThan(l1, 2));
	}
	
	public static List<Integer> getMoreThan(List<Integer> l1, int i){
		return l1.stream().filter(i1 -> i1 >i).collect(Collectors.toList());
	}

	
//	public static List<Integer> getMoreThan(List<Integer> l1, int i){
//		
//		List<Integer> ret = new ArrayList<>();
//		for(Integer i1:l1) {
//			if(i1>i) {
//				ret.add(i1);
//			}
//		}
//		return ret;
//	}
	
	public static List <String> compareList(List<Integer> l1, List<Integer> l2) {
		
		List <String> ret = new LinkedList<>();
		
		for (int i = 0; i < l1.size(); i++) {
			if(l1.get(i).equals(l2.get(i))) {
				ret.add("yes");			
		}
			else {
				ret.add("no");
			}
		
		}
		
		return ret;
	}
}
