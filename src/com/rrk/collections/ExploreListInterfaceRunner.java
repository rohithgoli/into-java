package com.rrk.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Iterator;

public class ExploreListInterfaceRunner {
	public static void main(String[] args) {
	
		List<String> animals = List.of("Ape", "Bear", "Cat", "Dog", "Elephant");
		
		// Iterating elements
		
		for(int index = 0; index < animals.size(); index++) {
			System.out.println(animals.get(index));
		}
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		Iterator<String> animalIterator = animals.iterator();
		while(animalIterator.hasNext()) {
			System.out.println(animalIterator.next());
		}
		
		// Operations on elements
		
		List<Integer> numbers = List.of(23, 234, 43, 53, 24);  
		ArrayList<Integer> ages = new ArrayList<>(numbers);
		
//		ages.remove(234);
		ages.remove(Integer.valueOf(234));
		System.out.println(ages);
		
		List data = List.of("abc", 43, 2.4, 'a');
		System.out.println(data);
		
//		List<String> strData = List.of(4, "ade", 44.2);
		
		ages.add(22);
		ages.remove(Integer.valueOf(53));
		
		
		// Sort operations
		
		Collections.sort(ages);
		System.out.println(ages);
//		ages.sort();
	}
}
