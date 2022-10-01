package com.seetech.inherit;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.methodInParent();
		
		System.out.println(child.name);
		System.out.println(child.id);
	}

}
