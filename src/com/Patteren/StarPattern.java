package com.Patteren;

public class StarPattern {

	public static void main(String[] args) {

		for (int i = 0; i <= 8; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(" " + "*");

			}

			System.out.println();
		}
		System.out.println("------------");
		for (int i = 0; i <= 8; i++) {

			for (int j = 8; j >= i; j--) {

				System.out.print(" " + "*");

			}

			System.out.println();
		}

		System.out.println("------------");
		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" *");

			}

			System.out.println();
		}

		System.out.println("------------");

		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i <= 8; i++) {
			for (int j = 8; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
