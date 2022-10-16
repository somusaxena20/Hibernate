package com.somu.hql;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



@SuppressWarnings("deprecation")
public class App {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory sf = con.buildSessionFactory();

		Session ses = sf.openSession();

		ses.beginTransaction();

//		INSERTING INTO DATABASE

//		for(int i = 1; i<=50; i++)
//		{
//			Emp e = new Emp(i, new Random().nextInt(10));
//			ses.save(e);
//		}

//		FETCHING FROM DATABASE

//		Query<Emp> q = ses.createQuery("from Emp");
//
//		List<Emp> emps = q.list();
//
//		for (Emp e : emps) {
//			System.out.println(e);
//		}

		
//		USING ORDER BY CLAUSE
		
//		Query<Emp> q = ses.createQuery("from Emp order by id desc");
		
//		USING GROUP BY CLAUSE
		
//		Query<Emp> q = ses.createQuery("from Emp group by deptNo");
		
//		USING QUERY TO FETCH SPECIFIC COLUMN
		
//		Query q = ses.createQuery("select id,deptNo from Emp");
//
//		List<Object[]> emps = (List<Object[]>)q.list();
//
//		for (Object[] e : emps) {
//			System.out.println(Arrays.toString(e)); 
//		}
		
//		USING HQL AS PREPARED STATEMENT / WILDCARD
		
		
//		Query q = ses.createQuery("from Emp e where e.deptNo =:d");
//		q.setParameter("d", 10);
//		List<Emp> l = q.list();
//		
//		for(Emp e : l)
//		{
//			System.out.println(e);
//		}
		
//		USING NATIVE QUERY IN HQL
		
//		WHEN YOU FETCHING FULL OBJECT
		
//		SQLQuery<Emp> emp = ses.createSQLQuery("select * from emp");
//		emp.addEntity(Emp.class);
//		List<Emp> e = emp.list();
//		
//		for(Emp x : e)
//		{
//			System.out.println(x);
//		}
		
//		WHEN YOU FETCH SOME SPECIFIC COLUMN
		
		
		SQLQuery<Emp> emp = ses.createSQLQuery("select e.id from emp e where e.deptNo < 5");
		
		emp.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		List emps = emp.list();
		
		for(Object em : emps)
		{
			Map m = (Map)em;
			System.out.println(m.get("id"));
		}
		
		
		ses.getTransaction().commit();
	}

}
