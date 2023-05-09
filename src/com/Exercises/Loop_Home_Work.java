package com.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Loop_Home_Work {

	public static void main(String[] args) {
		// Print 1.

		for (int i = 0; i <= 10; i++) {
			System.out.println("I am Batman");

			if (i == 5) {
				System.out.println("I printed up to 5 times ");
				break;
			}
		}
		System.out.println("------");
		// 2
		for (int i = 0; i <= 9; i++) {
			System.out.println("I am Batman: " + i);

			if (i == 9) {
				System.out.println("I printed");
				break;
			}
		}

		System.out.println("------");

		// 3.1

		for (int i = 10; i > 0; i--) {
			System.out.println(i); // 10
		}

		System.out.println("--------------------");

		// 3.2
		int j = 10;
		do {

			System.out.println("This is do while loop: " + j);
			j--;
		} while (j > 0);

		System.out.println("--------------------");

		// 4

		int l = 1;

		while (l <= 10) {
			System.out.println("Hello world: " + l);
			l++;
		}

		System.out.println("--------------------");

		// 5

		System.out.println(5 * 2);

		for (int m = 1; m <= 23; m++) {
			System.out.println("multiplication: 5*" + 5 * m);

			if (m == 20) {

				System.out.println("Found 100");

				break;

			}
		}

		System.out.println("--------------------");

		// 6

		for (int m = 1; m <= 100; m++) {

			if (m % 2 == 0) {

				System.out.println("Found Even Number:" + m);
			}

			else {
				System.out.println("Found odd Number:" + m);
			}
		}

		// 7

//		int a = 1;
//		while(a<=1) {
//			System.out.println("Hi Java");
//		}

		// 8.1

		System.out.println((int) 'a' + "Prem");

		for (char a = 'a'; a <= 'z'; a++) {
			System.out.println(a + " " + (int) a);
		}

		// 8.2

		char s = 'A';

		while (s <= 'Z') {

			System.out.println(s + " " + (int) s);

			s++;
		}

		// 8.3
		System.out.println((int) '0' + "Prem test char");
		System.out.println("-------");
		char c = '0';

		while (c <= '9') {

			System.out.println(c + " " + (int) c);

			c++;
		}

		System.out.println("-------");
		// 9.1

		for (double f = 1.0; f <= 10.0; f++) {
			System.out.println(f);
		}

		System.out.println("-------");

		// 9.2

		for (int m = 1; m <= 11; m++) {
			System.out.println(m + "x9= " + 9 * m);

			if (m == 10) {

				System.out.println("Found 99");

				break;

			}
		}
		System.out.println("-------");

		// 10

		char c1 = 'a';
		while (c1 <= 'z') {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.print(c1 + " ");
			}

			c1++;
		}

		// 11
		System.out.println("-------");

		for (int g = 1; g <= 10; g++) {
			System.out.println(g);
			if (g == 7) {

				System.out.println("Found 7");

				break;

			}
		}

		ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(myList);
		System.out.println("------");
		Collections.reverseOrder();
		System.out.println(myList);
		System.out.println("------");

		Collections.shuffle(myList);
		System.out.println(myList);
		System.out.println("------");
		System.out.println(myList);

		Collections.sort(myList);
		System.out.println(myList);

	}

}
