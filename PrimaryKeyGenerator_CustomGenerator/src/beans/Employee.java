package beans;

public class Employee {
	String accNumber; 
	String name;
	String address;
	int balance;
	
	
	public Employee(String accNumber, String name, String address, int balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
