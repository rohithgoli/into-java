package com.rrk.collections;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExploreSetInterfaceRunner {

	public static void main(String[] args) {
	
		Set<Integer> numbers = new HashSet<>();	// No order(Inserted/sorted) is maintained
		
		numbers.add(358343);
		numbers.add(234);
		numbers.add(543);
		numbers.add(23);
		
		System.out.println(numbers);	
	
		Set<Integer> numbersLinkedHashSet = new LinkedHashSet<>(); // Inserted order is maintained
		
		numbersLinkedHashSet.add(358343);
		numbersLinkedHashSet.add(234);
		numbersLinkedHashSet.add(543);
		numbersLinkedHashSet.add(23);
		
		System.out.println(numbersLinkedHashSet);
		
		Set<Integer> numbersTreeSet = new TreeSet<>();	// Sorted order is maintained
		
		numbersTreeSet.add(358343);
		numbersTreeSet.add(234);
		numbersTreeSet.add(543);
		numbersTreeSet.add(23);
		
		System.out.println(numbersTreeSet);
		
		
		
		// Given a List of Characters
		
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		// Provide ONLY Unique Characters
		
		Set<Character> charactersHashSet = new HashSet<>(characters);
		System.out.println(charactersHashSet);
		
		// Provide ONLY Unique Characters maintaining Order of Insertion
		
		Set<Character> charactersLinkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(charactersLinkedHashSet);
		
		// Provide ONLY Unique Characters in sorted order(ascending);
		
		Set<Character> charactersTreeSet = new TreeSet<>(characters);
		System.out.println(charactersTreeSet);
		
		
		// TreeSet - NavigableSet Interface
		
		TreeSet<Integer> numbersNavigable = new TreeSet<>(Set.of(24, 54, 35, 50, 65, 99));
		
		// number less than or equal 35
		System.out.println(numbersNavigable.floor(35));
		
		// number less than 35
		System.out.println(numbersNavigable.lower(35));
		
		// number upper than or equal 35
		System.out.println(numbersNavigable.ceiling(35));
		
		// number upper than 35
		System.out.println(numbersNavigable.higher(35));
		
		// numbers between 20 (inclusive lower limit) and 80 (upper limit is exclusive)
		System.out.println(numbersNavigable.subSet(20, 80));
		System.out.println(numbersNavigable.subSet(35,  65));
		
		System.out.println(numbersNavigable.subSet(35, true, 65, true));
		
		// headSet --> all elements less than target
		System.out.println(numbersNavigable.headSet(50));
		
		// tailSet --> all elements from target
		System.out.println(numbersNavigable.tailSet(50));
	}
	
}
