package beans;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test_Criteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria c = s.createCriteria(Student.class);
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("please enter start value: ");
		int start = sc.nextInt();
		System.out.println("please enter number rows to be retrieved: ");
		int max = sc.nextInt();
		c.setFirstResult(start);
		c.setMaxResults(max);
		
		List<Student> st = c.list();
		
		for(Student su : st){
			System.out.println(su.id + " "+ su.name + " "+ su.email +  " "+ su.marks);
		}
	}
}
