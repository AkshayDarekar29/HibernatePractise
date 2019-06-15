package beans;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/configuration.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		
		Movies m1 =new Movies(1, "Lagan");
		Movies m2 =new Movies(2, "PK");
		
		Set<Movies> movies = new HashSet<>();
		movies.add(m1);
		movies.add(m2);
		Actor a = new Actor(1, "Amir Khan", movies);
		//s.save(m1);	
		//s.save(m2);	
		s.save(a);		
		t.commit();
	}
}
