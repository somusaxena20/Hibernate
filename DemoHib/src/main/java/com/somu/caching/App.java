package com.somu.caching;

import com.somu.relationMapping.Laptop;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		
		Student s1 = null;
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory sf = con.buildSessionFactory();

//		Session ss1 = sf.openSession();
//
//		ss1.beginTransaction();

//		Student s1 = new Student(11101,"SOMU SAXENA","PUNE");
//		Student s2 = new Student(11102,"AMUL SHARMA","MUMBAI");
//		Student s3 = new Student(11103,"SHASHANK SHARMA","NAVI MUMBAI");
//		
//		ss1.save(s1);
//		ss1.save(s2);
//		ss1.save(s3);

//		FIRST LEVEL CACHE : CALLING SELECT QUERY ONLY ONCE
//
//		 s1 = ss1.get(Student.class, 11101);
//
//		System.out.println(s1);
////		
//
//		ss1.getTransaction().commit();
//		ss1.close();
//
////		DIFFRENT SESSION START FROM HERE
//		
//		Session ss2 = sf.openSession();
//
//		ss2.beginTransaction();
//		
//		s1 = ss2.get(Student.class, 11101);
//
//		System.out.println(s1);
//		
//		ss2.getTransaction().commit();
//		
		
//		ss2.close();
		

		
//		USING 2nd LEVEL CACHE BY QUERY
		
		Session ses1 = sf.openSession();
		ses1.beginTransaction();
		
		Query<Student> q = ses1.createQuery("from emp_student_table where sId = 11101");
		q.setCacheable(true);
		s1 = q.uniqueResult();
		System.out.println(s1);
		ses1.getTransaction().commit();
		
		ses1.close();
		
		Session ses2 = sf.openSession();
		ses2.beginTransaction();
		
		Query<Student> q2 = ses2.createQuery("from emp_student_table where sId = 11101");
		q2.setCacheable(true);
		s1 = q2.uniqueResult();
		System.out.println(s1);
		
		ses2.getTransaction().commit();
		
		ses2.close();
	}

}
