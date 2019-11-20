import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SalaryCalculator extends JFrame implements ActionListener,
										ChangeListener {
	
	JLabel wageLabel;
	JLabel salaryLabel;
	
	JTextField wageField;
	JTextField salaryField;
	
	JButton calculateButton;
	
	JFormattedTextField salaryField2;
	
	JSpinner hourSpinner;
	int hoursPerWeek;
	
	public SalaryCalculator() {
		wageLabel = new JLabel("Hourly wage:");
		salaryLabel = new JLabel("Yearly salary:");
		
		wageField = new JTextField(15);
		wageField.setText("0");
		wageField.setEditable(true);
		
		salaryField = new JTextField(15);
		salaryField.setText("0");
		salaryField.setEditable(false);
		
		// Make the text field listen to user inputs
		wageField.addActionListener(this);
		
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(this);
		
		Format currency = NumberFormat.getCurrencyInstance(Locale.US);
		salaryField2 = new JFormattedTextField(currency);
		salaryField2.setValue(0);
		salaryField2.setColumns(15);
		
		hourSpinner = new JSpinner(new SpinnerNumberModel(40, 0, 120, 10));
		hourSpinner.addChangeListener(this);
		hoursPerWeek = 40;
		
		
		/////////////////////////////////////////////////
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(wageLabel, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(wageField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(salaryLabel, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(salaryField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(calculateButton, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(salaryField2, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		this.add(hourSpinner, constraints);
		
		
	}
	
	public static void main(String[] args) {
		SalaryCalculator window = new SalaryCalculator();
		window.setTitle("Salary Calculator");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Read hourly wage from wageField
		String wageString = wageField.getText();
		int hourlyWage = Integer.parseInt(wageString);
		// Calculate the yearly salary
		// Formula: yearly salary = hourly wage * 40 * 50
//		int yearlySalary = hourlyWage * 40 * 50;
		int yearlySalary = hourlyWage * hoursPerWeek * 50;
		
		// Display yearly salary in salaryField
		String salaryString = String.format("%d", yearlySalary);
		salaryField.setText(salaryString);
		
		salaryField2.setValue(yearlySalary);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		hoursPerWeek = ((Number) hourSpinner.getValue()).intValue();
	}

}
