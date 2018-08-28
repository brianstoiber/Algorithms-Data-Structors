import java.awt.Graphics;
import java.awt.*;

public class Circle {

	private int diameter, x, y;
	private Color color;

	// -----------------------------------------------------------
	// constructor: sets up this circle with the specified values
	// -----------------------------------------------------------
	public Circle(int size, Color shade, int upperX, int upperY) {
		diameter = size;
		color = shade;
		x = upperX;
		y = upperY;
	}

	// -----------------------------------------------------------
	// draws this circle in the specified graphics context
	// -----------------------------------------------------------
	public void draw(Graphics page) {
		page.setColor(color);
		page.fillOval(x, y, diameter, diameter);
	}

	// -----------------------------------------------------------
	// diameter mutator
	// -----------------------------------------------------------
	public void setDiameter(int size) {
		diameter = size;
	}

	// -----------------------------------------------------------
	// color mutator
	// -----------------------------------------------------------
	public void setColor(Color shade) {
		color = shade;
	}

	// -----------------------------------------------------------
	// X mutator
	// -----------------------------------------------------------
	public void setX(int upperX) {
		x = upperX;
	}

	// -----------------------------------------------------------
	// diameter accessor
	// -----------------------------------------------------------
	public int getDiamter() {
		return diameter;
	}

	// -----------------------------------------------------------
	// color accessor
	// -----------------------------------------------------------
	public Color getColor() {
		return color;
	}

	// -----------------------------------------------------------
	// X accessor
	// -----------------------------------------------------------
	public int getX() {
		return x;
	}

	// -----------------------------------------------------------
	// Y accessor
	// -----------------------------------------------------------
	public int getY() {
		return y;
	}
}
