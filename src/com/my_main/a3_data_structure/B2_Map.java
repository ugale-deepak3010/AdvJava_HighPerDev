package com.my_main.a3_data_structure;

import java.util.HashMap;
import java.util.LinkedHashMap;

@SuppressWarnings("unused")
public class B2_Map {

	public static void main(String[] args) {

		HashMap<String, Integer> myMap = new HashMap<>();

		myMap.put("Deepak", 1);
		myMap.put("Manali", 2);

		myMap.get("Deepak");
		myMap.containsValue(1);

		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.
		myMap.merge("Deepak", 1, Integer::sum);// if not present then add, if already then increment.

		myMap.forEach((key, val) -> System.out.println(key + "=" + val));

		LinkedHashMap<String, Integer> insertOrderMap = new LinkedHashMap<>();

	}

}
