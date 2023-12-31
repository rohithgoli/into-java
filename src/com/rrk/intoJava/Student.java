package com.rrk.intoJava;

import java.math.*;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
	
	public Student(String name, int ... listOfMarks) {
		this.name = name;
		for(int marks: listOfMarks) {
			this.listOfMarks.add(marks);
		}
	}
	
	public int getNumberOfMarks() {
		return listOfMarks.size();
	}
	
	public int getTotalSumOfMarks() {
		int marksSum = 0;
		for(int marks: listOfMarks) {
			marksSum += marks;
		}
		return marksSum;
	}
	
	public int getMaximumMark() {
		return Collections.max(listOfMarks);
	}
	
	public int getMinimumMark() {
		return Collections.min(listOfMarks);
	}
	
	public BigDecimal getAverageMarks() {
		int totalSum = this.getTotalSumOfMarks();
		int numberOfMarks = this.getNumberOfMarks();
		
		BigDecimal sum = new BigDecimal(Integer.toString(totalSum));
		BigDecimal count = new BigDecimal(Integer.toString(numberOfMarks));
		System.out.println(sum);
		System.out.println(count);
		System.out.println(sum.divide(count, 3, RoundingMode.UP));
		return sum.divide(count, 3, RoundingMode.UP); // specifying Precision, RoundingMode
	}
	
	public String toString() {
		return name + listOfMarks;
	}
	
	public void addNewMarks(int marks) {
		listOfMarks.add(marks);
	}

	public void removeMarkAtIndex(int index) {
		listOfMarks.remove(index);
	}
}
