package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		Configuration cfg = configuration.configure("hibernate.cfg.xml");
		SessionFactory SessionFactory = cfg.buildSessionFactory();
		 Session Session = SessionFactory.openSession();
		 Transaction beginTransaction = Session.beginTransaction();
		 Student student = new Student();
		 student.setFirstName("shweta");
		 student.setId(1);
		 student.setLastName("shinde");
		 Session.save(student);
		 
		 beginTransaction.commit();
		 Session.close();
		 System.out.println("done sussceefully");
		
	}

}
