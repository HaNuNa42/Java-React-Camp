package entity;
public class Student extends User {

	private String completionRate;
	private String address;
	
	public Student() {
		super();
	}
	
	public Student(int id, String fistName, String lastName, String course, String address, String completionRate) {
		super(id, fistName, lastName, course);
		this.address = address;
		this.completionRate = completionRate;
	}
	
	public String getCompletionRate() {
		return completionRate;
	}
	public void setCompletionRate(String completionRate) {
		this.completionRate = completionRate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	


}
