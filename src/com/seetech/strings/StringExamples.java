package com.seetech.strings;

public class StringExamples {

	public static void main(String[] args) {
		
		String s1 = "Hello!";
		String s2 = "Hello!";
		
		String ss1 = new String("Hello!");
		String ss2 = new String("Hello!");
		
		if(s1==s2) {
			System.out.println("== : S1 and S2 are equals!");
		}
		else {
			System.out.println("== : S1 and S2 are not equals!");
		}
		
		if(ss1==ss2) {
			System.out.println("== : SS1 and SS2 are equals!");
		}
		else {
			System.out.println("== : SS1 and SS2 are not equals!");
		}
		
		System.out.println("*********************************************");
		
		if(s1.equals(s2)) {
			System.out.println("equals method:: S1 and S2 are equals!");
		}
		else {
			System.out.println("equals method:: S1 and S2 are not equals!");
		}
		
		if(ss1.equals(ss2)) {
			System.out.println("equals method:: SS1 and SS2 are equals!");
		}
		else {
			System.out.println("equals method:: SS1 and SS2 are not equals!");
		}
	}
	

}