package com.Exercises;

public class If_Else_Conditional {

	public static void main(String[] args) {

		// 1.Find the provide number is positive or negative

		int number = -3;

		if (number >= 0) {
			System.out.println("This is postive " + number);
		} else {
			System.out.println("Given number is negative " + number);
		}
		System.out.println("-------");
		// 2. Find the greatest number
		int number1 = 25;
		int number2 = 78;
		int number3 = 87;
		int max = number1;

		if (number2 > max) {
			max = number2;

		}

		if (number3 > max) {
			max = number3;
		}

		System.out.println("The biggest number is: " + max);
		System.out.println("-------");

		// 3. Check the number is add of even

		int data = 11;

		if (data % 2 == 0) {

			System.out.println("This is even number ");

		} else {
			System.out.println("This is even number");
		}
		System.out.println("-------");
		// 3. using switch case find the vowels or consonant

		String value = "A";

		switch (value) {
		case "E":
			if (value == "E") {

				System.out.println("This is vowels " + value);
			}
			break;
		case "A":
			if (value == "A") {

				System.out.println("This is vowels " + value);
			}
			break;
		case "I":
			if (value == "I") {

				System.out.println("This is vowels " + value);
			}
			break;
		default:
			System.out.println("This is consonant ");
			break;
		}

	}

}
