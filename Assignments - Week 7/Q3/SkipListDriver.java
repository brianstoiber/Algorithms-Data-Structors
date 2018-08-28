public class SkipListDriver {

	private static SkipList list = new SkipList();

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			list.put("" + i * 10, i * 10);
		}
		
		System.out.println("Printing vertical list:");
		list.printVertical();
		System.out.println();
		System.out.println();
		
		System.out.println("Printing horizontal list:");
		list.printHorizontal();
		System.out.println();
		System.out.println();
		
		// Target value is 9927
		System.out.println("Trying to find 27 in skiplist...");
		SkipListEntry found = list.findEntry("20");
		if (found != null) {
			System.out.println("Found entry.");
			System.out.println();
			
			System.out.println("Printing row of 20");
			System.out.println(list.getOneRow(found));
			System.out.println();
			
			System.out.println("Printing column of 20");
			System.out.println(list.getOneColumn(found));

		} else {
			System.out.println("Could not find entry 3");
		}

	}

}
