package com.rrk.intoJava;

public class WhileNumberPlayer {
	
	private int number;
	
	public WhileNumberPlayer(int number) {
		this.number = number;
	}
	
	public void printSquaresUptoLimit() {
		int counter = 1;
		while(counter*counter <= number) {
			System.out.print(counter*counter + " ");
			counter++;
		}
		System.out.println();
	}
	
	public void printCubesUptoLimit() {
		int counter = 1;
		while(counter*counter*counter <= number) {
			System.out.print(counter*counter*counter + " ");
			counter++;
		}
		System.out.println();
	}
	
}
