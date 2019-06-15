package beans;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

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
		
		Student st = (Student) s.get(Student.class, 1);
		Student st1 = (Student) s.get(Student.class, 1);

		System.out.println(st.id + " " + st.name+  " " + st.email + " " + st.marks);
		System.out.println(st1.id + " " + st1.name+  " " + st1.email + " " + st1.marks);
		
		Session s2 = sf.openSession();
		
		Student st2 = (Student) s2.get(Student.class, 1);
		Student st3 = (Student) s2.get(Student.class, 1);

		System.out.println(st2.id + " " + st2.name+  " " + st2.email + " " + st3.marks);
		System.out.println(st3.id + " " + st3.name+  " " + st3.email + " " + st3.marks);

	}
}
