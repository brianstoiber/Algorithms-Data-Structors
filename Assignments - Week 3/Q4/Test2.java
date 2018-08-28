package W3Q4;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
				
		// rotate queue
		// uses similar inputs as provided code
		// using some new formatting and printQueue() method to show first/last index positions
		Queue<Integer> rQueue = new ArrayQueue<>();
		
		System.out.println("Queue index positions: ");
		rQueue.printQueue();								// prints First/Last index positions
		System.out.println();
		
		rQueue.rotate(5); 									// contents: (5)
		System.out.println("Added 5");
		rQueue.rotate(3); 									// contents: (5, 3)
		System.out.println("Added 3");
		System.out.println();
		
		System.out.println("Queue index positions & contents: ");
		
		rQueue.printQueue();
		System.out.println("\n");

		System.out.println("Queue size: " + rQueue.size() + "\n"); 		// contents: (5, 3) outputs 2
	
		System.out.print("Rotate: ");
		System.out.println(rQueue.rotate(null) + "\n");		// contents: (3) outputs 5
		
		System.out.println("Queue index positions & contents: ");
		rQueue.printQueue();
		System.out.println("\n");
		
		System.out.print("Is the queue empty? ");
		System.out.print(rQueue.isEmpty() + "\n"); 			// contents: (3) outputs false
		
		System.out.print("\n" + "Rotate: ");
		System.out.println( + rQueue.rotate(null));			// contents: () outputs 3
		
		
		System.out.println("\n" + "Queue index positions & contents: ");
		rQueue.printQueue();
		
		System.out.print("\n" + "Is the queue empty? ");
		System.out.println(rQueue.isEmpty());				// contents: () outputs true
		
		System.out.print("\n" + "Rotate: ");
		System.out.println(rQueue.rotate(null) + "\n"); 	// contents: () outputs null
		
		
		rQueue.rotate(7);									// contents: (7)
		System.out.println("Added 7");
		rQueue.rotate(9); 									// contents: (7, 9) outputs 7
		System.out.println("Added 9");
		
		System.out.println("\n" + "Queue size: " + rQueue.size());
		
		System.out.println("\n" + "Queue index positions & contents: ");
		rQueue.printQueue();
		System.out.println();
		
		rQueue.rotate(4);									// contents: (7, 9, 4)
		System.out.println("\n" + "Added 4");
		
		System.out.println("\n" + "Queue size: " + rQueue.size());	// contents: (7, 9, 4) outputs 3
		
		System.out.print("\n" + "Rotate: ");
		System.out.println(rQueue.rotate(null) + "\n");			// contents: (9, 4) outputs 7
		
		
		
		rQueue.rotate(6); 									// contents: (9, 4, 6)
		System.out.println("Added 6");
		rQueue.rotate(8); 									// contents: (9, 4, 6, 8)
		System.out.println("Added 8");
		
		System.out.print("\n" + "Rotate: ");
		System.out.println(rQueue.rotate(null)); 			// contents: (4, 6, 8) outputs 9
		
		
		System.out.println("\n" + "Queue index positions & contents: ");
		rQueue.printQueue();
	}
}























