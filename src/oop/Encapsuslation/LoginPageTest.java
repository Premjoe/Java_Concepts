package oop.Encapsuslation;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage e1 = new LoginPage();
		e1.setUsername("admin@gmai.com");
		e1.setPassword("Admin123");

		e1.doLogin();

		LoginPage e2 = new LoginPage();
		e2.setUsername("support@gmai.com");
		e2.setPassword("support123");

		e2.doLogin();

	}

}
