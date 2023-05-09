package com.Delete_Later;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SyntaxPrac {

	public void myMethod1() {
		int a = 10;
		int b = 10;

		System.out.println(a + b);
	}

	public int myMethod2() {

		int k = 10;
		int l = 38;

		int total = k + l;

		return total;

	}

	public int myMethod3(int a, int b) {

		int addition = a + b;

		return addition;

	}

	public void name() {

	}

	public void name(int a) {

	}

	public void name(String a) {

	}

	public void name(int a, String n) {

	}

	public void name(String j, String k, int l) {

	}

	public void name(int k, int b) {

	}

	public static void main(String[] args) {
		String name = "Selenium";
		int num = 23;

		System.out.println(name + " is my project name");
		System.out.println("This is my age: " + num);
		System.out.println("-------");

		int age = 10;

		if (age >= 18) {
			System.out.println("Your are eligible for vote");

		} else {
			System.out.println("You are not eligible for vote");
		}

		System.out.println("---");
		int driving = 19;

		if (driving >= 18) {
			System.out.println("Your are eligible for vote and driving your self ");
		}

		else if (driving == 17) {
			System.out.println("You can drive with parents");
		}

		else {
			System.out.println("You are not eligible for voting and driving ");
		}

		System.out.println("---");

		// Static array with for loop
		int mark[] = new int[3];
		mark[0] = 10;
		mark[1] = 11;
		mark[2] = 29;

		for (int i = 0; i < mark.length; i++) {

			System.out.println(i + " " + mark[i]);

			if (mark[i] == 11) {
				System.out.println("test");
			}
		}
		System.out.println("---");

		// Static array with for each

		for (int e : mark) {
			System.out.println(e);
		}

		System.out.println("---");

		String month[] = new String[5];

		month[0] = "Jan";
		month[1] = "Feb";
		month[2] = "March";
		month[3] = "April";
		month[4] = "May";

		int i = 0;
		while (i < month.length) {
			System.out.println(month[i]);
			if (month[i].equals("Feb")) {
				System.out.println("You are birth month is feb ");
			}
			i++;
		}

		System.out.println("---");

		double temp[] = new double[7];

		temp[0] = -10.0;
		temp[1] = 10.9;
		temp[2] = 20.6;
		temp[3] = 35.9;
		temp[4] = 39.9;
		temp[5] = 40.3;
		temp[6] = 28.3;

		int r = 0;

		do {

			System.out.println(temp[r]);
			if (temp[r] == 40.3) {
				System.out.println("Highe fever, Please go to hospital");
			} else if (temp[r] == -10.0) {
				System.out.println("Dress up with jacket and avoid to go out");
			}
			r++;

		} while (r < temp.length);

		System.out.println("---");

		// Static Array Literals

		String colours[] = { "White", "Red", "Black", "Yello", "Blue" };

		for (int c = 0; c < colours.length; c++) {
			System.out.println(colours[c]);

			if (colours[c].equals("Black")) {
				System.out.println("Black is your favourit colour");
			}

		}
		System.out.println("------");
		// Dynamic Array:

		ArrayList<String> city = new ArrayList<String>();
		city.add("Lathen");
		city.add("Berlin");
		city.add("Hamburg");
		city.add("Chennai");
		city.add("Madurai");
		city.add("Eachambadi");
		city.add("Valan nagar");

		System.out.println(city.get(0));
		System.out.println("------");
		System.out.println(city.size());
		System.out.println("------");

		boolean find = city.contains("Valan nagar");

		if (find) {
			System.out.println("The List contains Valan Nagar");
		} else {
			System.out.println("It's not contains the valan nagar ");
		}
		System.out.println("------");
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Name1", "Name2", "Name3", "Name4"));
		System.out.println(nameList);
		System.out.println("------");
		for (String e : nameList) {

			System.out.println(e);

		}
		System.out.println("------");

		for (int k = 0; k < nameList.size(); k++) {
			System.out.println(k + " " + nameList.get(k));
		}

		System.out.println("------");

		ArrayList<Integer> ageList = new ArrayList<Integer>();
		ageList.add(10);
		ageList.add(20);
		ageList.add(30);
		ageList.add(40);
		ageList.add(50);

		System.out.println(ageList.get(3));
		System.out.println(ageList.size());
		System.out.println(ageList);

		ageList.add(1, 100);
		System.out.println(ageList);
		Collections.shuffle(ageList);
		System.out.println(ageList);
		Collections.sort(ageList);
		System.out.println(ageList);

		// Creating the object
		SyntaxPrac objref = new SyntaxPrac();
		System.out.println("-------");

		objref.myMethod1();
		System.out.println("-------");

		int mytotal = objref.myMethod2();
		System.out.println(mytotal);
		System.out.println("-------");

		int newfun = objref.myMethod3(100, 100);
		System.out.println(newfun);

	}

}
