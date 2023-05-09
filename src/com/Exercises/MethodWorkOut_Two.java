package com.Exercises;

public class MethodWorkOut_Two {
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
		MethodWorkOut_Two obj = new MethodWorkOut_Two();
		System.out.println("-------");
		boolean checkAge = obj.teenAgeCheck(10);
		System.out.println(checkAge);
		System.out.println("-------");
	}

}
