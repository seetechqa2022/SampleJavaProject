package com.seetech.dis;

public class A {
	
	
	A(){
		this("Test");
		System.out.println("Hello A");
	}

	A(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		A a = new A();
	}

}
