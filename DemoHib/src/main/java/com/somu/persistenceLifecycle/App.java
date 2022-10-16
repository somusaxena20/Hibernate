package com.somu.persistenceLifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		Laptop l = new Laptop(102,"Gyan ganga"); // TRANSIENT STATE
		
		ses.save(l); // PERSISTENT
		
//		ses.remove(l);
	
		
		ses.getTransaction().commit();
		
//		AFTER COMMIT THE OBJECT IS IN DETACHED STATE
		
		
		
	}

}
