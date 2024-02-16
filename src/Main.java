public class Main {

	public static void main(String[] args) {  //inheritance ve polymorphism kullanımı için örneğim
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		User user = new User(1, "1234", "Engin", "Demiroğ", "engindemirog@gmail.com"); 
		userManager.logIn(user);
		userManager.logOut(user);
		instructorManager.logIn(user);//UserManager metodu olduğu için ortaktır bu metod hepsi kullanabilir.
		//userManager.givenLessons.add("python-selenium"); bu olmaz çünkü bu metodu instructor kullanabilir.
		//instructorManager.giveLesson(user); bu olmaz çünkü user değil instructor kullanabilir bu metodu.
		//instructorManager.attendLesson(user); bu da olmaz çünkü bu metodu student kullanabilir.
		instructorManager.logOut(user);
		System.out.println("********************************************************************");
		
		Instructor instructor = new Instructor(2, "2222", "Halit Enes", "Kalaycı", "hkalayci@gmail.com");
		instructor.givenLessons.add("python-selenium");
		userManager.logIn(instructor);
		userManager.logOut(instructor);
		instructorManager.logIn(instructor);
		instructorManager.giveLesson(instructor);
		instructorManager.logOut(instructor);
		System.out.println("********************************************************************");	
				
		Student student = new Student(3, "11111", "Yücelen", "Üstün", "yucelenn@hotmail.com");
		student.takenCourses.add("java-spring");
		student.takenCourses.add("java-react");
		userManager.logIn(student);
		userManager.logOut(student);
		studentManager.attendLesson(student);
		studentManager.logIn(student);
		studentManager.logOut(student);
		System.out.println("********************************************************************");
		
	}

}
