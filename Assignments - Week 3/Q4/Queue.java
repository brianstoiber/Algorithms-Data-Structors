package W3Q4;

public interface Queue<E> {
	int size();
	boolean isEmpty();
	void enqueue(E e);
	E first();
	E dequeue();
	E rotate(E e);
	void printQueue();
}
