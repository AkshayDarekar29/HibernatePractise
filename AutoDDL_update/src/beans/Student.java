package beans;

import java.io.Serializable;

//public class Student implements Serializable{
public class Student{
	int id;
	String name;
	String email;
	int marks;
	int locker;
	String p;
	
	
	public String getP() {
		return p;
	}
	
	public void setP(String p) {
		this.p = p;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getLocker() {
		return locker;
	}
	public void setLocker(int locker) {
		this.locker = locker;
	}
	
}
