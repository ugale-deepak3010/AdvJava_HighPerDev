package com.my_main.a6_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B2_ReadingFile_BufferedReader {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader= new BufferedReader(new FileReader("src/sample.txt"));
		
		bufferedReader.lines().forEach(System.out::println);
		
		bufferedReader.close();
		
//		StringBuilder stringBuilder= new StringBuilder();
//		bufferedReader.lines().forEach(line->stringBuilder.append("\nLine: "+line)); // Stream can use only once, use at a time one.
//		
//		System.err.println("showing "+stringBuilder);
		
	}

}
