package com.rrk.collections;

import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		return Integer.compare(string1.length(), string2.length());
	}
	
}

public class ExploreQueueInterfaceRunner {
	public static void main(String[] args) {
		
		Queue<String> queue1 = new PriorityQueue<>();
		
		System.out.println(queue1.poll());
		
		queue1.addAll(List.of("Zebra", "Yak", "Tiger", "Monkey", "Ape", "Buffalo", "Rabbit"));
		System.out.println(queue1);
		
		System.out.println(queue1.poll());
		System.out.println(queue1);
		
		System.out.println(queue1.poll());
		System.out.println(queue1);
		
		System.out.println(queue1.poll());
		System.out.println(queue1);
		
		System.out.println(queue1.poll());
		System.out.println(queue1);
		
		System.out.println(queue1.poll());
		System.out.println(queue1);
		
		System.out.println("-------------------------");
		
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		
		System.out.println(queue.poll());
		
		queue.addAll(List.of("Zebra", "Yak", "Tiger", "Monkey", "Ape", "Buffalo", "Rabbit"));
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
