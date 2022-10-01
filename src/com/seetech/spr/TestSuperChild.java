package com.seetech.spr;

public class TestSuperChild extends TestSuperParent {
	
	/*
	 * TestSuperChild(){ System.out.println("I'm child constructor!!"); }
	 */
	
	TestSuperChild(int a){
		super(12);
		System.out.println("I'm child constructor!!");
	}

	public static void main(String[] args) {
		TestSuperChild testSuperChild =  new TestSuperChild(12);
	}

}
