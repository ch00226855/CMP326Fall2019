import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JComponent;

public class Canvas extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.RED);
		g2D.setFont(new Font("Serif", Font.BOLD, 50));
		g2D.drawString("A Drawing", 0, 50);
		
		g2D.setColor(Color.BLUE);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(174, 69, 575, 404);
		
		g2D.drawOval(464, 76, 346, 307);
	}

}
