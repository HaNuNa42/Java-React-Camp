import entity.Instructor;
import entity.Student;
import entity.User;
import manager.InstructorManager;
import manager.StudentManager;
import manager.UserManager;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("********************* Öðrenci Bilgileri / Ýþlemleri **********************");
	
		Student student = new Student();
		student.setId(1);
		student.setFistName("hatice nur");
		student.setLastName("nalbant");
		student.setCourse("Java-React Kursu");
		student.setCompletionRate("%50 tamamlandý");
		student.setAddress("Konya / Türkiye");
				
		StudentManager studentManager = new StudentManager();
		studentManager.completionRate(student);
		studentManager.addAddress();
		
		System.out.println(" ");
		System.out.println("********************* Eðitmen Bilgileri / Ýþlemleri **********************");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFistName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setCourse("Java-React Kursu");
		instructor.setPhoneNumber("+905550001122");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addPhoneNumber(instructor);
		
		System.out.println(" ");
		System.out.println("********************* User Bilgileri / Ýþlemleri **********************");
		
		User user = new User();
		user.setId(2);
		user.setFistName("admin");
		user.setLastName("admin");
		user.setCourse("C# - Angular Kursu");
		
		UserManager userManager = new UserManager();
		userManager.addCourse(user);
	}
	

}
