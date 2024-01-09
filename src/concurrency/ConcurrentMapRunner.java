package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	
	public static void main(String[] args) {
		// Find Occurances of Characters in String of Text
		Map<Character, LongAdder> occurances = new Hashtable<>();  
		
		// LongAdder provides atomic Increment operation
		
		String str = "Thomas Alva Edison";  
		for(char character: str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
		}
		System.out.println(occurances);
		
		
		ConcurrentMap<Character, LongAdder> occurancesWithConcurrent = new ConcurrentHashMap<>();
		
		String str2 = "Thomas Alva Edison";
		
		for(char character: str.toCharArray()) {
			occurancesWithConcurrent.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		
		System.out.println(occurancesWithConcurrent);
	}
	
}
