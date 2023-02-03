package com.mypack.hibernate.confiq;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mypack.hibernate.entity.Student;

public class HibernatConfig {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Student.class).configure();
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

}
