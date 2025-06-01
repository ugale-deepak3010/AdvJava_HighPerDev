package com.my_main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees= Arrays.asList(new Employee(1, "Deepak"),
			new Employee(2, "Aman"), new Employee(3, "Xebra"), new Employee(4, "Human")
		);

		String str = "ABCCAD";	// B
		
		getSortedList(employees);
		
		System.out.println(getFirstNonRepeatChar(str));
	}
	
	
	public static List<Employee> getSortedList(List<Employee> employees) {
		
		
		
		List<Employee> sortedById = employees.stream().sorted((emp1,emp2)->{
			if(emp1.getId()>emp2.getId()) {
				return 1;
			}
			else if(emp1.getId()<emp2.getId()){
				return -1;
			}else {
				return 0;
			}			
		}
		).collect(Collectors.toList());
		
		
		sortedById.stream().sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList()).forEach(emp->System.out.println(emp.toString()));;
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static char getFirstNonRepeatChar(String inputString) {

		char result = ' ';

		char[] myCharArr = inputString.toCharArray();

		List<Character> allCharacters = new ArrayList<>();

		for (char singleChar : myCharArr) {
			allCharacters.add(singleChar);
		}

		char[] distChars = new char[myCharArr.length];
		char[] dupChars = new char[myCharArr.length];
		
		int dupCharCount= 0;
		for(int i=0;i<myCharArr.length;i++) {
			
			boolean charFound=false;
			
			for(int j=0;j<distChars.length;j++) {
				if(distChars[j]==myCharArr[i]) {
					charFound=true;
					dupChars[dupCharCount]=myCharArr[i];
					dupCharCount++;
				}
			}
			
			if(!charFound)
				distChars[i]=myCharArr[i];
		}
		
		for(int i=0;i<distChars.length;i++) {
			
			boolean isDup= false;
			for(int j=0;j<dupChars.length;j++) {
				if(dupChars[j]==distChars[i]) {
					isDup=true;
				}
			}
			
			if (!isDup) {
				System.out.println("Here is the first Dup: "+distChars[i]);
				break;
			}
			
		}
				
		List<Character> distinctCharacters = new ArrayList<>();
		List<Character> dupCharacters = new ArrayList<>();

		for (Character character : allCharacters) {
			if (!distinctCharacters.contains(character)) {
				distinctCharacters.add(character);

			} else {
				dupCharacters.add(character);

			}
		}

		for (Character character : distinctCharacters) {
			if (!dupCharacters.contains(character)) {
				result = character;
				break;
			}
		}
		return result;
	}
	
	
	
	
	
	
	
}


class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
