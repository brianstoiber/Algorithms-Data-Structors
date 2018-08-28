import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// prompt user to enter five names and listen for user input
		System.out.println("Enter five names to be added to the list");
		Scanner S = new Scanner(System.in);

		// loop 5 times to have user enter names and assign value to next location
		for (int i = 0; i < 5; i++) {
			String value = S.next();
			list.add(i, value);
		}

		// prompt user for name to search for in the list
		System.out.println("Enter a name to search the list");

		// iterator used to traverse the list for the given name
		String givenName = S.next();
		Iterator<String> iterator = list.iterator();
		boolean found = false;

		// continue looking and if found, output that the name was found
		while (iterator.hasNext()) {
			if (iterator.next().equals(givenName)) {
				System.out.println("The name " + givenName + " has been found in the list");
				found = true;
			}
		}

		// if the name is not found, output it has not been found
		if (!found) {
			System.out.println("The name " + givenName + " has not been found in the list.");
		}

	}

}
