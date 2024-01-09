package concurrency;

public class Counter {
	int i = 0;
	
	public int getI() {
		return i;
	}

	synchronized public void increment() {
		i++;
		
		// behind the scenes if multiple threads are implementing then each will perform below operations
		// get i
		// increment
		// set i
		// We can recognize that it is not a thread safe operation AS method can't be run safely by multiple threads
		// So, using synchronized allows to make the method thread safe but offer certain problems
	}
}
