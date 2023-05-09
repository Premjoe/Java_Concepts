package com.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Home_Work {

	public static void main(String[] args) {

		// 2.Write a program to create a static Array, having following cricket data:

		Object cricket[] = new Object[6];

		cricket[0] = "Dhoni";

		cricket[1] = 60;

		cricket[2] = "Chennai super kings";

		cricket[3] = "20.12.1880";

		cricket[4] = 'M';

		cricket[5] = 3.2;

		System.out.println(Arrays.toString(cricket));

		System.out.println("--------");

		// 3

		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Red"); // 0

		colours.add("Green"); // 1

		colours.add("Yellow");

		colours.add("White");

		colours.add("Black");

		colours.add("Blue");

		colours.add("Oringe");

		// System.out.println(colours.size());

		for (int i = 0; i < colours.size(); i++) {

			System.out.println(i + " " + colours.get(i));

		}

		System.out.println("--------");

		for (String e : colours) {

			System.out.println(e);

		}

		System.out.println("--------");

		// 3

		System.out.println("The specified index is :1 " + colours.get(1));

		System.out.println("--------");

		System.out.println("Befor Update in specified index :0 " + colours);

		System.out.println("--------");

		// 4

		colours.add(0, "nocolcours");

		System.out.println("Updated in specified index :0 " + colours);

		// 5

		for (int i = 0; i < colours.size(); i++) {

			System.out.println(i + " " + colours.get(i));

			if (colours.get(i).equals("Blue")) {

				System.out.println("I found the colours, Please exit");

				break;

			}

		}
		System.out.println("--------");

		// 6.Reverse this array list:
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Aron");
		nameList.add("Peter");
		nameList.add("Same");
		nameList.add("Abaya");
		nameList.add("Eden");
		nameList.add("Nancy");
		System.out.println(nameList);
		System.out.println("---------");
		Collections.reverse(nameList);
		System.out.println(nameList);
		System.out.println("--------");
		Collections.replaceAll(nameList, "Aron", "Test");
		System.out.println(nameList);
		System.out.println("--------");

		// 7.Write a java program to extract a portion of an array list

		ArrayList<String> portionList = new ArrayList<String>();

		portionList.add("Red"); // 0

		portionList.add("Green"); // 1

		portionList.add("Yellow"); // 2

		portionList.add("White"); // 3

		portionList.add("Black"); // 4

		portionList.add("Blue"); // 5

		portionList.add("Orange");// 6

		ArrayList<String> portion = new ArrayList<String>(portionList.subList(3, 5));
		// If i want to print the particular index to particular element
		System.out.println(portion);
		System.out.println("--------");

		// 8. Empty array List
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		emptyList.add(01);
		emptyList.add(20);
		System.out.println(emptyList);
		System.out.println("--------");
		emptyList.clear();
		System.out.println(emptyList);

		// 9. Trim the Virtual capacity
		System.out.println("--------");
		ArrayList<Object> daysList = new ArrayList<Object>();

		daysList.add(7);
		daysList.add("Monday");
		daysList.add("Tuesday");
		daysList.add("Wednesday");
		daysList.add("Thursday");
		daysList.add("Friday");
		daysList.add("Saturday");
		daysList.add("Sunday");
		daysList.add(365.5);

		daysList.trimToSize();

		System.out.println(daysList.size());
		System.out.println("--------");
		System.out.println(daysList);

		System.out.println("--------");
		// 10.
		ArrayList<String> dayList = new ArrayList<String>();

		dayList.add("Monday");
		dayList.add("Tuesday");
		dayList.add("Wednesday");
		dayList.add("Thursday");
		dayList.add("Friday");
		dayList.add("Saturday");
		dayList.add("Sunday");

		for (int i = 0; i < dayList.size(); i++) {

			System.out.println("The index of " + i + " is " + dayList.get(i));

		}

	}

}
