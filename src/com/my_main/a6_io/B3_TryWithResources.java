package com.my_main.a6_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class B3_TryWithResources {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/sample.txt"))) {

			bufferedReader.lines().forEach(System.out::println);

		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
