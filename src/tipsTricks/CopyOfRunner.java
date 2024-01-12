package tipsTricks;

import java.util.ArrayList;
import java.util.List;

public class CopyOfRunner {
	
	public static void main(String[] args) {
		
		
		// Available on List, Set, Map Interface from Java 10
		// Whenever we require an immutable object from existing object --> copyOf
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Carrot");
		fruits.add("Lemon");
		
		List<String> copyOfFruits = List.copyOf(fruits);
		
		changeNotAllowed(copyOfFruits);
		System.out.println(copyOfFruits);
		
	}

	private static void changeNotAllowed(List<String> copyOfFruits) {
		// TODO Auto-generated method stub
		copyOfFruits.add("Not Permitted");
	}
	
}
