
class CalciBasic {
	public int add(int i, int j) {
		return i+j;
	}
}

class CalciAdvanced extends CalciBasic {
	public int sub(int i, int j) {
		return i-j;
	}
}

class CalciVeryAdvanced extends CalciAdvanced {
	public int multi(int i, int j) {
		return i*j;
	}
}

public class InheritanceDemo {
	public static void main(String args[]) {
		CalciVeryAdvanced calci = new CalciVeryAdvanced();
		System.out.println(calci.add(3,  5));
		System.out.println(calci.sub(5,  3));
		System.out.println(calci.multi(5,  7));
	}
}
