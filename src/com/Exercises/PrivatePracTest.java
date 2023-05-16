package com.Exercises;

public class PrivatePracTest {

	public static void main(String[] args) {
		PrivatePrac obj = new PrivatePrac(); 
		
		
		String customerAdhar = obj.getAdhar("BUG786512345");
		
		System.out.println("This is user Adhar number : " + customerAdhar);
		
	
	}

}
