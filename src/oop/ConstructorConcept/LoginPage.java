package oop.ConstructorConcept;

public class LoginPage {

	String username;
	String password;

	public LoginPage(String username, String password) {

		this.username = username;
		this.password = password;
	}

	public void doLogin() {

		System.out.println("For login Please enter the user name and password");
		System.out.println("Please enter the user name : " + username);
		System.out.println("Please enter the password : " + password);
		System.out.println("User logged in sucessfully");

	}

	public void forgotPassword() {
		System.out.println("I am forgot password method");
	}

}
