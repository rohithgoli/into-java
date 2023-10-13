
public class OperatorsDemo {
	public static void main(String args[]) {
		
		// Arthimetic operators
		int num1=5, num2=2;
		int numSum = num1 + num2; // 7
		int numDiff = num1 - num2; // 3
		int numProduct = num1*num2; // 10
		double numDivison = (double)num1/num2; // 2.5;
		int numRemainder = num1%num2;
		
		System.out.println(numSum);
		System.out.println(numDiff);
		System.out.println(numProduct);
		System.out.println(numDivison);
		System.out.println(numRemainder);
		
		num2 += num1;
		System.out.println(num2);
		num2++;
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		
		int num3 = ++num2; // pre-increment
		System.out.println(num3);
		System.out.println(num2);
		
		int num4 = num2++; //post-increment
		System.out.println(num4);
		System.out.println(num2);
	}
}
