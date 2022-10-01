package com.seetech.exceptions;

public class ExceptionsInJava {

	public static void main(String[] args) {
		ExceptionsInJava exceptionsInJava = new ExceptionsInJava();
		try {
			exceptionsInJava.testMethod();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		}
		System.out.println("Hi5");
	
	}
	
	public void testMethod() throws Exception{
		int data = 10/0;
		System.out.println("Hi1");
		System.out.println("Hi2");
		System.out.println("Hi3");
		System.out.println("Hi4");
		
	}

}
