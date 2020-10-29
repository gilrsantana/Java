package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		/*
		 * Using the knowledge learned in this chapter, receive to the user two numbers
		 * and make one math operation.
		 * Steps:
		 * 1) Ask for the first number
		 * 2) Ask for the second one
		 * 3) Ask what kind math operation the user wants to do (+ - * / or %)
		 * 4) Show the results according of the operation 
		 */
		
		String valor1 = JOptionPane.showInputDialog("Enter the first number.");
		String valor2 = JOptionPane.showInputDialog("Enter de second number.");
		String character = JOptionPane.showInputDialog("Choose the math operation:\n"
				+ "+, -, *, / or %");
		
		double number1 = Double.parseDouble(valor1);
		double number2 = Double.parseDouble(valor2);
		double result = "+".equals(character) ? number1 + number2 : 0;
		result = "-".equals(character) ? number1 - number2 : result;
		result = "*".equals(character) ? number1 * number2 : result;
		result = "/".equals(character) ? number1 / number2 : result;
		result = "%".equals(character) ? number1 % number2 : result;
				
		JOptionPane.showInternalMessageDialog(null, 
				number1 + " " + character + " " + number2 + " = " + result);
		System.out.println(" ");
	}
}
