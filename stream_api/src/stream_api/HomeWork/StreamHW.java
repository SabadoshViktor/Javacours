package stream_api.HomeWork;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamHW {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
    	 return  numbers.stream().map(p -> Math.sqrt(p))
      		   .map(p -> p.intValue())
      		   .collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user){
    	return user.stream().map(s->s.getAge())
                .collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
    	return users.stream()
    	.map(User::getAge)
        .distinct()
        .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
    	return users.stream()
        .limit(limit)
        .collect(Collectors.toList());
    }

    public static long countUsersOlderThen25(List<User> users){
        return users.stream()
        		.filter(u -> u.getAge() > 25)
        		.count();
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream()
        		.collect(Collectors.summingInt(Integer::intValue));
       // or
//        		.reduce((a1, a2) -> a1+a2)
//				.orElse(0);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
    	return integers.stream()
    			.skip(2)
    			.collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names){
    	return names.stream().map((s) -> s.substring(0, s.indexOf(" ")))
      		  .collect(Collectors.toList());
    	}

    public static List<String> getDistinctLetters(List<String> names){
       return names.stream()
    		   .flatMap(n -> Arrays.asList(n.split(",")).stream())
    				   .distinct()
    				   .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream()
        		.map(User::getName)
        		.collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users){
    	 return users.stream().mapToInt(User::getAge)
    		        .average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users){
    	return users.stream().map(User::getAge)
    		       .max((p1, p2) -> p1.compareTo(p2)).get();    }

    public static Integer getMinAge(List<User> users) {
    	return users.stream().map(User::getAge)
    			.min((u1, u2) -> u1.compareTo(u2)).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){                      
        	return users.stream().collect(Collectors
               		.partitioningBy((p) -> p.isMale()));
    }
    
    public static Map<Integer, List<User>> groupByAge(List<User> users){
    	return users.stream().collect(Collectors.groupingBy((p)->p.getAge()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream().collect(Collectors.groupingBy(User::isMale, 
                Collectors.groupingBy(User::getAge)));    }

    public static Map<Boolean, Long> countGender(List<User> users){
    	return users.stream().collect(Collectors.groupingBy((User::isMale),
        		Collectors.counting()));    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream().anyMatch(s->s.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age){
    	return users.stream().noneMatch(s->s.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream()
        		.findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream().sorted((s1,s2)->s1.getAge().compareTo(s2.getAge()))
        .collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
    	return stream.boxed();
    	
    }
//    public static boolean isPrime(int number) {
//    }

    public static User findOldest(List<User> users){
        return users.stream().max((p1, p2) -> p1.getAge()
        	.compareTo(p2.getAge())).get();
    }

    public static int sumAge(List<User> users){
    	return users.stream().mapToInt(User::getAge)
    			.sum();

    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        return users.stream().mapToInt(User::getAge)
        .summaryStatistics();
    }

}
