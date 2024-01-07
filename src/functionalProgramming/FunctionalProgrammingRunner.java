package functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {		// Functions as First Class Citizens
	
	private static void printBasic(List<String> list) {
		for(String str: list) {
			System.out.println(str);
		}
	}
	
	private static void printWithFunctionalProgramming(List<String> list) {
		list.stream().forEach(
					element -> System.out.println("element - "+element)			// lambda function & Function being passed as an argument to another function
				);
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String str: list) {
			if(str.endsWith("ot")) {
				System.out.println(str);
			}
		}
	}
	
	private static void printWithFunctionalProgrammingForFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("ot"))
			.forEach(str -> System.out.println("element - "+str));
	}
	
	private static void printWithFunctionalProgrammingForOddNums(List<Integer> numsList) {
		numsList.stream()
		.filter(num -> num % 2 != 0)
		.forEach(num -> System.out.println(num));
	}
	
	private static void printWithFunctionalProgrammingForEvenNums(List<Integer> numsList) {
		numsList.stream()
		.filter(num -> num % 2 == 0)
		.forEach(num -> System.out.println(num));
	}
	
	private static void printNumSum(List<Integer> numList) {
		int sum = 0;
		for(int num: numList) {
			sum += num;				// mutations
		}
		System.out.println(sum);
	}
	
	private static void printWithFunctionalProgrammingForNumSum(List<Integer> numsList) {
		int numSum = numsList.stream()
						.reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(numSum);
	}
	
	private static void printWithFunctionalProgrammingForOddNumSum(List<Integer> numsList) {
		int oddNumSum = numsList.stream()
							.filter(num -> num % 2 != 0)
							.reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(oddNumSum);
	}
	
	public static void main(String[] args) {
	
		List<String> list = List.of("Apple", "Banana", "Beet root", "Carrot", "Drum Stick");
		printBasic(list);
		printWithFunctionalProgramming(list);
		
		printBasicWithFiltering(list);
		printWithFunctionalProgrammingForFiltering(list);
		
		List<Integer> nums = List.of(1, 4, 7, 9);
		printWithFunctionalProgrammingForOddNums(nums);
		printWithFunctionalProgrammingForEvenNums(nums);
		
		printNumSum(nums);
		
		printWithFunctionalProgrammingForNumSum(nums);
		printWithFunctionalProgrammingForOddNumSum(nums);
		
		List<Integer> numbers = List.of(4, 824, 24, 15, 87, 345, 87, 24);
		
		numbers.stream().sorted().forEach(number -> System.out.println(number));
		
		numbers.stream().distinct().sorted().forEach(number -> System.out.println(number));
		
		numbers.stream().distinct().sorted().map(num -> num*num).forEach(num -> System.out.println(num));
		
		System.out.println("let's exercise");
		
		// let's print squares of first 10 numbers
		List<Integer> firstNums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntStream.range(0, 11).map(num -> num*num).forEach(squaredNum -> System.out.println(squaredNum));
		
		List<String> words = List.of("Apple", "Ant", "Bat");
		words.stream().map(word -> word.toLowerCase()).forEach(word -> System.out.println(word));
		
		words.stream().map(word -> word.length()).forEach(wordLength -> System.out.println(wordLength));
		
		System.out.println("let's explore Terminal Operations");
		
		System.out.println(IntStream.range(1, 11).reduce(0, (num1, num2) -> num1+num2));
		
		System.out.println(List.of(23, 53, 63, 14, 45).stream().max((num1, num2) -> Integer.compare(num1, num2)).get());
		
		System.out.println(List.of(53, 53, 13, 35, 65, 7, 22, 41).stream().min((num1, num2) -> Integer.compare(num1, num2)).get());

		System.out.println(List.of(13, 14, 24, 53, 63, 25).stream().filter(number -> number % 2 != 0).collect(Collectors.toList()));
	
		System.out.println(List.of(35, 26, 97, 24, 15, 98).stream().filter(number -> number % 2 == 0).collect(Collectors.toList()));
		
		System.out.println(IntStream.range(1, 11).map(number -> number*number).boxed().collect(Collectors.toList()));
	}
}
