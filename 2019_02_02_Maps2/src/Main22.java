import java.util.*;

public class Main22 {
	
public static void main(String[] args) {
		
//		populateMap();
//		System.out.println("*********************************************");
//		System.out.println(anagrams("anna"));
	
		System.out.println(getWordsCount2("ivan"));

	}
	
	public static String[] voc = {"ivan", "piotr", "vani" , "anna","nana", "nnaa", "sasha", "sahsa"};
	public static Map<String, List<String>> map = new HashMap<>();
	
	
	public static String[] voc2 = {"ivan", "piotr", "ivan" , "anna","ivan", "anna","ivan", "ivan", "ivan", "ivan", "ivan", "ivan", "ivan"};
	public static Map<String,Integer>map2 = new HashMap<>();

	
	public static void populateMap() {
		for (String s: voc) {
			String sorted = sortString(s);
			System.out.println(sorted);
			if(!map.containsKey(sorted)){
				List<String> l = new ArrayList<>();
				l.add(s);
				map.put(sorted, l);
			}
			else {
				List<String> list = map.get(sorted);
				list.add(s);
			}
		}
		System.out.println(map);
		
	}
	
	public static String sortString(String s) {
		char[] chars = s.toCharArray();
	    Arrays.sort(chars);
		return new String(chars);
	}
	
	public static List<String> anagrams(String s){
		String res = sortString(s);
		return map.get(res);
		
	}
	
//	public static void getWordsCount() {
//		int res;
//		for (String s: voc2) {
//			if(!map2.containsKey(s)){
//				res++;
//				List<Integer> l = new ArrayList<>();
//				l.add(res);
//				map2.put(s, l);
//			}
//			else {
//				List<Integer> list = map2.get(s);
//				list.add(res);
//				res++;
//			}
//		}
//		System.out.println(map2.get(s));		
//	}
	
	public static Map<String, Integer> getWordsCount2(String string) {
		for (String s: voc2) {
			if(!map2.containsKey(s)){
				map2.put(s, 1);
			}
			else {
				int count = map2.get(s);
				map2.put(s, count+1);
				}
		}
		return map2;
		
	}
	
	

}
