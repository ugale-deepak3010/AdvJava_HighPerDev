package com.my_main.a4_functional_programming;

public class B1_Functional_Interface {

	public static void main(String[] args) {

		Greeting greet = () -> {
			System.out.println("Hello Deepak");
		};
		greet.sayHello();

		GreetingMorning morning = (name) -> {
			System.out.println("Good Monring " + name);
		};
		morning.sayHello("Deepak");
	}
}

@FunctionalInterface
interface Greeting {
	void sayHello();
}

@FunctionalInterface
interface GreetingMorning {
	void sayHello(String name);
}
