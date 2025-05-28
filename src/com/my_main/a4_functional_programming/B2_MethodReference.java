package com.my_main.a4_functional_programming;

import java.util.Arrays;
import java.util.List;

public class B2_MethodReference {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		nums.forEach(B2_MethodReference::addOrEven);

	}

	public static void addOrEven(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}
}
