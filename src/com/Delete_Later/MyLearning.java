package com.Delete_Later;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLearning {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 90, 100));
		System.out.println(numList);
		System.out.println("-------");

		Collections.reverse(numList);
		System.out.println(numList);

		System.out.println("-------");

		Collections.shuffle(numList);
		System.out.println(numList);
		System.out.println("-------");

		Collections.sort(numList);
		System.out.println(numList);
		System.out.println("-------");

		// Static Array to Dynamic Array conversion

		String browser[] = new String[3];
		browser[0] = "Chrome";
		browser[1] = "Safari";
		browser[2] = "Firefox";

		ArrayList<String> newBrowserList = new ArrayList<String>(Arrays.asList(browser));

		newBrowserList.add("Opera");
		newBrowserList.add("Edge");
		newBrowserList.add("IE");

		System.out.println(newBrowserList);
		System.out.println("-------");

		Integer myNumber[] = new Integer[3];

		myNumber[0] = 10;
		myNumber[1] = 20;
		myNumber[2] = 30;

		ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(myNumber));

		testList.add(300);
		System.out.println(testList);
		System.out.println("-------");

		Integer rollNumber[] = { 1, 2, 23, 45, 67, 89, 76, 56, 90, 4 };

		List<Integer> exList = Arrays.asList(rollNumber);

//		exList.add(7);
		System.out.println(exList);
		Collections.sort(exList);
		;
		System.out.println("-------");
		System.out.println(exList);

		System.out.println("-------");
		int markList[] = new int[3];

		markList[0] = 10;
		markList[1] = 34;
		markList[2] = 89;

		System.out.println(Arrays.toString(markList));
		System.out.println("-------");

		int j = 10;
		do {

			System.out.println("This is do while loop: " + j);
			j--;
		} while (j > 0);

		System.out.println("--------------------");

	}

}
