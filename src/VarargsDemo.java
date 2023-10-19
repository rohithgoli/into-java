
class CasioCalci {
	public int add(int ... n) { // n = {1, 2, 3, 4, 5, 6} Variable Length Arguments
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		return sum;
	}
}

public class VarargsDemo {
	public static void main(String args[]) {
		
		CasioCalci calci = new CasioCalci();
		
		System.out.println(calci.add(3, 5));
		
		System.out.println(calci.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
	}
}
