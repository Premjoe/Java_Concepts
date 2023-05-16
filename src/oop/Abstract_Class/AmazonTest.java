package oop.Abstract_Class;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		// Page
		lp.defaultPageTimeOut();
		lp.logo();
		Page.displayFooters();
		
		System.out.println("------");
		
		// Login
		lp.title();
		lp.url();
		lp.doLogin();
		
		
		System.out.println("----");
		
		// Top casting : From Login_Child class we can't access the individual method
		
		Page tp= new LoginPage();
		tp.defaultPageTimeOut();
		tp.logo();
		
		tp.title();
		tp.url();
		Page.displayFooters();
		
		// Down casting is NA
		
		
		
		

	}

}
