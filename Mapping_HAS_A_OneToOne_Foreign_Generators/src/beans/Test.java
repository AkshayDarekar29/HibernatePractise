package beans;

import java.util.Date;
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
		
		Voter v = new Voter(55, "Akshay", 25);
		Vote vote = new Vote(0, "BJP", new Date(), v);
		
		s.save(v);
		s.save(vote);
		t.commit();
	}
}