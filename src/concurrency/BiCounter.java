package concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	// At an instance of time, ONLY one thread will be executing the synchronized code on the instance
	// If more synchronized code on instance ==> significant impact on Performance
	
	synchronized public void incrementI() {
		i++;
	}
	
	synchronized public void incrementJ() {
		j++;
	}
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
}
