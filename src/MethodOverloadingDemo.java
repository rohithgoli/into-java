
class Casio {
	
	int num1;
	int num2;
	String operation;
	
	public Casio() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	
	public Casio(int i) {
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}
	
	public Casio(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}
	
	public Casio(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
		
		
	}
	
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}

public class MethodOverloadingDemo {
	
	public static void main(String args[]) {
		Casio obj = new Casio();
		obj.add(5, 6);
		
		Casio obj1 = new Casio(5, 3, "Add");
	}
	
}
