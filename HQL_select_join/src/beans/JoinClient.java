package beans;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoinClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "select n.id, n.name, o.id, o.name from NewStudent n, OldStudent o where n.id = o.id";

		Query q = s.createQuery(hql);
		List<Object[]> em = q.list();
		t.commit();
		
		for (Object	[] e : em){
			System.out.println("Result: " + e[0] + " " + e[1] +" "+ e[2] + " " + e[3]);

		}

		
	}

}
