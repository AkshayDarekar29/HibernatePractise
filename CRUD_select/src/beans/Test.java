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
		/*student.setId(1);
		student.setName("bhau");
		student.setEmail("abc@gmail.com");
		student.setMarks(250);*/
		
		//Student st = (Student) s.get(Student.class, 2);  // returns object if pk is present otherwise returns null
		Student st = (Student) s.load(Student.class, 1);  // returns object if pk is present otherwise throws
		//org.hibernate.ObjectNotFoundException: No row with the given identifier exists
		System.out.println(st.getId()+  " " + st.getName()+ " "+st.getMarks() + " "+ st.getEmail());
		
	}
}
