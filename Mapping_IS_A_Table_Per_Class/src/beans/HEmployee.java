package beans;

public class HEmployee extends Employee {
	int wh;
	
	public HEmployee(int id, String name, int salary, int wh) {
		super(id, name, salary);
		this.wh = wh;
	}
	
	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh; 
	}

}
