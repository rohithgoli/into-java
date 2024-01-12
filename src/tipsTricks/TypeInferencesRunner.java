package tipsTricks;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		
		List<String> names1 = List.of("Ramu", "Somu");
		List<String> names2 = List.of("Bholu", "Dolu");
		
		List<List<String>> names = List.of(names1, names2);
		
		//	Java 10
		
		var namesWithTypeInference = List.of(names1, names2);
		
		namesWithTypeInference.stream().forEach(System.out::println);
		
		/* 
		 * Java compiler infers the type of variable at compile time
		 * can be used in for loop
		 * cannot assign null
		 * var is not a keyword
		 * Type Inference NOT applicable for member variables
		 * 
		 * */
	}
	
}
