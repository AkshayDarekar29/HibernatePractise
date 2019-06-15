package beans;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

/**
 * Servlet implementation class EmployeeRegServlet
 */
@WebServlet(name = "EmployeeRegServlet", urlPatterns = { "/" })
public class EmployeeRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory sf ;

	public void init(ServletConfig config) throws ServletException {
		Configuration cfg = new Configuration();
		cfg.configure("resources/configuration.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		int balance = Integer.parseInt(request.getParameter("balance"));
		Employee e = new Employee(null, name, address, balance);
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		String pk = (String)s.save(e);
		t.commit();
	
		response.getWriter().println("Regestration Successful. ID is "+ pk);
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}