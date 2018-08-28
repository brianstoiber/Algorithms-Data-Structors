package Week1;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
        // start scanner utility3
	     Scanner scanner = new Scanner(System.in);

		// declare variables
        long m = 0L;
        long n = 0L;

        // request user to enter two values for m and n
        System.out.print("Enter a number for m: ");
        m = scanner.nextLong();

        System.out.print("Enter a number for n: ");
        n = scanner.nextLong();

        // close scanner
        scanner.close();
        
        // call isMultiple method
		isMultiple(m, n);
		
		}
	

	public static void isMultiple(long m, long n) {
		// declare result variable 
		long result = 0L;
		
		// determine it n mod m = 0 and store in result
		result = n % m;
		
		if (result == 0) {
			System.out.println("True: m and n are the same numbers");
		}
		else {
			System.out.println("False:  m and n are different numbers.");
		}
	}
}
