package com.my_main.a6_io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/**
 * 
 * input
 * 
 * 
 */

@SuppressWarnings({"unused","resource"})
public class B1_UserInput {

	
	public static void main(String[] args) throws FileNotFoundException {
		

		//all are abstract
		
		// handle Bytes
		InputStream inputStream;
		OutputStream outputStream;
		
		
		
		// handle char's | unicode.
		Reader reader;
		Writer writer;

		
		//================== comment below while running.
		
		InputStream inputStream1 = new FileInputStream(new File(""));
		InputStream inputStream2 = new ByteArrayInputStream(null);
		// and many more.
		
		OutputStream outputStream1= new FileOutputStream(new File(""));
		OutputStream outputStream22= new ByteArrayOutputStream();
		// and many more.
		
		
		
		
		
		
		
		//-------------
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.printf("Enter your name: ");
		String name= scanner.nextLine(); 

		System.out.printf("Enter your age: ");
		int age= scanner.nextInt(); 
		
		System.out.println("Hello "+name+" your age is :"+age);
		
		scanner.close();
		
	}

}
