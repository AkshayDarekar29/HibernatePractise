package beans;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertTest {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		String hql = "insert into NewStudent(id, name, email, marks) select s.id, s.name, s.email, s.marks from OldStudent s";
		Query q = s.createQuery(hql);
		int n = q.executeUpdate();
		t.commit();
		System.out.println("number rows are affected :" + n);
	}

}
