package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		// Get Lock for i
		lockForI.lock();
		i++;
		// Release Lock for i
		lockForI.unlock();
	}
	
	public void incrementJ() {
		// Get Lock for j
		lockForJ.lock();
		j++;
		// Release Lock for j
		lockForJ.unlock();
	}
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
}
