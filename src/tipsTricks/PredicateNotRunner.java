package tipsTricks;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,6,7,2,44);
		
		Predicate<Integer> evenNumberPredicate = number -> number%2 == 0;
		
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		
		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
	
		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
		
		// Predicate.not method introduced in java 11
		
		numbers.stream().filter(
				Predicate.not(PredicateNotRunner::isEven))
				.forEach(System.out::println);
	}
	
}
