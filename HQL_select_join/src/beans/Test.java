package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		OldStudent os1 = new OldStudent(111, "Radha", "Radha@gmail", 55);
		OldStudent os2 = new OldStudent(222, "Prem", "prem@gmail", 55);
		OldStudent os3 = new OldStudent(333, "akshay", "akshay@gmail", 55);
		s.save(os1);
		s.save(os2);
		s.save(os3);
		s.beginTransaction().commit();
		
	}
}
