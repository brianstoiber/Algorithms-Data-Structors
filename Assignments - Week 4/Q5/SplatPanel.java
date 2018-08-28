import javax.swing.*;
import java.awt.*;

public class SplatPanel extends JPanel {

	private Circle circle1;
	public SplatPanel() {
		this(30, Color.red, 70, 35);
	}
	
	public SplatPanel(int size, Color color, int upperX, int upperY){
		circle1 = new Circle(size, color, upperX, upperY);
		setPreferredSize(new Dimension(300, 200));
		setBackground(Color.black);
	}
	
	//-------------------------------------------------------------
	// draws this panel by requesting that each circle draw itself.
	//-------------------------------------------------------------
	
	public void paintComponent(Graphics page) {
		
		super.paintComponent(page);
		circle1.draw(page);
	}
	
}
