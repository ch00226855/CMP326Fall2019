import javax.swing.JFrame;

public class TicTacToeGame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setTitle("TicTacToe Game");
		window.setSize(600, 750); // (width, height)
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TicTacToeBoard board = new TicTacToeBoard("Alice", "Bob");
		window.add(board);
		
		window.setVisible(true);

	}

}
