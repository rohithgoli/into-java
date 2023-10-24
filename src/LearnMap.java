
import java.util.Map;
import java.util.HashMap;

public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		
		numbers.putIfAbsent("Two", 23);
		if(! numbers.containsKey("Two")) {
			numbers.put("Two", 243);
		}
		
		System.out.println(numbers); // {One=1, Four=4, Two=2, Three=3}
		System.out.println(numbers.containsValue(2));
		System.out.println(numbers.isEmpty());
		
		numbers.remove("Two");
		
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		for(String key : numbers.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value: numbers.values()) {
			System.out.println(value);
		}
	}
}
