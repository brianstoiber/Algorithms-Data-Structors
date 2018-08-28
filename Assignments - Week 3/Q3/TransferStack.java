import java.util.Stack;

public class TransferStack {

	public static void main(String[] args) {
		
		// initializing stacks S and T
		Stack<Integer> S = new Stack<Integer>();
		Stack<Integer> T = new Stack<Integer>();
		
		// pushing numbers onto the stack S
		S.push(5);
		S.push(9);
		S.push(23);
		S.push(8);
		S.push(63);
		S.push(2);
		S.push(10);
		S.push(61);
		S.push(52);
		S.push(78);
		S.push(46);
		S.push(85);
		S.push(3);
				
		// printing stack S
		System.out.println("Stack S: " + S);
		
		// performing transfer from stack S to stack T
		transfer(S, T);
		
		// printing stack T
		System.out.println("Stack T: " + T);
	}

	public static void transfer(Stack<Integer> S, Stack<Integer> T) {
		
		// while loop to run until S is empty
		while (!S.empty()) {
			int temp = (int) S.pop(); 	// popping top element from S and settings it to temp
			T.push(temp);				// push temp integer into stack T
		}
	}
}