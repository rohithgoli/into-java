
class Calc {
	// variables
	int num1;
	int num2;
	int result;
	
	
	//methods
	public void perform() {
		// perform --> method name
		// void --> return type
		// public --> access modifier
		result = num1 + num2;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
//		Calc obj; // a reference
//		obj = new Calc();
		
		Calc obj = new Calc();
		
		obj.num1 = 3;
		obj.num2 = 6;
		
		obj.perform();
		
		System.out.println(obj.result);
	}
}
