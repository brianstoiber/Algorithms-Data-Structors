public class CalculatorTest {

	public static void main(String[] args) throws Exception {
		Calculator C = new Calculator();
		
		// print out math problem and the product of two positive integers
		System.out.println("6 x 3 = " + C.product(6, 3));
		System.out.println("51 x 12 = " + C.product(51, 12));
		System.out.println("6 x 4 = " + C.product(6, 4));
		System.out.println("6 x 5 = " + C.product(6, 5));
		System.out.println("-3 x 8 = " + C.product(-3, 8));
	}
}
