import java.awt.*; // Graphics, Color, Font
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*; // JComponent, ...


public class TicTacToeBoard extends JComponent implements MouseListener {

	private int xBoard;
	private int yBoard; // the starting location of the board
	private int squareSize; // the size of a square on the board
	
	private String player1;
	private String player2; // name of players
	private int player1Score;
	private int player2Score; // number of wins
	
	private String message; // to be displayed in the window
	
	private int[][] pieces; // a 3*3 array containing info for pieces
							// 0: no piece on the square
							// 1: player1's piece on the square
							// 2: player2's piece on the square
	private boolean isPlayer1Turn; // indicate whose turn
	private int victoryType; // 0: game not over
							//1: player1 wins
							//2: player2 wins
							//3: tie
	
	public TicTacToeBoard(String player1, String player2) {
		super();
		xBoard = 75;
		yBoard = 50;
		squareSize = 150; // the size of board would be 450 * 450
		this.player1 = player1;
		this.player2 = player2;
		player1Score = 0;
		player2Score = 0;
		message = "New Game! " + player1 + "'s turn:";
		pieces = new int[][]{
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		}; // the initial board is empty.
//		pieces = new int[3][3];
		addMouseListener(this); // connect this component with mouse
		isPlayer1Turn = true; // by default, player1 goes first.
		victoryType = 0;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		// draw the game board
		drawBoard(g2D);
		
		// draw the pieces
		drawPieces(g2D);
		
		// draw the score board
		drawScoreBoard(g2D);
		
	}
	
	private void drawScoreBoard(Graphics2D g2D) {
		// First rectangle
		g2D.setColor(Color.YELLOW);
		g2D.fillRect(0, 550, 600, 50);
		
		// Second rectangle
		g2D.setColor(Color.CYAN);
		g2D.fillRect(0, 600, 600, 50);
		
		// Third rectangle
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRect(0, 650, 600, 50);
		
		// Draw texts
		g2D.setColor(Color.BLACK);
		g2D.setFont(new Font("Serif", Font.BOLD, 20));
		// First row
		g2D.drawString("Player1: " + player1, 20, 580);
		g2D.drawString("Player2: " + player2, 325, 580);
		// Second row
		g2D.drawString("Player1 score: " + player1Score, 20, 630);
		g2D.drawString("Player2 score: " + player2Score, 325, 630);
		// Third row
		g2D.drawString(message, 20, 680);
	}
	
	private void drawPieces(Graphics2D g2D) {
		
		// loop through the board,
		// if pieces[i][j] == 1, draw a red circle
		// if pieces[i][j] == 2, draw a blue circle
		int x = xBoard;
		int y = yBoard;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pieces[i][j] == 1) {
					g2D.setColor(Color.RED);
					g2D.fillOval(x, y, squareSize, squareSize);
				}
				
				if (pieces[i][j] == 2) {
					g2D.setColor(Color.BLUE);
					g2D.fillOval(x, y, squareSize, squareSize);
				}
				
				x += squareSize;
			}
			x = xBoard;
			y += squareSize;
		}
		
	}

	private void drawBoard(Graphics2D g2D) {
		int x = xBoard;
		int y = yBoard;
		g2D.setColor(Color.BLUE);
		for (int i = 0; i < 3; i++) {// i is the row index
			for (int j = 0; j < 3; j++) { // j is the column index
				g2D.drawRect(x, y, squareSize, squareSize);
				
				// update x and y
				x += squareSize;
			}
			x = xBoard;
			y += squareSize;
		}
	}
	
	@Override
	public void mousePressed(MouseEvent evt) {
		// extract the x and y coordinate of the click
		int x = evt.getX();
		int y = evt.getY();
		
		// determine which square should be changed
		int rowIndex = (y - yBoard) / squareSize;
		int colIndex = (x - xBoard) / squareSize;
 
		// modify the corresponding number in pieces
		if (isPlayer1Turn) {
			pieces[rowIndex][colIndex] = 1;
			isPlayer1Turn = false; // next time it's player2's turn
		} else {
			pieces[rowIndex][colIndex] = 2;
			isPlayer1Turn = true; // next time it's palyer1's turn
		}
		
		// Detect victory
		detectVictory();
		
		// If the game ends, update scores
		updateScore();
		updateMessage();
		
		// repaint the interface
		repaint();
		
		
	}
	
	public void mouseReleased(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	
	private void detectVictory() {
		
		for (int i = 0; i < 3; i++) {
			// detect if there are three pieces of same color on a row
			if (pieces[i][0] == 1 && pieces[i][1] == 1 && pieces[i][2] == 1) {
				victoryType = 1;
			}
			
			// detect if there are three pieces of same color in a column
			if (pieces[0][i] == 1 && pieces[1][i] == 1 && pieces[2][i] == 1) {
				victoryType = 1;
			}
			
			// detect if the diagonal has three pieces of same color
			if (pieces[0][0] == 1 && pieces[1][1] == 1 && pieces[2][2] == 1) {
				victoryType = 1;
			}
			if (pieces[0][2] == 1 && pieces[1][1] == 1 && pieces[2][0] == 1) {
				victoryType = 1;
			}
			// Player 2:
			// detect if there are three pieces of same color on a row
			if (pieces[i][0] == 2 && pieces[i][1] == 2 && pieces[i][2] == 2) {
				victoryType = 2;
			}
			
			// detect if there are three pieces of same color in a column
			if (pieces[0][i] == 2 && pieces[1][i] == 2 && pieces[2][i] == 2) {
				victoryType = 2;
			}
			
			// detect if the diagonal has three pieces of same color
			if (pieces[0][0] == 2 && pieces[1][1] == 2 && pieces[2][2] == 2) {
				victoryType = 2;
			}
			if (pieces[0][2] == 2 && pieces[1][1] == 2 && pieces[2][0] == 2) {
				victoryType = 2;
			}
		}
		//TODO detect if the board is full but nobody wins
	}
	
	private void updateScore() {
		if (victoryType == 1) {
			player1Score++;
		} else if (victoryType == 2) {
			player2Score++;
		}
	}
	
	private void updateMessage() {
		if (victoryType == 1) {
			message = player1 + " wins!";
		} else if (victoryType == 2) {
			message = player2 + " wins!";
		} else if (victoryType == 0) {
			if (isPlayer1Turn) {
				message = player1 + "'s turn";
			} else {
				message = player2 + "'s turn";
			}
		}
	}
}
