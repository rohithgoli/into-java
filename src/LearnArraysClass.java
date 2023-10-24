import java.util.Arrays;

public class LearnArraysClass {
	public static void main(String[] args) {
		
		// binarySearch
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index = Arrays.binarySearch(numbers, 4);
		
		System.out.println("The index of element 4 in the array is: "+ index);
		
		
		// sort
		Integer[] nums = {10, 2, 24, 823, 16, 77, 98, 23, 45, 25};
		Arrays.sort(nums);
		
		// fill
		Arrays.fill(nums, 12);
		
		for(int num: nums) {
			System.out.print(num + " ");
		}
		
		
		
	}
}
