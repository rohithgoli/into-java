
class Calc1 {
	int num1;
	int num2;
	int result; // instance variable
	
	public int perform(int extra, int prod) // local variable
	{
		result = (num1 + num2 + extra)*prod;
		if(result>50)
			return 1;
		else
			return 0;
	}
}

public class ObjectDemo2 {
	public static void main(String args[]) {
		Calc1 obj = new Calc1(); // Constructor
		
		obj.num1 = 4;
		obj.num2 = 3;
		
		int k = obj.perform(2,  3);
		
		System.out.println(k);
	}
}
