
public class WrapperDemo {
	public static void main(String args[]) {
		int i=5; // Primitive datatype
		Integer ii = new Integer(6); // Wrapper class
		
		Integer iii = new Integer(i); // Boxing - Wrapping
		int p = iii.intValue(); // Unboxing
		
		Integer value = i; // AutoBoxing
		
		int kk = value; //AutoUnboxing
		
		String str1 = "234";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
	}
}
