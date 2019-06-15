package beans;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		System.out.println("1st call");
		Query q = s.createQuery("from Student where id=1");
		q.setCacheable(true);
		Student st = (Student) q.uniqueResult();
		
		System.out.println(st.id + " "+ st.name);
		
		System.out.println("2nd call");
		Query q1 = s.createQuery("from Student where id=1");
		q1.setCacheable(true);
		Student st1 = (Student) q1.uniqueResult();
		
		System.out.println(st1.id + " "+ st1.name);
				
	}
}
