package com.mypack.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long studentId;
	private String studentName;
	private double studentSalary;
	private String studentCity;
	
	
	public Student() {
		
	}


	public Student(long studentId, String studentName, double studentSalary, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSalary = studentSalary;
		this.studentCity = studentCity;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSalary=" + studentSalary
				+ ", studentCity=" + studentCity + "]";
	}
	
	

}
