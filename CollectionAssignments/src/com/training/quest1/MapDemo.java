package com.training.quest1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, List<String>> hashMap = new HashMap<>();
		
		List<String> tamilNadu = List.of("Trichy", "Madras", "Salem");
		List<String> kerala = List.of("Kochi", "Palakad", "Wagamon");
		List<String> karnataka = List.of("Banglore", "Coorg", "Hosur");
		
		hashMap.put("Tamil Nadu", tamilNadu);
		hashMap.put("Kerala", kerala);
		hashMap.put("Karnataka", karnataka);
		
		for (Entry<String, List<String>> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
