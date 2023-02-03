package com.mypack.hibernate.utitlity;

import java.util.Scanner;

import com.mypack.hibernate.entity.Student;

public class StudentUtility {
	

	public static Student prepareStudentDetails(Scanner scanner) {
		
		System.out.println("Enter Student Id");
		long studentId = scanner.nextLong();
		
		System.out.println("Enter Student Name");
		String studentName = scanner.next();
		
		System.out.println("Enter Student Salary");
		double studentSalary = scanner.nextDouble();
		
		System.out.println("Enter Student City");
		String studentCity = scanner.next();
		
		Student student = new Student(studentId, studentName, studentSalary, studentCity);
		
		return student;
		
		
	}

}
