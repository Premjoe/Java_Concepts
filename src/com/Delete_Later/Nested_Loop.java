package com.Delete_Later;

import java.util.ArrayList;

public class Nested_Loop {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {

				System.out.print(i + "" + j + " ");

			}
			System.out.println();
		}

		System.out.println("-------------");

		int n = 5;
		for (int i = 0; i <= 5; i++) {
			System.out.println(" ");
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}

		}

		ArrayList<String> browser = new ArrayList<String>();

	}

}
