package beans;

public class Admin extends Employee {
	String branchName;
	
	public Admin(int id, String name, int salary, String branchName) {
		super(id, name, salary);
		this.branchName = branchName;
	}
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
