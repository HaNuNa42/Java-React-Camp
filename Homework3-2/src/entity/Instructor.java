package entity;
public class Instructor extends User {
	
	private String phoneNumber;

	public Instructor(int id, String fistName, String lastName, String course, String phoneNumber) {
		super(id, fistName, lastName, course);
		this.phoneNumber = this.phoneNumber;
	}

	public Instructor() {
		super();
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
