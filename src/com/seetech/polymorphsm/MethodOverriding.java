package com.seetech.polymorphsm;

public class MethodOverriding extends ParentClass{
	
	
	void add(float a, int b) {
		System.out.println("float int child: "+(a+b));
		System.out.println("float int child: "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
		
		methodOverriding.add(0, 0);
	}

}
