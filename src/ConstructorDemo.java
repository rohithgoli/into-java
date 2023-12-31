
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
	
	public Calc2(int num1, int num2, int num3) {
		System.out.println("this keyword significance");
		this.num1 = num1; // this --> current object(instance)
		this.num2 = num2;
		
		System.out.println(this.num1);
		System.out.println(this.num2);
	}
}

public class ConstructorDemo {
	public static void main(String args[]) {
		
		Calc2 obj1 = new Calc2();
		// Hey, java compiler provides above as default constructor ONLY
		// IF we don't have any constructor in a class
		
		// CAUTION: If only parameterized constructor is defined in the class
		// NO DEFAULT CONSTRUCTOR is invoked by the constructor implicitly
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		
		Calc2 obj2 = new Calc2(8);
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		
		// calling with byte instead of int
		Calc2 obj2WithByte = new Calc2((byte)18);
		System.out.println(obj2WithByte.num1);
		System.out.println(obj2WithByte.num2);
		// Whoo ! it does not gave any error, byte got converted to int 
		
		Calc2 obj3 = new Calc2(5.9, 2);
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		
		Calc2 obj4 = new Calc2(7, 8, 9);
		System.out.println(obj4.num1);
		System.out.println(obj4.num2);
	}
}
