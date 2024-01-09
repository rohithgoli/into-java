package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads - 3 are inserting values
		list.add("Apple");
		list.add("Banana");
		list.add("Carrot");
		
		//Threads - 10K
		for(String element: list) {
			System.out.println(element);
		}
		
		// Here CopyOnWriteArrayList performs synchronization only on Add operations but not on Get operations
		// so that performance is good
	}
}
