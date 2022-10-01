package com.seetech.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("SeeTech");
		
		System.out.println(sb);
		sb.append("Inc");
		
		System.out.println(sb);
		
		StringBuilder sbb = new StringBuilder("SeeTech");
		System.out.println(sbb);
		sbb.append("Inc");
		
		System.out.println(sbb);
	}

}
