import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class FirstGUIProgram {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a GUI component
		MyComponent component1 = new MyComponent();
		
		frame.add(component1);
		
		frame.setVisible(true);

	}

}
