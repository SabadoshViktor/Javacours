package stream_api.HomeWork;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamHW {

//    public static List<Integer> returnSquareRoot(List<Integer> numbers){
//        throw new NotImplementedException();
//    }

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
//
    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
    	return integers.stream()
    			.skip(2)
    			.collect(Collectors.toList());
    }
//
//    public static List<String> getFirstNames(List<String> names){
//        names.stream();
//    }

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
//
//    public static double getAverageAge(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static Integer getMaxAge(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static Integer getMinAge(List<User> users) {
//        throw new NotImplementedException();
//    }
//
//    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){                       ?????????????????????????????????????
//        return users.stream()
//        		.map(User::isMale)
//        		.collect(Collectors.toMap(User::isMale, Arrays.asList(User::getName))));
//    }

//    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
//        return users.stream()
//        		.map(User::isMale)
//        		.collect(Collectors.toMap(User::getName	, 
//    						.mapping(User, User::isMale)));
//    }

    
    
    
    
    
    
    public static Map<Integer, List<User>> groupByAge(List<User> users){
        ;
    }

//    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static Map<Boolean, Long> countGender(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static boolean anyMatch(List<User> users, int age){
//        throw new NotImplementedException();
//    }
//
//    public static boolean noneMatch(List<User> users, int age){
//        throw new NotImplementedException();
//    }
//
//    public static Optional<User> findAny(List<User> users, String name){
//        throw new NotImplementedException();
//    }
//
//    public static List<User> sortByAge(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static Stream<Integer> getBoxedStream(IntStream stream){
//        throw new NotImplementedException();
//    }
//
//    public static List<Integer> generateFirst10PrimeNumbers(){
//        throw new NotImplementedException();
//    }
//
//    public static boolean isPrime(int number) {
//        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
//    }
//
//    public static List<Integer> generate10RandomNumbers(){
//        throw new NotImplementedException();
//    }
//
//    public static User findOldest(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static int sumAge(List<User> users){
//        throw new NotImplementedException();
//    }
//
//    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
//        throw new NotImplementedException();
//    }

}
