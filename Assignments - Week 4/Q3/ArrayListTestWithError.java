import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTestWithError {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// prompt user to enter 5 names and listen for user input
		System.out.println("Enter four names");
		Scanner S = new Scanner(System.in);

		// loop 5 times to have user enter names and assign value to next location
		for (int i = 0; i < 4; i++) {
			String name = S.next();
			list.add(i, name);
		}

		// prompt user for position to retrieve value of the list
		System.out.println("Enter the position from which you want the name from");
		int pos = S.nextInt();

		// look for position in the list
		try {
			String output = list.get(pos);
			System.out.println("Position " + pos + " had the name " + output + " in it");
		}

		// if position is out of range, throw error
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
