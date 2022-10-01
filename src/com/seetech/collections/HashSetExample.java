package com.seetech.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("S1");
		hashSet.add("S2");
		hashSet.add("S3");
		hashSet.add("S3");
		
		System.out.println(hashSet.size());
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		
	}

}
