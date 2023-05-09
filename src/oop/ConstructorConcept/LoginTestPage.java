package oop.ConstructorConcept;

public class LoginTestPage {

	public static void main(String[] args) {

		LoginPage lpref = new LoginPage("test@gmail.com", "password@123");
		lpref.doLogin();

	}

}
