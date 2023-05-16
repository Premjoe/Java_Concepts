package oop.Abstract_Class;



public abstract class Page {
	

	// we can create the constructor for the abstract class
  // Java will not create the hidden constructor in Parent class
	// if we need to implement the constructor in Parent class - first we need to create default constructor and 
	//then create the another constructor to pass the value 
	Page (){
		this(2);
		System.out.println("This is parent class page - default costructor");
	}
	Page (int k){
		System.out.println("This is parent class page - default costructor");
	}
	// can not create the object for Abstract class
	// The constructor will be called when we create the object of the child class
	
	public abstract void title();
	public abstract void url();
	
	public void defaultPageTimeOut() {
		
		System.out.println("The page time out = 20 sec");
		
	}
	
	public static void displayFooters() {
		
		System.out.println("Page ---- dsiaplyFooters");
		
	}
	
	
	public final void logo() {
		System.out.println("Page --- logo");
	}
	
	

}
