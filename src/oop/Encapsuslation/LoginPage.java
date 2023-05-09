package oop.Encapsuslation;

public class LoginPage {

	private String username;
	private String password;

	// Inside the setter and getter should avoid to writing the business logic
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void doLogin() {
		System.out.println("Login with: " + username + " " + password);
	}

}
