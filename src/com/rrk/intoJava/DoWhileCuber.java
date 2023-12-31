package com.rrk.intoJava;

import java.util.Scanner;

public class DoWhileCuber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.println("Enter a number: ");
			number = scanner.nextInt();
			if(number >= 0) {
				System.out.println("Cube is "+ number*number*number);
			}
		} while(number >= 0);
		
		System.out.println("Thank You! Have Fun!");
	}
}
