package com.rrk.collections;

import java.util.Map;
import java.util.HashMap;
//import java.util.HashTable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExploreMapInterfaceRunner {
	public static void main(String[] args) {
	
		Map<String, Integer> map = Map.of("A", 3, "B", 2, "C", 5, "Z", 8);
		
		System.out.println(map);
		
		System.out.println(map.get("Z"));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey("P"));
		
		System.out.println(map.containsValue(3));
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println("----------------------");
		
		Map<String, Integer> hashMap = new HashMap<>(map);
		
		System.out.println(hashMap);
		
		// adding elements into HashMap
		
		hashMap.put("F", 9);
		System.out.println(hashMap);
		
		System.out.println(hashMap.put("F", 11));
		System.out.println(hashMap);
		
		System.out.println("Differences among HashMap, LinkedHashMap, TreeMap");
		
		HashMap<String, Integer> newHashMap = new HashMap<>();
		
		newHashMap.put("Z", 26);
		newHashMap.put("R", 18);
		newHashMap.put("P", 16);
		newHashMap.put("D", 4);
		newHashMap.put("I", 9);
		
		System.out.println(newHashMap);
		
		LinkedHashMap<String, Integer> newLinkedHashMap = new LinkedHashMap<>();
		
		newLinkedHashMap.put("F", 2565);
		newLinkedHashMap.put("C", 59);
		newLinkedHashMap.put("L", 9834);
		newLinkedHashMap.put("K", 348);
		
		System.out.println(newLinkedHashMap);  // Insertion Order is maintained
		
		TreeMap<String, Integer> newTreeMap = new TreeMap<>();
		
		newTreeMap.put("B", 8);
		newTreeMap.put("A", 3);
		newTreeMap.put("Z", 98);
		newTreeMap.put("P", 84);
		
		System.out.println(newTreeMap);  // Sorted order is maintained
		
		
		System.out.println("-------------------------------");
		
		String sentence = "This is a great thing Yes it is";
		sentence = sentence.toLowerCase();		
		String[] wordsList = sentence.split(" ");
		
		HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
		HashMap<Character, Integer> alphabetFrequencyMap = new HashMap<>();
		
		for(String word: wordsList) {
			if(wordFrequencyMap.containsKey(word)) {
				wordFrequencyMap.put(word, wordFrequencyMap.get(word)+1);
			}else {
				wordFrequencyMap.put(word, 1);
			}
			
			char[] alphabetsArray = word.toCharArray();
			
//			for(int index=0; index<word.length(); index++) {
//				char charAtIndex = word.charAt(index);
//				if(alphabetFrequencyMap.containsKey(charAtIndex)) {
//					alphabetFrequencyMap.put(charAtIndex, alphabetFrequencyMap.get(charAtIndex)+1);
//				}else {
//					alphabetFrequencyMap.put(charAtIndex, 1);
//				}
//			}
			
			for(char alphabet: alphabetsArray) {
				if(alphabetFrequencyMap.containsKey(alphabet)) {
					alphabetFrequencyMap.put(alphabet, alphabetFrequencyMap.get(alphabet)+1);
				}else {
					alphabetFrequencyMap.put(alphabet, 1);
				}
			}
		}
		
		System.out.println(wordFrequencyMap);
		System.out.println(alphabetFrequencyMap);
		
		System.out.println("----------------------------------------");
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("A", 8);
		treeMap.put("X", 83);
		treeMap.put("I", 9);
		treeMap.put("R", 17);
		
		System.out.println(treeMap);
		
		System.out.println(treeMap.higherKey("B"));
		System.out.println(treeMap.ceilingKey("I"));
		System.out.println(treeMap.lowerKey("X"));
		System.out.println(treeMap.floorKey("X"));
		
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.lastEntry());
		
		System.out.println(treeMap.subMap("B", "X"));
		
		System.out.println(treeMap.subMap("B",true, "X", true));
		
	}
}
