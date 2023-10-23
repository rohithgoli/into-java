import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String args[]) {
		Set<Integer> set = new HashSet<>();	// HashSet --> O(1)
		
		set.add(23);
		set.add(86);
		set.add(25);
		set.add(72);
		set.add(92);
		
		System.out.println(set);
		
		set.remove(72);
		
		System.out.println(set);
		
		System.out.println(set.contains(25));
		System.out.println(set.contains(0));

		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		
		Set<Integer> set2 = new LinkedHashSet<>();	// LinkedHashSet
		
		set2.add(24);
		set2.add(86);
		set2.add(873);
		set2.add(56);
		set2.add(34);
		
		System.out.println(set2);
		
		set2.remove(873);
		
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println(set2.isEmpty());
		System.out.println(set2.contains(34));
		
		Set<Integer> set3 = new TreeSet<>();	// TreeSet --> O(logn)
		
		set3.add(23);
		set3.add(83);
		set3.add(62);
		set3.add(89);
		set3.add(3);
		
		System.out.println(set3);
		
		Set<Subject> subjectSet = new HashSet<>();
		
		subjectSet.add(new Subject("Telugu", 01));
		subjectSet.add(new Subject("Hindi", 02));
		subjectSet.add(new Subject("English", 03));
		subjectSet.add(new Subject("Maths", 04));
		subjectSet.add(new Subject("Science", 05));
		subjectSet.add(new Subject("Telugu", 01));
		
		System.out.println(subjectSet);
	}
}
