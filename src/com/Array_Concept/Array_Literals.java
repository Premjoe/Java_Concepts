package com.Array_Concept;

import java.util.Arrays;

public class Array_Literals {
	// why Array Literals : when we know the array value in hand with coma separated
	// int k[] = new int[10]; Why new keyword method : Already taking some space or
	// segment in the memory
	// after start allocation the values also We don't know the exact value so

	public static void main(String[] args) {
		int k[] = new int[10];
		k[0] = 100;
		k[1] = 200;
		System.out.println(k[0]);// 100
		System.out.println("----");
		System.out.println(k[2]);// 0

		// In any primitive data type can't have null, The default value is always 0
		System.out.println("----");
		k[5] = 500;
		System.out.println(k[5]);

		// Array Literals: static array: having arrays elements already
		int p[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		// li = 0
		// hi = l-1

		int l = p.length;// 10
		// 0 to 9
		System.out.println(l);
		System.out.println("Prem");
//		p[10] = 200;
//		System.out.println(p[10]);
		System.out.println("----");
		// double
		double d[] = { 12.33, 44.55, 8.99 };
		System.out.println("----");
		char c[] = { 'a', 'b', 'r' };
		String emp[] = { "Shhubham", "Pooja", "Naresh", "Adil" };
		Object studentInfo[] = { "Vijay", 25, 34.44, 'm', "Pune", "India", false };

		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(emp));
		System.out.println(Arrays.toString(studentInfo));

		System.out.println("----");
		for (String e : emp) {
			System.out.println(e);
		}

		System.out.println("----");
		for (Object e : studentInfo) {
			System.out.print(e + " ");
		}
		System.out.println("----");

		String student[] = new String[4];
		student[0] = "Eden";
		student[1] = "Boden";
		student[2] = "SUV";
		student[3] = "Selenium";
		System.out.println(Arrays.toString(student));
		System.out.println("----");
		// student[0]= "test"; REPLACING the index instead of adding
		System.out.println(student[2]);

		for (String e : student) {
			System.out.println(e);
		}
		System.out.println("--for eCH--");
		System.out.println(Arrays.toString(student));
		System.out.println("----");
		String browser[] = { "chrome", "Firfox", "Safari" };

		System.out.println(Arrays.toString(browser));

		// delete a value from the array:
	}

}
