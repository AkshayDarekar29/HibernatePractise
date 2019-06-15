package beans;

import java.util.Set;

public class Course {
	int cId;
	String cName;
	int fee;
	Set<Faculty> faculty;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	
}
