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
		
		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty();
		Faculty f3 = new Faculty();
		f1.setfId(1);
		f1.setfName("durga");
		f1.setExp(50);
		
		f2.setfId(2);
		f2.setfName("babu");
		f2.setExp(30);
		
		f3.setfId(3);
		f3.setfName("narayan");
		f3.setExp(35);
		
		Set<Faculty> f1Set = new HashSet<>();
		f1Set.add(f1);
		f1Set.add(f2);
		Set<Faculty> f2Set = new HashSet<>();
		f2Set.add(f3);
		f2Set.add(f2);
		Course c1 = new Course();
		Course c2 = new Course();
		
		c1.setcId(11);
		c1.setcName("Java");
		c1.setFee(5000);
		c1.setFaculty(f1Set);
		
		c2.setcId(12);
		c2.setcName("Spring");
		c2.setFee(10000);
		c2.setFaculty(f2Set);
		
		
		
		s.save(f1);		
		s.save(f2);	
		s.save(f3);	
		s.save(c1);	
		s.save(c2);		
		t.commit();
	}
}
