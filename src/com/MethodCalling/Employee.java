package com.MethodCalling;

public class Employee {

	public void method1() {
		System.out.println("This is method 1 from Employee class");
		method2();
	}

	public void method2() {
		System.out.println("This is method 2 from Employee class");

		method3();
	}

	public void method3() {
		System.out.println("This is method 3 from Employee class");

	}

	public static void name() {
		System.out.println("Prem");
		Employee str = new Employee();
		str.method1();

	}

	public static void main(String[] args) {

		Employee obj = new Employee();

		obj.method1();
		System.out.println("--------");

		Browser accBrowser = new Browser();
		accBrowser.browserClass1();
		System.out.println("--------");
		accBrowser.browserClass2();
		System.out.println("--------");
		// Employee.name();
	}

}
