import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionsClass {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(24);
		list.add(82);
		list.add(42);
		list.add(63);
		list.add(48);
		list.add(19);
		
		System.out.println("min element: " + Collections.min(list));
		System.out.println("max element: " + Collections.max(list));
		System.out.println("element frequency: " + Collections.frequency(list, 33));
		System.out.println("element frequency: " + Collections.frequency(list, 24));
		
		Collections.sort(list); // ascending order
		System.out.println(list);
		
		// For sorting in descending order, we have to pass Comparator as second argument
		Collections.sort(list, Comparator.reverseOrder( ));
		System.out.println(list);
		
		List<Subject> subjectList = new ArrayList<>();
		
		subjectList.add(new Subject("Telugu", 1));
		subjectList.add(new Subject("Social", 6));
		subjectList.add(new Subject("English", 3));
		subjectList.add(new Subject("Maths", 4));
		subjectList.add(new Subject("Science", 5));
		
		Subject s1 = new Subject("Zoology", 38);
		Subject s2 = new Subject("Public Administration", 20);
		
		System.out.println(s1.compareTo(s2)); // 18
		
		System.out.println(subjectList);
		
		Collections.sort(subjectList);
		
		System.out.println(subjectList);
		
		Collections.sort(subjectList, new Comparator<Subject>() {
			@Override
			public int compare(Subject o1, Subject o2) {
				return o1.name.compareTo(o2.name);
			}
		});
	}
}
