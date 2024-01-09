package tipsTricks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return Integer.compare(str1.length(), str2.length());
	}
	
}


public class AnonymousClassRunner {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>(
				List.of("Apple", "Beet root", "Cucumber", "Drum Stick", "Egg"));
		Collections.sort(fruits, new LengthComparator());
		System.out.println(fruits);
		
		Comparator<String> lengthComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str2.length(), str1.length());
			}
			
		};
		Collections.sort(fruits, lengthComparator);
		
		System.out.println(fruits);
	}

}
