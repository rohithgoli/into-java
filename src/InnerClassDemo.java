
class Outer {	// Outer.class
	int a;
	public void show() {
		
	}
	
	class Inner {	// Outer$Inner.class
		public void display() {
			System.out.println("in display");
		}
	}
	
	static class AnotherInner {
		public void anotherDisplay() {
			System.out.println("inside static - in another display");
		}
	}
}

public class InnerClassDemo {	// InnerClassDemo.class
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj2 = obj.new Inner();
		obj2.display();
		
		Outer.AnotherInner obj3 = new Outer.AnotherInner();
		obj3.anotherDisplay();
	}
}
