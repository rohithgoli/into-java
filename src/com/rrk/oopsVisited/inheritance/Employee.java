package com.rrk.oopsVisited.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	
	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		// super(); --> implicit call happens to super class constructor
		super(name);
		System.out.println("Employee Constructor");
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	public String getEmployer() {
		return this.employer;
	}
	
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	
	public char getEmployeeGrade() {
		return this.employeeGrade;
	}
	
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(String salary) {
		this.salary = new BigDecimal(salary);
	}
	
	public String toString() {
		return String.format("Basic details - %s, title - %s, employer - %s, employeeGrade - %c, salary - %f",
				super.toString(), title, employer, employeeGrade, salary);
	}
}
