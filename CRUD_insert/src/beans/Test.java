package beans;

import java.io.Serializable;

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
		
		Student student = new Student();
		student.setId(1);
		student.setName("bhau");
		student.setEmail("abc@gmail.com");
		student.setMarks(250);
		
		/*Serializable pk = s.save(student); //save returns primary key
		System.out.println(pk);*/
		
		//s.persist(student);  // does not return anything
		
		s.saveOrUpdate(student); 
		// will not return anything 
		// will execute select statement for given pk
		//if that pk is not present it will insert into table
		//if pk is present then it will update table and if all values are same then i will do nothing,
		//but it will not constraint value exception like save and persist method
		//if pk is present then it will insert default values(null or 0) into table fields which are not present in object
		t.commit();
	}
}
