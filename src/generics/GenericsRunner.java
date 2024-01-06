package generics;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsRunner {
	
	// Generics for method
	
	static <X> X doSomething(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	static Number sumOfNumberList(List<? extends Number> numbers) { // ? specifies anything which extends Number class is valid
		double sum = 0.0;
		for(Number number: numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	static void addValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1l);
		numbers.add(1.0f);
	}
	
	
	
	public static void main(String[] args) {
		
		List<Number> emptyList = new ArrayList<>();
		addValues(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1, 3, 5, 6, 7, 8)));
		System.out.println(sumOfNumberList(List.of(1.3, 4.9, 3.2, 5.3, 6.3)));
		System.out.println(sumOfNumberList(List.of(1l, 4l, 5l, 2l, 90l)));
		
		String value1 = doSomething(new String());
		Integer number1 = doSomething(Integer.valueOf(5));
		ArrayList list1 = doSomething(new ArrayList());
		
		LinkedList<String> fruits = new LinkedList<>(List.of("Apple", "Banana", "Cucumber"));
		duplicate(fruits);
		System.out.println(fruits);
		
		ArrayList<Integer> primes = new ArrayList<>(List.of(23, 53, 54, 26));
		duplicate(primes);
		System.out.println(primes);
		
		// AIM --> to implement custom ArrayList 
		
		MyCustomList<String> list = new MyCustomList<>();
		
		list.addElement("Element1");
		list.addElement("Element 2");
		
		String data = list.get(1);
		System.out.println(data);
		System.out.println(list.toString());
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		
		list2.addElement(Integer.valueOf(35));
		list2.addElement(Integer.valueOf(84));
		
		Integer data2 = list2.get(1);
		System.out.println(data2);
		System.out.println(list2.toString());
	}
}
