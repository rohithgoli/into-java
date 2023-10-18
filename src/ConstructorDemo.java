
class Calc2 {
	int num1;
	int num2;
	int result;
	
	public Calc2() {
		System.out.println("Inside Default Constructor");
		num1 = 5;
		num2 = 3;
	}
	
	public Calc2(int a) {
		System.out.println("Constructor OverLoading -- Inside Constructor with int argument");
		num1 = a;
		num2 = a;
	}
	
	public Calc2(double b, int c) {
		System.out.println("Constructor OverLoading -- Inside Constructor with double argument");
		num1 = (int) b;
		num2 = c;
	}
}

public class ConstructorDemo {
	public static void main(String args[]) {
		
		Calc2 obj1 = new Calc2();
		
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		
		Calc2 obj2 = new Calc2(8);
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		
		Calc2 obj3 = new Calc2(5.9, 2);
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
	}
}
