package beans;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class InsertTest {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		//Criteria is only for select operations
		Criteria c = s.createCriteria(NewStudent.class);  //it is like select * from NewStudent;
		//uniqueResult() and list()
		/*List<NewStudent> n = c.list();             
		for(NewStudent ns : n){
			System.out.println( ns.id + " " + ns.name + " " + ns.email + " " + ns.marks);
		}*/
		
		/*Criterion cr = Restrictions.eq("id", 111);
		c.add(cr);		
		NewStudent ns = (NewStudent) c.uniqueResult();
		System.out.println( ns.id + " " + ns.name + " " + ns.email + " " + ns.marks);*/
		
		/*Criterion cr = Restrictions.eq("id", 111);
		c.add(cr);
		Projection p = Projections.property("name");
		c.setProjection(p);
		String ns = (String) c.uniqueResult();
		System.out.println("Result: "  + ns);*/
		
		/*Criterion cr = Restrictions.eq("id", 111);
		c.add(cr);
		Projection p1 = Projections.property("id");
		Projection p2 = Projections.property("name");

		ProjectionList pl = Projections.projectionList();
		pl.add(p1);
		pl.add(p2);
		c.setProjection(pl);
		Object[] ns = (Object[]) c.uniqueResult();
		System.out.println("Result: "  + ns[0] + " " + ns[1]);*/
		
	
	
		Projection p3 = Projections.avg("marks");
		c.setProjection(p3);
		
		
		double ns = (Double) c.uniqueResult();
		System.out.println("Result: " + ns);

	}

}
