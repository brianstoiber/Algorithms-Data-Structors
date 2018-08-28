import java.net.Socket;
import java.util.Scanner;

public class TrimArray {

	public static void main(String[] args) {

		// ask user for size of list and create it
		System.out.println("Enter the number of strings to create an ArrayList: ");
		Scanner S = new Scanner(System.in);
		int size = S.nextInt();
		List<String> list = new ArrayList<>(size);

		// ask user to enter strings for each element in the list
		System.out.println("Enter the strings to be added to the ArrayList");

		// loop the number of times the user entered for the list size and add it
		for (int i = 0; i < size; i++) {
			list.add(i, S.next());
		}

		// add 2 more strings so that length of array is doubled.
		System.out.print("Would you like to add more strings to the ArrayList Y/N: ");
		String answer = S.next();
		// enter if-then statement
		if (answer.equalsIgnoreCase("Y")) {
			// prompt use how many more strings they want to enter
			System.out.println("How many more strings would you like to enter: ");
			int more = S.nextInt();

			System.out.println("Enter the strings to be added to the ArrayList");
			int sum = more + size;
			for (int i = size; i < sum; i++) {
				list.add(i, S.next());
			}
			// trim list using trimToExactSize.
			list.trimtoExactSize();
			System.out.println("The size of the ArrayList is now: " + list.size());
		} else {
			System.out.println("Have a nice day!");
		}
		S.close();

	}

}