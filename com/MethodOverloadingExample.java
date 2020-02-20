package com;

public class MethodOverloadingExample {
	// With the help of method overloading compile time polymorphism
	// same name is used because we can add in more functionality
	double add(int a, double b) {
		return a + b;
	}

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloadingExample m = new MethodOverloadingExample();
		System.out.println(m.add(10, 10.4));
		System.out.println(m.add(10, 20));
		System.out.println(m.add(10.9, 9.1, 10.0));

	}
}
