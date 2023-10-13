
public class SelectionDemo {
	public static void main(String args[]) {
		int num1 = 7;
		
		if(num1 == 0) {
			System.out.println("Neither Even nor Odd");
		} else if(num1%2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		if(false) {
			System.out.println("Hello");
		}
		
		System.out.println("Bye");
		
		// Ternary operator --> ?: --> condition ? expression1 : expression2
		
		int num2 = 8, num3 = 10, num4 = 6;
		String string1 = "theta";
		num2 = num3 > 10 ? 12 : 5;
		System.out.println(num2);
		
		
		switch(num2) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("No Match");
		}
		
		
		switch(string1) {
		case "alpha":
			System.out.println("It's alpha");
			break;
		case "beta":
			System.out.println("It's beta");
			break;
		case "gamma":
			System.out.println("It's gamma");
			break;
		case "omega":
			System.out.println("It's omega");
			break;
		case "theta":
			System.out.println("It's theta");
			break;
		default:
			System.out.println("It's out of range");
		}
	}
}
