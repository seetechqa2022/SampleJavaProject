package com.seetech.polymorphsm;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.add(0.0, 0.0);
		
	}
	
	void add(int a, double b) {
		System.out.println("int int: "+(a+b));
	}
	
	void add(double a, int b) {
		System.out.println("int int: "+(a+b));
	}
	
	void add(double a, double b) {
		System.out.println("double double: "+(a+b));
	}

}
