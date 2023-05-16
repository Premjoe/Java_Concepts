package oop.Abstraction;



public interface USMedical extends WHO,UN{
	// interface can not implement anything, Interface can have only parent interface not the parent class 
	// Interface can not have any parent class
	
	int min_fee = 10; // Interface variables are Static and final by nature : It will stored in CMA - Meta space 
	
	// Should not have Method body - It's method declaration or method prototype 
	// Should not have business logic here 
	// Abstraction - Hiding the implementation 
	
	// This is 100% Abstraction
	public void physioServices();
	public void cardioServices();
	public void entServices();
	public void emergencyServics();
	
	// We can design the method signature here 
	public void test(int a );
	// Method over loading
	public String get(int a,int b);
	
	public void covidVaccination();
	
	
	// From JDK 1.8 	partial abstraction
	// 1. Can have static method with method body (Business Logic)
	
	public static void USMedPharmacy() {
		
		System.out.println("US -USMedPharmacy  ");
		
	}
	
	// 2. can have a default method (non static ) with method body
	// We can override the default method making default as static 
	default void billing() {  // one copy will given in to Forties hospital Object
		System.out.println("US -billing  ");
	}
	
	public static void jdk8() {
		System.out.println("This is US MEdical jdk 8 method");
	}

	 // We can over load the methods also
	public static void jdk8(int a) {
		System.out.println("This is US MEdical jdk 8 method");
	}
}






