
public class IterationDemo {
	// while, do-while, for, for-each
	public static void main(String args[]) {
		
		int num = 1; // initialization
		while(num <= 5) { //condition
			System.out.println("Hello World!!!");
			num++; // updation
		}
		
		
		int num2 = 9;
		do {
			System.out.println("Hello World");
			num2++;
		}while( num2 <= 5 );
		
		
		for(int num3=2; num3<=5; num3++) {
			System.out.println("Hello World !!!");
		}
		
		
		for(int rowCount=0; rowCount<=3; rowCount++) {
			for(int colCount=0; colCount<=3; colCount++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int rowCount=0; rowCount<=10; rowCount++) {
			if(rowCount%2 != 0) {
				continue;
			}
			System.out.println(rowCount);
		}
		
		
		for(int indexCount=1; indexCount<10; indexCount++) {
			if(indexCount%5 == 0) {
				break;
			}
			System.out.println(indexCount);
		}
	}
}
