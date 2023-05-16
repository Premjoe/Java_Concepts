package oop.Abstract_Class;

public class LoginPage extends Page {
	
	
//Java will create the hidden default constructor internally - Then it will go and check the any constructor in parent class and it get called
	// We can not create the Default constructor here in latest java version
	
	public LoginPage(int a) 
	{
		System.out.println("Hello This is my Login Page constructor "  + a);
	}
	
	
	@Override
	public void title() {
	System.out.println("Login page --- Title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page --- URl");
	}
	
	@Override
 public void defaultPageTimeOut() {
		
		System.out.println("The page time out = 5 sec");
		
	}
	
	public void doLogin() {
		System.out.println("Page child clss --- Do login ");
		
	}
	

	
	
	
	// Constructor 
	
	LoginPage(){
		
	}
	
	
	

}
