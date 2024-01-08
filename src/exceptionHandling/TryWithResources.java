package exceptionHandling;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {;
		
			int[] numbers = {1, 4, 5, 2, 6};
			int number = numbers[23];
			// No need to call Scanner.close as it will be taken care by default as Scanner implements Interface AutoClosable
			// Thus anything resource which implements Interface AutoClosable, we can use try with resources format
			
		}
	}
}
