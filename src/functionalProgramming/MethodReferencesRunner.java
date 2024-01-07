package functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
	
		List.of("Apple", "Banana", "Carrot", "Dates").stream()
			.map(fruit -> fruit.length())
			.forEach(length -> System.out.println(length));
		
		System.out.println("let's check with Method References");
		
		List.of("Apple", "Banana", "Carrot", "Dates").stream()
			.map(fruit -> fruit.length())
			.forEach(System.out::println);
		
		System.out.println("let's check Method Reference with Custom method");
		
		List.of("Apple", "Banana", "Carrot", "Dates").stream()
			.map(String::length)
			.forEach(MethodReferencesRunner::print);
		
		
		// Exercise 2
		
		Integer maxNum = List.of(23, 45, 67, 34).stream()
							.filter(num -> num % 2 == 0)
							.max((num1, num2) -> Integer.compare(num1, num2))
							.orElse(0);
		System.out.println(maxNum);
		
		System.out.println("let's check with Method References");
		
		Integer maxNumber = List.of(23, 53, 64, 13, 35, 62).stream()
								.filter(MethodReferencesRunner::isEven)
								.max(Integer::compare)
								.orElse(0);
		System.out.println(maxNumber);
	}
}
