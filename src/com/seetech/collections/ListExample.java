package com.seetech.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Vector
		// LinkedList
		// Stack
		
		list.add("12");
		list.add("name");
		list.add("12.20");
		list.add("false");
		list.add("12.20");
		list.add("false");
		list.add("12.20");
		list.add("false1");
		int size = list.size();
		
		System.out.println("ArrayList Size: "+size);
		
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
		}
		
		for (String s: list) {
			System.out.println(s);
		}
		
	}

}
