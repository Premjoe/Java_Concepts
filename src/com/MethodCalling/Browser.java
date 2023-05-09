package com.MethodCalling;

public class Browser {

	public void browserClass1() {
		System.out.println("This is my browser class 1 method");
	}

	public void browserClass2() {
		System.out.println("This is my browser class 2 method");
		Employee emp = new Employee();
		emp.method1();

	}

}
