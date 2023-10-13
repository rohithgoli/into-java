
public class VariablesDemo {
	public static void main(String args[]) {
		
		int num = 3_000; // 4 bytes
		num = 5_00_000;
		System.out.println(num);
		
		short num2 = 5_00; // 2 bytes
		byte num3 = 5; // 1 byte
		long num4 = 900000000000000l; // 8 bytes
		
		float percent1 = 5.5f; // 4 bytes
		double percent2 = 5.5; // 8 bytes
		
		char firstChar = 'A';
		firstChar = 66; // ASCII
		System.out.println(firstChar);
		
		double num5 = 5; //  implicit conversion
		System.out.println(num5);
		
		int num6 = (int)5.6; // type casting
		System.out.println(num6);
	}
}
