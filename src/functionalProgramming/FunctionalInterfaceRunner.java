package functionalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

class EvenNumberPredicate implements Predicate<Integer> {

	public boolean test(Integer num) {
		return num % 2 == 0;
	}
	
}

class PrintNumberConsumer implements Consumer<Integer> {

	public void accept(Integer num) {
		System.out.println(num);
	}
	
}

class MapNumberSquareFunction implements Function<Integer, Integer> {

	public Integer apply(Integer number) {
		return number * number;
	}
	
}

public class FunctionalInterfaceRunner {
	
	public static void main(String[] args) {

		List.of(52, 63, 13, 35, 64).stream()
		.filter(num -> num % 2 == 0)
		.forEach(num -> System.out.println(num));
		
		System.out.println("Hey look, behind the scenes implementing Functional Interface for filter");
		
		List.of(52, 63, 13, 35, 64).stream()
			.filter(new EvenNumberPredicate())
			.forEach(num -> System.out.println(num));
		
		System.out.println("Hey look, behind the scenes implementing Functional Interface for forEach");
		
		List.of(52, 63, 13, 35, 64).stream()
		.filter(new EvenNumberPredicate())
		.forEach(new PrintNumberConsumer());
		
		
		List.of(52, 63, 13, 35, 64).stream()
		.filter(new EvenNumberPredicate())
		.map(num -> num * num)
		.forEach(new PrintNumberConsumer());
		
		System.out.println("Hey look, behind the scene implementing Functional Interface for map");
		
		List.of(52, 63, 13, 35, 64).stream()
		.filter(new EvenNumberPredicate())
		.map(new MapNumberSquareFunction())
		.forEach(new PrintNumberConsumer());
		
	}
}
