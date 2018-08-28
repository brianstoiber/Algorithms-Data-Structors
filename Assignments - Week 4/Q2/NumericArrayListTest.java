import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumericArrayListTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// prompt user to enter 10 numbers and listen for user input
		Scanner S = new Scanner(System.in);
		System.out.println("Enter 10 numbers to be added to the list");

		// loop 10 times to have user enter numbers and assign value to next location
		for (int i = 0; i < 10; i++) {
			int value = S.nextInt();
			list.add(i, value);
		}

		// prompt user for name to search for in the list
		System.out.println("Enter a number to search the list");

		// iterator used to traverse the list for the given number
		Integer givenNumber = S.nextInt();
		Iterator<Integer> iterator = list.iterator();
		boolean found = false;

		// continue looking and if found, output that the number was found
		while (iterator.hasNext()) {
			if (iterator.next() == givenNumber) {
				System.out.println("The number " + givenNumber + " has been found in the list");
				found = true;
			}
		}

		// if the number is not found, output it has not been found
		if (!found) {
			System.out.println("The number " + givenNumber + " has not been found in the list.");
		}

	}

}
