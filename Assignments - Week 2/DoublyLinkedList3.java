package week2;

public class DoublyLinkedList3 {

	public static void main(String[] args) {

		// creation of doubly linked list and inserting nodes into the list
		DoublyLinkedList3 dllist = new DoublyLinkedList3();
		dllist.insertFirst(4);
		dllist.insertLast(17);
		dllist.insertLast(8);
		dllist.insertLast(23);
		dllist.insertLast(47);
		dllist.insertFirst(22);

		// display doubly linked list and output number of nodes in it
		dllist.displayList();
		System.out.println();
		System.out.println("There are " + size + " nodes in this Doubly Linked List.");
	}

	// set head and tail, and initialize size to zero
	private ListNode head;
	private ListNode tail;
	static int size = 0;

	// creating next and prev
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode prev;

		// constructor
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	// constructor
	public DoublyLinkedList3() {
		this.head = null;
		this.tail = null;
	}

	// isEmpty method to determine if the list is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
	// size method to return length of the list and to hold the size variable that is 
	//    incremented in the insertFirst and insertLast methods
	public int size() {
		return size;
	}

	// insertFirst method to insert a node at the beginning of the list
	public void insertFirst(int value) {

		ListNode newNode = new ListNode(value);

		if (isEmpty()) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}

	// insert a node as the last node
	public void insertLast(int value) {

		// create new node
		ListNode newNode = new ListNode(value);

		// check to see if node is empty, if so, assign newNode to head, else to
		// tail.next
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}

		// assign tail to newNode.prev, set tail to newNode, increment size
		newNode.prev = tail;
		tail = newNode;
		size++;
	}

	// display the doubly linked list
	public void displayList() {

		// check to see if head is null (zero nodes)
		if (head == null) {
			return;
		}

		// assign node head to temp variable
		ListNode temp = head;

		// while temp is not empty, print each node, then assign temp.next to temp
		while (temp != null) {
			System.out.print(" [ " + temp.data + " ] ");
			temp = temp.next;
		}
	}
}
