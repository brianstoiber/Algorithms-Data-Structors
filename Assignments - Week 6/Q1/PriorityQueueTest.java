import java.util.Iterator;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PositionalList<Integer> sequenceList = new LinkedPositionalList<>();
		PriorityQueue<Integer, Integer> queue = new MyPriorityQueueImplimintation<>();
		
		// Phase 1: insert sequence into a priority queue
		sequenceList.addLast(7);
		sequenceList.addLast(4);
		sequenceList.addLast(8);
		sequenceList.addLast(2);
		sequenceList.addLast(5);
		sequenceList.addLast(3);
		sequenceList.addLast(9);
		
		System.out.println("Sequence input into the list (Phase 1): ");
	
		Iterator<Integer> iter = sequenceList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next() + "  ");
		}
		
		System.out.println();
		System.out.println("Begin sorting of list using an empty priorityQueue");
		
		pqSort.pqSort(sequenceList, queue);
		
		iter = sequenceList.iterator();
		
		System.out.println();
		System.out.println("Sequence after sort");
		
		while(iter.hasNext()){
			System.out.print(iter.next() + "  ");
		}
	}

}
