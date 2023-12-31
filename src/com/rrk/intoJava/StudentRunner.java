package com.rrk.intoJava;

import java.math.*;

public class StudentRunner {
	public static void main(String[] args) {
		Student student = new Student("Ram", 92, 80, 80, 100, 92, 97 );
		
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		
		System.out.printf("number of marks: %d", number).println();
		System.out.printf("sum of marks: %d", sum).println();
		System.out.printf("maximum marks: %d", maximumMark).println();
		System.out.printf("minimum marks: %d", minimumMark).println();
		System.out.printf("marks average: %f", average).println();
		
		System.out.println(student.toString());
		
		student.addNewMarks(73);
		System.out.println(student.toString());
		
		student.removeMarkAtIndex(2);
		System.out.println(student.toString());
	}
}
