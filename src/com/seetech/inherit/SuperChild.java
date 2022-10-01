package com.seetech.inherit;

public class SuperChild extends Child {

	public static void main(String[] args) {
		
		System.out.println("Im in Super child");
		
		SuperChild superChild = new SuperChild();
		superChild.methodInParent();
		
		System.out.println(superChild.name);
		System.out.println(superChild.id);
	}

}
