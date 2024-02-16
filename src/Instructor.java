import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	
	List<String> givenLessons = new ArrayList<>();

	public Instructor(int id, String password, String name, String lastName, String email) {
		super(id, password, name, lastName, email);
	}

	
}
