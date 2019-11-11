import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class ChessBoard extends JComponent implements MouseListener {
	
	int squareSize; // the size of a single square
	int xBoard;
	int yBoard; // the x and y coordinate of the upper-left corner of the board.
	
	// Add a piece on the board
	int xPiece;
	int yPiece;
	
	public ChessBoard(int squareSize, int xBoard, int yBoard) {
		this.squareSize = squareSize;
		this.xBoard = xBoard;
		this.yBoard = yBoard;
		
		// Pub the piece on the first square
		this.xPiece = xBoard;
		this.yPiece = yBoard;
		
		// Ask the class to listen to mouse events
		addMouseListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
//		// Let's draw a single white square
//		g2D.setColor(Color.WHITE);
//		g2D.fillRect(xBoard, yBoard, squareSize, squareSize);
		
//		// Let's draw the 8 squares in the first row.
//		int x = xBoard;
//		int y = yBoard;
//		for (int i = 0; i < 8; i++) {
//			// When i = 0, 2, 4, 6, color is white
//			// When i = 1, 3, 5, 7, color is black
//			if (i % 2 == 0) { // i = 0, 2, 4, 6
//				g2D.setColor(Color.LIGHT_GRAY);
//			} else {
//				g2D.setColor(Color.BLACK);
//			}
//			
//			g2D.fillRect(x, y, squareSize, squareSize);
//			
//			// update x and y
//			x += squareSize;
//		}
		
		// Let's draw the entire 8*8 board
		int x = xBoard;
		int y = yBoard;
		for (int i = 0; i < 8; i++) { // use i as row index
			for (int j = 0; j < 8; j++) { // use j as column index
				// Here we should draw the j-th block on the i-th row
				
				// Decide the color
				if ((i + j) % 2 == 0) {
					g2D.setColor(Color.WHITE);
				} else {
					g2D.setColor(Color.BLACK);
				}
				
				// Draw the square
				g2D.fillRect(x, y, squareSize, squareSize);
				
				// Update x and y
				x += squareSize;
			}
			// Update x and y for the next row
			x = xBoard;
			y += squareSize;
		}
		
		// Draw the piece as a circle
		g2D.setColor(Color.RED);
		g2D.fillOval(xPiece, yPiece, squareSize, squareSize);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(); 
		int y = e.getY(); // get the coordinates of the mouse click.
		xPiece = x;
		yPiece = y;
		repaint(); // ask the JComponent to be drawn again.
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
