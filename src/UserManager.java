
public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getName() + user.getLastName() + " kaydoldu.");
	}

	public void logIn(User user) {
		System.out.println(user.getName() + user.getLastName() + " giriş yaptı.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getName() + user.getLastName() + " çıkış yaptı.");
	}
}
