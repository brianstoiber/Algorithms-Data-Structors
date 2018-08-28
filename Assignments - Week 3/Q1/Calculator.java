public class Calculator {
	
	public int product(int n, int m) throws Exception{
		
		// setting up base cases
		if(n==0 || m == 0){
			return 0;
		}
		
		// error checking in case a negative number is used
		if(n < 0 || m < 0){
			throw new IllegalArgumentException("Expected only positive integers as arguments");
		}
		// recursive algorithm
		return n + product(n, m-1);
	}

}
