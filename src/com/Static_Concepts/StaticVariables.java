package com.Static_Concepts;

public class StaticVariables {

	String name; // This is instance variable
	static int age; // This is static variable , static is a keyword

	public void getEmail() {

	}

	public static void sendEmail() {

	}

	public static void main(String[] args) {

		final int i = 10;// local variable
		System.out.println("This is local variable: " + i);

		StaticVariables eden = new StaticVariables();
		// How to access the non static variables
		eden.name = "Puchilie";

		// How to Access the static variable or class variable
		// 1.can access by class name
		StaticVariables.age = 24;

		// 2. Can access directly also
		age = 30;

		// 3. Can access using object reference name

		eden.age = 45; // we can access it bit it's not right way to use it and It's not recommendated
		// Here java will take extra work like permutation and combination to access

		System.out.println(StaticVariables.age); // Static variable accessing by class name
		System.out.println(eden.name); // calling by object reference

		StaticVariables.sendEmail();
		sendEmail();

		eden.getEmail();

		// Advantages :

		// We can access globally

		// Disadvantage :
		// static member is always part of memory whether they are use or not
		// We can't override the static method
		// Out of memory issue is possible because here no Garbage collectors
		// static methods are hard to test(JVM test cases)
		// Parallel Execution is not possible in static

	}

}
