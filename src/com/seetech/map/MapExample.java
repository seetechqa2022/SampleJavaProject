package com.seetech.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "See Tech");
		map.put("country", "IT");
		map.put("country2", "IND2");
		map.put("country3", "IND2");
		
		System.out.println("Size: "+map.size());
		//System.out.println(map.get("name"));
		
		for(String key: map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}

}
