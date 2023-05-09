package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapConcept {

	public static void main(String[] args) {

		// No order and no indexing concept
		// It stores the values like Key and key values
		// key can not be duplicated
		// can store n no of null values but only one null key (It will store only one
		// null value )
		// Hash map is not thread safe - Unsynchronised
		//
		HashMap<String, String> capitalMap = new HashMap<String, String>();

		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("Germany", "Berlin");
		capitalMap.put(null, "Test");
		capitalMap.put(null, "Test1");
		capitalMap.put("France", null);
		capitalMap.put("Italy", null);

		System.out.println(capitalMap.get("Germany"));
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get(null));

		// 2 types of iterator : Over the key - by using keySet()
		// key set : given me the pair of value
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {

			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + "value = " + value);

		}
		System.out.println("---------");

		// for each lambda

		capitalMap.forEach((k, v) -> System.out.println("key = " + k + "value = " + v));

	}

}
