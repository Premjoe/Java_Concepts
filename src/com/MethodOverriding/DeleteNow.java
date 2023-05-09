package com.MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeleteNow {

	public void myFunction() {
		System.out.println("Just print");
	}

	public static void myStaticFun() {

		System.out.println("This is static function");
	}

	public static void main(String[] args) {

		int k = 10;
		int l = 20;

		if (k == 10) {

		}

		else {
			System.out.println("Bye");
		}

		if (k == 10) {
			System.out.println("Hi");
		} else if (l < 10) {

		} else {

		}

		String name[] = new String[2];

		name[0] = "34";
		name[1] = "67";

		String browser[] = { "Chrome", "Safari" };

		for (int i = 0; i < 9; i++) {
			System.out.println("kjsdh");

			if (k == 0) {
				System.out.println("j");

			}

			break;
		}

		int p = 0;

		while (p <= 0) {
			System.out.println("ksjhd");

			p++;
		}

		int a = 0;
		do {
			System.out.println("jks");
			a++;

		} while (a <= 0);
		{
			System.out.println("jfjf");
		}

		for (String e : browser) {
			System.out.println(e);
		}

		ArrayList<String> searchEngin = new ArrayList<String>();

		searchEngin.add("Chrome");
		searchEngin.add("Safari");
		searchEngin.add("qwertz");

		System.out.println(searchEngin);
		searchEngin.add(0, "Edge");
		Collections.sort(searchEngin);
		System.out.println(searchEngin);
		Collections.shuffle(searchEngin);
		System.out.println(searchEngin);
		Collections.lastIndexOfSubList(searchEngin, searchEngin);
		System.out.println(searchEngin);

		ArrayList<Integer> age = new ArrayList<Integer>(Arrays.asList(10, 20, 40, 50, 70));
		System.out.println(age.size());

		DeleteNow objref = new DeleteNow();
		objref.myFunction();
		DeleteNow.myStaticFun();

	}

}
