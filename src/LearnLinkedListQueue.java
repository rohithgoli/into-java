import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); // Here LinkedList is implementing Queue Interface
		
		queue.offer(14);
		queue.offer(28);
		queue.offer(42);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}
}
