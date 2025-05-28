package com.my_main.a2_liskov_substitution_prinicple;

public class Main {

	public static void main(String[] args) {

		Cloth cloth1 = new Shirt();
		checkout(cloth1);

		Cloth cloth2 = new Pant();
		checkout(cloth2);

	}

	public static void checkout(Cloth cloth) {
		System.out.println(cloth.getName() + " =  " + cloth.getprice());
	}
}

abstract class Cloth {
	abstract int getprice();

	abstract String getName();
}

class Shirt extends Cloth {

	@Override
	int getprice() {
		return 10;
	}

	@Override
	String getName() {
		return "Shirt";
	}
}

class Pant extends Cloth {

	@Override
	int getprice() {
		return 99;
	}

	@Override
	String getName() {
		return "Pant";
	}
}
