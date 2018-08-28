import java.util.Iterator;

public class MyPriorityQueueImplimintation<K,V>  extends AbstractPriorityQueue<K,V> {
	
	LinkedPositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		PQEntry<K,V> entry = new PQEntry<K,V>(key, value);
		list.addLast(entry);
		return entry;
	}

	@Override
	public Entry<K,V> min() {
		Iterator<Entry<K, V>> iter = list.iterator();
		Entry<K,V> min = iter.next();
		while(iter.hasNext()){
			Entry<K,V> next = iter.next();
			if(compare(min, next)>0)
				min = next;
		}
		return min;
	}

	@Override
	public Entry<K,V> removeMin() {
		Iterator<Position<Entry<K, V>>> iter = list.positions().iterator();
		Position<Entry<K,V>> position = null;
		Entry<K,V> min = min();
		while(iter.hasNext()){
			Position<Entry<K, V>> current = iter.next();
			if(current.getElement().getKey().equals(min.getKey())){
				position = current;
				break;
			}
		}
		list.remove(position);
		System.out.println();
		System.out.println("Removed: " + min.getKey());
		System.out.println("Contents of priority Queue: ");
		printPriorityQueue();
		System.out.println();
		return min;
	}

	public void printPriorityQueue(){
		Iterator<Position<Entry<K,V>>> iter = list.positions().iterator();
		System.out.print("( ");
		while(iter.hasNext()){
			System.out.print(iter.next().getElement().getKey() + "  ");
		}
		System.out.print(" )");
	}
}
