package beans;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class StudentRegServlet
 */
//@WebServlet(name = "StudentRegServlet", urlPatterns = { "/" })
public class StudentRegServlet extends HttpServlet {
	
	SessionFactory sf ;
	@Override
	public void init() throws ServletException {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int marks = Integer.parseInt(request.getParameter("marks"));
		Student st = new Student(0, name, email, marks);
		
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		int pk = (Integer)s.save(st);
		t.commit();
	
		response.getWriter().println("Regestration Successful. ID is "+ pk);
		
	}


}
