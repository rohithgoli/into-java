import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> studentName = new ArrayList<>(); // --> gives an empty ArrayList
		
		studentName.add("Ramu"); // adding an element into ArrayList studentName
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4); // This will add 4 at end of the list
		System.out.println(list);
		
		list.add(1, 30); // This will add 30 at index 1
		System.out.println(list);
		
		List<Integer> newList = new ArrayList<>();
		newList.add(138);
		newList.add(28);
		
		list.addAll(newList);	// This will add newList to List
		System.out.println(list);
		
		System.out.println(list.get(1)); // This will get the element at index 1 in the list
		
		list.remove(1);	// This will remove the element at index provided from the ArrayList
		System.out.println(list);
		
		list.remove(Integer.valueOf(138)); // This will remove the Integer element of value 138 from the ArrayList
		System.out.println(list);
		
		System.out.println(list.contains(138));
		
		list.set(2, 20000); // This will set the value at given index
		System.out.println(list);
		
		System.out.println(list.contains(20000));
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		list.clear(); // This will remove all the values
		System.out.println(list);
	}
}
