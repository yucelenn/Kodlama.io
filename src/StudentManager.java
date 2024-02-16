
public class StudentManager extends UserManager {
	
	public void attendLesson(Student student ) {
		System.out.println(student.getName() + student.getLastName() + " derse katılıyor.");
	}

}
