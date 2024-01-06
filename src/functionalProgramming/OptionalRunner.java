package functionalProgramming;

import java.util.List;

public class OptionalRunner {
	public static void main(String[] args) {
		
		System.out.println(List.of(35, 52, 55, 13, 346, 36).stream().filter(num -> num % 2 != 0).max((num1, num2) -> Integer.compare(num1, num2)));
		
		System.out.println(List.of(35, 52, 55, 13, 346, 36).stream().filter(num -> num % 2 != 0).max((num1, num2) -> Integer.compare(num1, num2)).get());
		
		
		System.out.println(List.of(31, 9, 45, 61).stream().filter(num -> num % 2 == 0).max((num1, num2) -> Integer.compare(num1, num2)));
	
		System.out.println(List.of(31, 9, 45, 61).stream().filter(num -> num % 2 == 0).max((num1, num2) -> Integer.compare(num1, num2)).isEmpty());
		
		System.out.println(List.of(31, 9, 45, 61).stream().filter(num -> num % 2 == 0).max((num1, num2) -> Integer.compare(num1, num2)).orElse(0));
		
	}
}
