package Multithreading;

// extends Thread
// implements Runnable


class Task1 extends Thread {
	
	public void run() {		// signature of method should exactly match

		System.out.println("\n Task1 Started");		
		
		for(int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n Task1 Done");		
	}
	
}


class Task2 implements Runnable {
	
	public void run() {
		
		System.out.println("\n Task2 Started");

		for(int j = 201; j <= 299; j++) {
			System.out.print(j + " ");
		}
		
		System.out.println("\n Task2 Done");
	}
	
}


public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		
		// New
		// RUNNABLE
		// RUNNING
		// BLOCKED / WAITING
		// TERMINATED / DEAD
		
		// task1
		System.out.println("\n Task1 launched");
		Task1 task1 = new Task1(); 
		
		task1.setPriority(1);
		
		task1.start();
		
		System.out.println("\n Task2 launched");
		// task2
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		
		//wait for task1 to complete
		task1.join();
		thread.join();
		
		System.out.println("\n Task3 launched");
		
		
		// task3
		System.out.println("\n Main method started");
		for(int k = 301; k <= 399; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println("\n Main method Done");
	}
}
