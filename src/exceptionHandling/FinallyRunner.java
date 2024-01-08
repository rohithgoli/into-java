package exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			int[] numbers = {1, 3, 4, 6, 7};
			
			int number = numbers[5];
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if(scanner != null) {
				scanner.close();
			}
		}
		
	}
}
