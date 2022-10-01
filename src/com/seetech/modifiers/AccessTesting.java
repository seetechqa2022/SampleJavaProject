package com.seetech.modifiers;

public class AccessTesting {
	
	private int a=100;
	int p = 200;
	int k =900;

	public static void main(String[] args) {
		// public, private, protedted and defult
		
		AccessTesting accessTesting = new AccessTesting();
		System.out.println(accessTesting.p);
		accessTesting.test22();
		int a2 = 200;
	}
	
	void test22() {
		AccessTesting accessTesting = new AccessTesting();
		//System.out.println(accessTesting.a2);
		System.out.println(accessTesting.p);
		
	}

}
