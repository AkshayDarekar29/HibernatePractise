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
		
		Actor a = new Actor(1, "Akshay Darekar");
		Movies m1 = new Movies(1, "LifeStory", a);
		Movies m2 = new Movies(2, "LifeStory2", a);
		//s.save(a);	
		s.save(m1);		
		s.save(m2);		
		t.commit();
	}
}