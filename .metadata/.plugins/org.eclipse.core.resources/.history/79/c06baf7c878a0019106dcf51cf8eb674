package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentityGenerator;

public class CustomPKGenerator extends IdentityGenerator {
	@Override
	public Serializable generate(SessionImplementor s, Object obj) {
		String name ="ICICI";
		
		try {
			Connection con = s.connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select custom_sequence.nextVal from dual");
			
			if(rs.next()){
				name = name + rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
}
