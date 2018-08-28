package week2;

import java.util.Arrays;

public class Repeats1 {

	public static void main(String[] args) {

		int count = 0; // keeps count of number of times 2 is repeated
		
		// initialize array with the number 2 repeated multiple times
		int A[] = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
				41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
				61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
				81, 82, 83 ,84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 2};
		
		// sorts array in the case that numbers are out of order
		// Note: the 2 after the number 100, here that 2 will be moved up to the beginning of the array 
		// 		 with the rest of the 2s
		Arrays.sort(A);
		
		// initialize for loop to parse array index through the array
		for (int i = 1; i < A.length; i++) {
			
			// parses through array comparing each number to the previous number
			// if previous number (i - 1) is the same as current number (i), increment count
			if (A[i - 1] == A[i]) {
				count++;
			}
		}
		
		// print out count + 1 since the first instance of the number does not increment the count
		// 		because it doesn't have anything to compare itself to.
		System.out.println(count + 1);
	}
}