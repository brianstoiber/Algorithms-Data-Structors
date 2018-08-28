package W3Q4;

public class ArrayQueue<E> implements Queue<E> {

	// Array-based Queue in Java
	public static final int CAPACITY = 1000; // default array capacity
	private E[] data; // generic array used for storage
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements

	public ArrayQueue() {
		this(CAPACITY);
	} // constructs queue with default capacity

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) { // constructs queue with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}

	public int size() {
		return sz;
	}

	public boolean isEmpty() {
		return (sz == 0);
	}

	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length)
			throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length; // use modular arithmetic
		data[avail] = e;
		sz++;
	}

	public E dequeue() {
		if (isEmpty())
			return null;
		E answer = data[f];
		data[f] = null; // dereference to help garbage collection
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
	
	public E rotate(E e){
		
		// if parameter is sent, then enqueue. Else dequeue 
		boolean isEnque = (e != null); 
		E result = null;
		if(isEnque){
			
			// checking size of queue to determine if there is available space
			if (sz == data.length)
				throw new IllegalStateException("Queue is full");
			
			// determining the index location sing mod
			int index = (f + sz) % data.length; 
			data[index] = e;
			sz++;
		}else {
			if(isEmpty()) return null;
			result = data[f];
			
			// checking difference to help garbage collection
			data[f] = null; 
			f = (f + 1) % data.length;
			
			// queue is empty, front & rear initialize to zero
			if(f == sz && f != 0){
				f = sz = 0;
			}
		}
		return result;
	}

	@Override
	public E first() {
		return null;
	}
	
	// printQueue used to print out the queue and see operations 
	public void printQueue(){
		System.out.println("First: " + f);
		System.out.println("Last: " + sz);
		for(int i = f; i < sz; i ++)
			System.out.print(data[i] + " ");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
