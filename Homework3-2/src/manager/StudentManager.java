package manager;
import entity.Student;

public class StudentManager {
	
	public void addAddress() {
		System.out.println("adres eklendi");
	}
	
	public void completionRate(Student student) {
		System.out.println("Tamamlanma oraný : " + student.getCompletionRate());
	}

}
