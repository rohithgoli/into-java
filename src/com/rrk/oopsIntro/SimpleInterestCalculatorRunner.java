package com.rrk.oopsIntro;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("80", "5");
		BigDecimal totalValue = calculator.calculateTotalValue(2);
		System.out.println(totalValue);
	}
	
}
