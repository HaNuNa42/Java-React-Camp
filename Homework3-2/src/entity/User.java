package entity;

public class User {

	private int id;
	private String fistName;
	private String lastName;
	private String course;

	

	public User(int id, String fistName, String lastName, String course) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.course = course;
	}

	public User() {

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
