package tipsTricks;

// public , protected, (default), private --> for Encapsulation

final class FinalClass { // FinalClass can't be inherited further
	
}

class SomeClass {
	final public void doSomething() { // can't override final method from its sub-class
		
	}
	
	public void doOtherThing(final int number) {
		// final argument value cannot be changed
	}
}

class ExtendingClass extends SomeClass {
	
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		
		int number = 6;
		final int num = 8; // final variable value can be assigned ONLY once
		number = 10;
	}
	
}
