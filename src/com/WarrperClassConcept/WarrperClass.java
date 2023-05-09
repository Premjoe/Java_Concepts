package com.WarrperClassConcept;

public class WarrperClass {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// Data conversation : String to int

		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// String to double
		String l = "10";
		System.out.println(l + 5);

		double g = Double.parseDouble(l);
		System.out.println(g + 5);

		// String to boolean

		String a = "default";

		System.out.println(a + "testing");
		boolean f = Boolean.parseBoolean(a);
		System.out.println(f);

		// int to String

		int q = 10;
		System.out.println(q + 10);

		String d = String.valueOf(q);
		System.out.println(d + 10);

	}

}
