package beans;

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
		
		SEmployee se = new SEmployee(1, "Ram", 15000, "Java");
		HEmployee he = new HEmployee(2, "Shyaam", 20000, 9);
		Admin a = new Admin(3, "Bhau", 5000, "abc");
		
		s.save(se);
		s.save(he);
		s.save(a);
		
		t.commit();
	}
}
