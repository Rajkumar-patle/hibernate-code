package com.mypack.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypack.hibernate.confiq.HibernatConfig;
import com.mypack.hibernate.entity.Student;

public class StudentDao {

	public static void saveStudentDetails(Student student) {

		SessionFactory sessionFactory = HibernatConfig.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();

	}

}
