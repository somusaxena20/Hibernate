package com.somu.relationMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.somu.DemoHib.Alien;
public class App {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class);

		SessionFactory sf = con.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tx = ss.beginTransaction();

//		Laptop l1 = new Laptop(101, "HP");
//		Laptop l2 = new Laptop(102, "DELL");
		
		
//		Student s1 = new Student(11101, "SOMU SAXENA", 80.40, l1);

//		Student s1 = new Student();
//		s1.setsId(11101);
//		s1.setsName("SOMU SAXENA");
//		s1.setsMarks(88);
//		s1.getLaptop().add(l1);
//		s1.getLaptop().add(l2);		
//		
//		l1.getStudent().add(s1);
		
//		l1.getStudent().add(s1);
		
//		ss.save(s1); // saving student table
//		ss.save(l1); // saving laptop table
//		ss.save(l2);
		
//		FETCHING RECORDS FROM DATABASE
		
		Student s1 = ss.get(Student.class, 11101);
		
		System.out.println(s1.getsName());
		
		System.out.println(s1.getLaptop());
		
		tx.commit();

		ss.close();

	}

}
