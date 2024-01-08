package exceptionHandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}
	
	private static void method2() {
		try {
			int[] numbers = {1, 2};
			int number = numbers[3];
			String name = null;
			name.length();
			System.out.println("Method2 ended");
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}

	}
	
}
