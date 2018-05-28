package com.sarsjits.java.java8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Java8PredicateExample {

	public static void main(String[] args) {
		Map<String, Integer> iqMap = new ConcurrentHashMap<>();
		iqMap.put("Ram", 100);
		iqMap.put("Shyam", 90);
		iqMap.put("Ghanshyam", 110);
		
		System.out.println(iqMap);
		
		iqMap.entrySet().removeIf(entry -> entry.getValue() <= 100);
		
		System.out.println(iqMap);
	}

}
