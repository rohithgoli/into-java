package tipsTricks;

class DefaultClass {
	
}

public class NestedClassRunner {
	
	class InnerClass {
		
	}
	
	static class StaticNestedClass {
		
	}
	
	public static void main(String[] args) {
//		InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}
	
}
