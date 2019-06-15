package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		/*Student student = new Student();
		student.setId(2);
		student.setName("abc");
		student.setEmail("abc@gmail.com");
		student.setMarks(500);*/

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sf.close();
		/*Session s = sf.openSession();
		s.save(student);
		s.beginTransaction().commit();
		s.evict(student);*/
	}
}
