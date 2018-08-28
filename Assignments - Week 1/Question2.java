package Week1;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		// start scanner utility
		Scanner scanner = new Scanner(System.in);

		// declare variables
		int n = 0;
		
		// request user to enter two values for m and n
		System.out.print("Enter a number: ");
		n = scanner.nextInt();

		// close scanner
		scanner.close();

		// call isMultiple method
		isMultiple(n);
		
	}


	public static void isMultiple(int num) {
		// declare variables
		int sum = 0;

		// loop creating a counter (i) to run through num iterations 
	    for (int i = 1; i <= num; i++) {
	    	
	    	// summing each number <= num
	    	sum = sum + i;	
	    }
	    
	    // printing the sum of each number <= num  
		System.out.println(sum);
	}
}
