package com.Static_Concepts;

public class Car {

	String name;
	String engineNumber;
	String chasisNumber;
	static final int wheels = 4;
	// we can make it final because this is constant value, the car wheel is always
	// 4 - to avoid the manipulation
	// This variable value is common property value for all so we can take it as
	// Static

	public static void displayLogo() {

		// For example Amazon :
		// 1.Footer page is static properties
		// 2.Search filed is static properties
		// 3.

	}

	public static void main(String[] args) {

		Car obj = new Car();
		obj.name = "BMW Q7";
		obj.engineNumber = "BMW63874zjgjng";
		obj.chasisNumber = "BMW9uhf67363n";
		// obj.wheels = 4; // This variable value is common property value for all

		Car obj1 = new Car();
		obj1.name = "Audi A9";
		obj1.engineNumber = "AUDIW63874zjgjng";
		obj1.chasisNumber = "AUDI9uhf67363n";
		// obj1.wheels = 4; // This variable value is common property value for all

		Car obj2 = new Car();
		obj2.name = "Honda Civic";
		obj2.engineNumber = "Honda63874zjgjng";
		obj2.chasisNumber = "Honda9uhf67363n";
		// obj2.wheels = 4; // This variable value is common property value for all

		System.out.println(obj.name + " " + obj.engineNumber + " " + obj.chasisNumber + "" + Car.wheels);
	}

}
