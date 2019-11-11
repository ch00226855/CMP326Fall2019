import javax.swing.JFrame;

public class MySecondGUIProgram {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setTitle("My Second GUI Program");
		window.setSize(800, 600);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Canvas canvas = new Canvas();
//		window.add(canvas);
		
		ChessBoard board = new ChessBoard(50, 100, 50);
		window.add(board);
		
		window.setVisible(true);
		

	}

}
