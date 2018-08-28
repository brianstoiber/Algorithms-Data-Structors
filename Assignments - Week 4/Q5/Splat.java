import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Splat {

	public static void main(String[] args) {
		
		// create scanner to listen for user input
		Scanner S = new Scanner(System.in);
		
		// prompt user for variables diameter, color, x, and y from user input
		System.out.print("Enter the diameter of a circle in pixels: ");
		int diameter = S.nextInt();
		System.out.println("Enter color for the circle in RGB format");
		System.out.print("R: ");
		int r = S.nextInt();
		System.out.print("G: ");
		int g = S.nextInt();
		System.out.print("B: ");
		int b = S.nextInt();
		System.out.print("Enter x coordinate to position the circle: ");
		int x = S.nextInt();
		System.out.print("Enter y coordinate to position the circle: ");
		int y = S.nextInt();
		
		// create frame to display values above
		JFrame frame = new JFrame("Splat");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SplatPanel(diameter, new Color(r, g, b), x, y));
		frame.pack();
		frame.setVisible(true);
		}
	}