
class M {
	public void show() {
		System.out.println("in M");
	}
}

class N extends M {
	public void show() {
		super.show();
		System.out.println("in N");
	}
}

class O extends M {
	public void show() {
		System.out.println("in O");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		N obj1 = new N();
		obj1.show();
		
		M obj2 = new N(); // runtime polymorphism
		obj2.show();
		
		obj2 = new O();	// Dynamic Method Dispatch through runtime polymorphism
		obj2.show();	// Dynamic Method Dispatch
	}
}
