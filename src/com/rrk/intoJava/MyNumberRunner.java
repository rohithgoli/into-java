package com.rrk.intoJava;

public class MyNumberRunner {
	
	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		
		System.out.println(number.isPrime());
		System.out.println(number.sumUptoN());
		System.out.println(number.sumOfDivisors());
		number.printANumberTriangle();
	}
}
