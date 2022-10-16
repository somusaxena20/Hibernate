package com.somu.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf = con.buildSessionFactory();
        
        
        
        Session session = sf.openSession();
        
        
        Transaction tx = session.beginTransaction();
        
        
        Alien a = new Alien();
        
        College c = new College();
        
        c.setName("Global Engineering");
        c.setCity("Jabalpur");
        c.setTier("Tier 3");
        
        
        a.setAid(11101);
        a.setaName("SOMU SAXENA");
        a.setaColor("BLUE");
        a.setClg(c);
        
        session.save(a);
        
//        FETCHING DATA FROM DATABASE
        
//        int i = 11101;
//        while(true)
//        {
//        	
//        	Alien a = session.get(Alien.class,i++);
//        	
//        	if(a == null)break;
//        	
//        	System.out.println(a);
//        }
        
        
        tx.commit();
        
        session.close();
    }
}
