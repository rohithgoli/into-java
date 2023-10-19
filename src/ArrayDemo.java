
class Student {
	int id;
	String name;
}

public class ArrayDemo {
	public static void main(String args[]) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Student s[] = new Student[4];
		Student specialS[] = {s1, s2, s3, s4};
		
		int nums[] = new int[4];
		
		nums[0] = 8;
		nums[1] = 34;
		nums[2] = 83;
		nums[3] = 23;
		
		for(int i=0; i<4;i++) {
			System.out.println(nums[i]);
		}
		
		int nums2[] = {8, 23, 84, 34};
		
		
		// 2D Array
		
		int a[] = {1, 2, 3, 4};
		int b[] = {2, 4, 6, 8};
		int c[] = {3, 5, 7, 9};
		
		int d[][] = {
						{1, 2, 3, 4},
						{2, 4, 6},
						{3, 5, 7, 9, 10, 11}
					};
		
		for(int rowCount=0; rowCount<d.length; rowCount++) {
			for(int colCount=0; colCount<d[rowCount].length; colCount++) {
				System.out.print(" " + d[rowCount][colCount]);
			}
			System.out.println();
		}
		
		System.out.println(d[0][2]);
		
		// Enhanced for loop
		
		for(int k : a) {
			System.out.println(k);
		}
		
		for(int m[]: d) {
			for(int n : m) {
				System.out.print(" " + n);
			}
			System.out.println("");
		}
	}
}
