package com.rrk.intoJava;

public class MyNumber {
	
	private int number;
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		for(int num = 2; num < number; num++) {
			if(number % num == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int sumUptoN() {
		int desiredSum = 0;
		for(int num = 0; num <= number; num++) {
			desiredSum += num;
		}
		return desiredSum;
	}
	
	public int sumOfDivisors() {
		int desiredSum = 0;
		for(int num = 2; num < number; num++) {
			if(number % num == 0) {
				desiredSum += num;
			}
		}
		return desiredSum;
	}
	
	public void printANumberTriangle() {
		for(int rowIndex=1; rowIndex <= number; rowIndex++) {
			for(int colIndex=1; colIndex <= rowIndex; colIndex++) {
				System.out.print(colIndex+" ");
			}
			System.out.println();
		}
	}
}
