package com.rrk.oopsVisited.inheritance;

public class Student extends Person{	// IS - A relationship
	private String collegeName;
	private int year;
	
	public Student(String name, String collegeName) {
		super(name);
		System.out.println("Student Constructor");
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
