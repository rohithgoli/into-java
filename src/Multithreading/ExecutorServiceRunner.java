package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread {
	
	private int index;
	
	public Task(int index) {
		this.index = index;
	}
	
	public void run() {
		System.out.println("\n Task "+ index + " started");
		
		for(int count = 100*index; count <= 100*index + 99; count++) {
			System.out.print(count + " ");
		}
		System.out.println("\n Task "+ index + " ended");
	}
}


public class ExecutorServiceRunner {
	
	public static void main(String[] args) {
		
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));

		executorService.shutdown();
	}
}
