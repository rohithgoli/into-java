package tipsTricks;

public class StringUtilityRunner {
	
	public static void main(String[] args) {
		//	JDK 11
		
		System.out.println("".isBlank());
		System.out.println(" Name  ".strip().replace(" ", "$"));
		System.out.println(" Name ".stripLeading().replace(" ", "$"));
		System.out.println(" Name ".stripTrailing().replace(" ", "$"));
		
		"Hello\nHave a Good day ahead\nThank you\nWish you the same".lines().forEach(System.out::println);
		
		//	JDK 12
		
		System.out.println("Upper".transform(s -> s.substring(3)));
		
		//	JDK 13
		
		System.out.println("%s revolves around the %s in %d days".formatted("Earth", "Sun", 365));
		
		//	JDK 14 --> Helpful NullPointerExceptions i.e additional context is added
		
		String str = null;
		System.out.println(str.isBlank());
	}
	
}
