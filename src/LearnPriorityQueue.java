import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(100);
		pq.offer(12);
		pq.offer(48);
		pq.offer(36);
		pq.offer(24);
		
		System.out.println(pq); // [12, 24, 48, 100, 36] --> because minheap is being implemented (Don't bother about the end, observe only start)
		
		System.out.println(pq.poll()); // 12 --> element with highest priority will come out
		
		System.out.println(pq); // [24, 36, 48, 100]
		
		System.out.println(pq.peek());
		
		Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // we can also use anonymous comparator
		
		pq2.offer(100);
		pq2.offer(12);
		pq2.offer(48);
		pq2.offer(36);
		pq2.offer(24);
		
		System.out.println(pq2);
		
		System.out.println(pq2.poll());
		
		System.out.println(pq2);
		
		System.out.println(pq2.peek());
	}
}
