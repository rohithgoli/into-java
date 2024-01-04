package com.rrk.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class AscendingStudentComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}



public class StudentsCollectionRunner {
	public static void main(String[] args) {
		
		List<Student> studentsList = List.of(
				new Student(101, "Ramu"),
				new Student(104, "Somu"),
				new Student(102, "Dolu"),
				new Student(103, "Bholu")
				);
		
		List<Student> studentsArrayList = new ArrayList<>(studentsList);
		
		System.out.println(studentsList);
		
		Collections.sort(studentsArrayList); // sort should be used with ONLY which implements comparable Interface
		System.out.println(studentsArrayList);
		
		Collections.sort(studentsArrayList, new AscendingStudentComparator());
		System.out.println(studentsArrayList);
		
		studentsArrayList.sort(new AscendingStudentComparator());
		System.out.println(studentsArrayList);
	}
}
