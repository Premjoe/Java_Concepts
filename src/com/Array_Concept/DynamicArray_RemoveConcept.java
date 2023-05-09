package com.Array_Concept;

import java.util.ArrayList;

public class DynamicArray_RemoveConcept {

	public static void main(String[] args) {

		ArrayList<String> countryList = new ArrayList<String>();
		// System.out.println(countryList.get(0)); // IOB
		countryList.add("Japan"); // 0
		countryList.add("Germany"); // 1
		countryList.add("India"); // 2
		countryList.add("Canada"); // 3
		countryList.add("Denmark"); // 4
		countryList.add("Selenium"); // 5
		countryList.add("Firefox");// 6
		countryList.add("null");// 7

		System.out.println("To print whole list:" + countryList); // To print whole list
		System.out.println("---");
		System.out.println("To print particular index :" + countryList.get(4)); // To print particular index
		System.out.println("---");
		System.out.println("To remove particular index :" + countryList.remove(3)); // To remove particular index
		System.out.println("---");
		System.out.println(countryList);
		System.out.println("---");
		countryList.add("USA");
		System.out.println(countryList);
		System.out.println("---");
		countryList.add("Safari");
		// countryList.remove("Selenium");
		countryList.add(0, "Netherland");
		System.out.println("Updated 0th index as a Netherland:" + countryList); // the existing value will shift in to
																				// next position
		System.out.println("---");

		// countryList.add(9, "Cypress"); // IOB - Index of Bounds Exception

	}

}
