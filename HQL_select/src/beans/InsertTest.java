package beans;

import java.util.List;

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
		/*String hql = "select name from NewStudent where id=333";
		Query q = s.createQuery(hql);
		String name = (String)q.uniqueResult();
		t.commit();
		System.out.println("Result: " + name);*/
		
		/*String hql = "from NewStudent where id=333";
		Query q = s.createQuery(hql);
		NewStudent e = (NewStudent)q.uniqueResult();
		t.commit();
		System.out.println("Result: " + e.id +  " "+ e.name +  " "+ e.marks );*/
		
		/*String hql = "select id, name from NewStudent where id=333";
		Query q = s.createQuery(hql);
		Object[] e = (Object[]) q.uniqueResult();
		t.commit();
		System.out.println("Result: " + e[0] +  " "+ e[1]  );*/
		
		/*String hql = "from NewStudent";
		Query q = s.createQuery(hql);
		List<NewStudent> em = q.list();
		t.commit();
		
		for (NewStudent e : em){
			System.out.println("Result: " + e.id +  " "+ e.name +  " "+ e.marks );

		}*/
		
		String hql = "select id, name from NewStudent";
		Query q = s.createQuery(hql);
		List<Object[]> em = q.list();
		t.commit();
		
		for (Object	[] e : em){
			System.out.println("Result: " + e[0] + " " + e[1]);

		}

		
	}

}