package com.rrk.oopsVisited.inheritance;

public class StudentRunner {
	public static void main(String[] args) {
		
		Student student1 = new Student("Ramu", "ACE");
		student1.setEmail("ramu098@gmail.com");
		
		Person person = new Person("Raju");
		person.setEmail("raju098@gmail.com");
		//		person.equals, hashCode wait
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		
		Employee employee1 = new Employee("Mohan", "Support Executive");
		employee1.setPhoneNumber("+1-839-234-8989");
		employee1.setEmail("mohan.mailme@gmail.com");
		employee1.setEmployer("NASA");
		employee1.setEmployeeGrade('C');
		employee1.setSalary("20000");
		
		System.out.println(employee1.toString());
	}
}
