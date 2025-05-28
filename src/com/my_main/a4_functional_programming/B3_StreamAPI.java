package com.my_main.a4_functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B3_StreamAPI {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(99, 1, 23, 43, 44, 22);

		nums.stream().sorted().forEach(System.out::println);

		nums.stream().filter(num -> (num % 2) == 0).forEach(System.err::println);

		var list = nums.stream().filter(num -> (num % 2) == 0).collect(Collectors.toList());

		list.forEach(System.out::println);
	}
}
