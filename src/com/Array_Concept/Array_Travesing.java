package com.Array_Concept;

public class Array_Travesing {

	public static void main(String[] args) {

		int age[] = new int[4];

		age[0] = 100;
		age[1] = 200;
		age[2] = 300;
		age[3] = 400;

		for (int h = 0; h < age.length; h++) {
			System.out.println(age[h]);
			if (age[h] == 300) {
				System.out.println("Found the 300 and exit now");

				break;
			}
		}

		System.out.println("------");
		// For Each
		for (int e : age) {
			System.out.println(e);
		}
		System.out.println("------");

		short s[] = new short[4];
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = 40;

		for (short e : s) {
			System.out.println(e);
			if (e == 20) {
				System.out.println("Found 20 and exit");
			}
		}
		System.out.println("------");

		// Reverse order with index based loop:

		int m[] = new int[4];
		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;

		for (int j = m.length - 1; j >= 0; j--) {
			System.out.println(m[j]);
		}
		System.out.println("------");
		// Array literals
		int mark[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int h = mark.length;
		System.out.println(h);

	}

}
