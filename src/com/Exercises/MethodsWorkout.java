package com.Exercises;

public class MethodsWorkout {
	// 1.1
	public void addition() {
		int a = 10;
		int b = 20;
		int total = a + b;
		System.out.println(total);
	}

	// 1.2
	public void subtraction() {
		int a = 40;
		int b = 20;
		int total = a - b;
		System.out.println(total);
	}

	// 1.3
	public void division() {
		int a = 40;
		int b = 20;
		int total = a / b;
		System.out.println(total);
	}
	// 2

	public double product(double a, double b) {
		System.out.println("Returns the product of two double numbers entered by user");

		return a + b;

	}

	public int findPostiveNumber() {

		System.out.println("Finding the positive number: ");
		int number = 3;
		return number;
	}

	public int lastFunction(int a) {

		System.out.println("Adding the number");

		return a;
	}

	public boolean teenAgeCheck(int age) {

		boolean flag = true;

		if (age >= 13 && age <= 19) {
			System.out.println("This is Teen Age ");
			// System.out.println(flag);
		} else {
			System.out.println("It's not a teen age");
			flag = false;
			// System.out.println(flag);

		}
		return flag;
	}

	public static void main(String[] args) {

		MethodsWorkout obj = new MethodsWorkout();
		obj.addition();
		obj.subtraction();
		obj.division();
		System.out.println("-------");

		double userDouble = obj.product(03, 01);
		System.out.println("The sum of user entered double number is: " + userDouble);

		System.out.println("-------");
		int myNumber = obj.findPostiveNumber();

		if (myNumber == -0) {
			System.out.println("This is Incorrect number " + myNumber);
		} else if (myNumber >= 0) {
			System.out.println("This is postive number " + myNumber);
		}

		else {
			System.out.println("Given number is negative " + myNumber);
		}

		System.out.println("-------");

		int findPositive = obj.lastFunction(0);

		if (findPositive == -0) {
			System.out.println("This is Incorrect number " + findPositive);
		} else if (findPositive >= 0) {
			System.out.println("This is postive number " + findPositive);
		}

		else {
			System.out.println("Given number is negative " + findPositive);
		}
		System.out.println("-------");
		boolean checkfun = obj.teenAgeCheck(10);
		System.out.println(checkfun);
		System.out.println("-------");

	}

}
