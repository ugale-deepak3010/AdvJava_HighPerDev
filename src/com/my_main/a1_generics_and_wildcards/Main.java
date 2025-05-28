package com.my_main.a1_generics_and_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
public class Main {

	
	public static void main(String[] args) {
		
		List shape= new ArrayList();
		
		shape.add("Circle");
		shape.add(123);
		shape.add(2.3F);
		
		String cir = (String) shape.get(0); // type casting is required.
		
		
		//----------------
		
		String[] words= {"apple","Banana"};
		Integer[] nums= {1,2,3};
		
		//---
		
		System.out.println(convertArrayTolist(words));
		System.out.println(convertArrayTolist(nums));
		
		
		//-- 
		
		System.out.println(convertNumArrayTolist(nums));
		
		Float[] floats= {1.1F,2.2F,3.2F};
		System.out.println(convertNumArrayTolist(floats));
		//convertNumArrayTolist(words); can't
	
	}
	
	//------------GENERICS
	private static <T> List<T> convertArrayTolist(T[] array) {		
		return Arrays.asList(array);
	}
	private static <T> void simple(T[] array) {		
	}
	
	// BOUNDED GENERICS
	private static <T extends Number> List<T> convertNumArrayTolist(T[] array) {		// Number is interface / hence int, float, long..
		return Arrays.asList(array);
	}

	//-----------------------------------------------WILDCARDS
	private static void acceptOnlyNumberList(List<? extends Number> numlist) {
		return;
	}
	
	

}
