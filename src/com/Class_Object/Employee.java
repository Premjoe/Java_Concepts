package com.Class_Object;

public class Employee {
	// class: Class is Category, BluePrint or we can say Template (we can create the
	// own Template )
	// Objects : Physical entity created from class (Particular category)
	// Every object is having it's own properties

	// In car(Class) category - we have different cars
	// Here object is :Electric car, Automatic car, Honda or BMW

	// class is a group of object , class is a collection of state and behaviour
	// Object is a instance(Representation) of class

	// Class variables or Global variable or Category
	String name;
	int age;
	double salary;
	String city;

	public static void main(String[] args) {
		// Local variable
		int i = 600;
		i = 700;
		// local variable won't work with object

		// Create the object of the class : using new Keyword
		Employee objName = new Employee();
		// Employee = Class name
		// objName = Object reference name
		// new = Is Keyword to create the object
		// Employee() = This is Object name

		// The below 4 variables i can say Blue print or Template
		objName.name = "Prem";
		objName.age = 30;
		objName.salary = 34.7;
		objName.city = "Meppen";

		Employee nancy = new Employee();
		nancy.name = "Eden";
		nancy.age = 2;
		nancy.salary = 50;
		nancy.city = "Lathen";

		System.out.println(nancy.name + " " + nancy.age + " " + nancy.salary + " " + nancy.city);

		System.out.println("------");
		Employee nancy1 = new Employee();
		System.out.println(nancy1.name); // It will show the null because string default value is null
		System.out.println(nancy1.age); // It will print the 0 because int default value is 0
		System.out.println("------");

	}

}
