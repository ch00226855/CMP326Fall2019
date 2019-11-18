import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class SalaryCalculator extends JFrame {
	
	// Create four components
	JLabel label1;
	JLabel label2;
	JTextField field1;
	JTextField field2;
	
	public SalaryCalculator() {
		// label1
		label1 = new JLabel("Hourly wage:");
		
		// label2
		label2 = new JLabel("Yearly salary:");
		
		// field1
		field1 = new JTextField(20); // 20 means that the fields is 20
									// character long
		
		// field2
		field2 = new JTextField(20);
		
		///////////////////////////////////////////////////////////
		// Put components together using GridBagLayout
		// 1. Declare GridBagLayout to be the layout manager.
		this.setLayout(new GridBagLayout());
		
		// 2. Declare a GridBagConstraints object
		GridBagConstraints constraints = new GridBagConstraints(); 
		
		// 3. Set the constraints for each component
		constraints.gridx = 0;
		constraints.gridy = 0;
		
		// 4. Add the component and the constraints to the frame
		this.add(label1, constraints);
		
		// Repeat 3 and 4 for each component
		constraints.gridx = 1;
		constraints.gridy = 0;
		this.add(field1, constraints);
		
		// add label2
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(label2, constraints);
		
		// add field2
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(field2, constraints);
		////////////////////////////////////////////////////////
		// TODO: move this part to a method that respond to user input.
		// Calculate yearly salary from user input
		// 1. read hourly wage
//		String userInput = field1.getText();
		String userInput = "20";
		// 2. convert string to int
		int hourlyWage = Integer.valueOf(userInput);
		// 3. calculate yearly salary
		int yearlySalary = hourlyWage * 40 * 50; // 40 hours per week
												// 50 weeks per year
		// 4. display yearly salary in field2
		field2.setText("" + yearlySalary);
		
	}
	
	public static void main(String[] args) {
		SalaryCalculator window = new SalaryCalculator();
		window.setTitle("Salary Calculator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setSize(800, 600);
		window.pack(); // window will choose a proper size to show all components
		
//		window.add(comp);
		window.setVisible(true);
	}
	

}
