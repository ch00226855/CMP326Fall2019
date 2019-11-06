import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyComponent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		// A common practice is to convert g to a Graphics2D object
		Graphics2D g2D = (Graphics2D) g;
		
		// Draw something
//		g2D.setColor(Color.PINK);
//		g2D.setFont(new Font("Serif", Font.PLAIN, 20));
//		g2D.drawString("Hello World!", 100, 200);
//		
//		g2D.setColor(Color.GREEN);
//		g2D.drawLine(0, 0, 800, 600);
//		
//		g2D.setColor(Color.MAGENTA);
//		g2D.drawRect(300, 100, 200, 100);
//		
//		g2D.setColor(Color.YELLOW);
//		g2D.fillRect(300, 200, 200, 100);
//		// increase x coordinate will push the object to the right
//		// increase y coordinate will push the object down
//		
//		g2D.setColor(new Color(204, 24, 123));
//		g2D.fillOval(200, 400, 200, 100);
//		
//		g2D.drawRoundRect(600, 400, 50, 100, 10, 10);
//		
//		int[] xCoordinates = {100, 200, 200};
//		int[] yCoordinates = {200, 200, 100};
//		g2D.drawPolygon(xCoordinates, yCoordinates, 3);
		
		g2D.setColor(Color.GREEN);
		g2D.fillRect(10, 10, 500, 150);
		
		g2D.setColor(Color.BLUE);
		g2D.fillRect(10, 170, 300, 150);
		
		g2D.setColor(Color.GRAY);
		g2D.fillRect(10, 330, 700, 150);
		
	}
	
}
