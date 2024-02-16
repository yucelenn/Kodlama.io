import java.util.ArrayList;
import java.util.List;

public class Student extends User {

	List<String> takenCourses = new ArrayList<>();
	
	public Student(int id, String password, String name, String lastName, String email) {
		super(id, password, name, lastName, email);
	}

}