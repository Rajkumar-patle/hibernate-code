package com.mypack.hibernate;

import java.util.Scanner;

import com.mypack.hibernate.dao.StudentDao;
import com.mypack.hibernate.entity.Student;
import com.mypack.hibernate.utitlity.StudentUtility;

public class StudentController {

	static char ch;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			System.out.println("Press 1 for Save Student details...");
			System.out.println("Press 2 for Delete Student details...");
			System.out.println("Press 3 for Delete Student details...");
			System.out.println("Press 4 for Delete Student details...");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Student student = StudentUtility.prepareStudentDetails(scanner);
				StudentDao.saveStudentDetails(student);
				System.out.println("Student Save...");

				break;

			case 2:

				System.out.println("Student Deleted...");

				break;

			default:
				break;
			}

			System.out.println("Do you want to continue : y/n");
			ch = scanner.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println("Terminetted..");

	}

}
