package com.MethodOverriding;

public class BMW extends Car {

	// When same methods present in parent class as well as in child class with same
	// name and same no of arguments,
	// is called method overriding
	public void start() {

		System.out.println("This is child class with start function");

	}

	public void theftSafety() {

		System.out.println("This is child class with theftSafety function");

	}

}
