package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Enter the first number");
		String valor2 = JOptionPane.showInputDialog("Enter the second number");
		
		System.out.println(valor1 + valor2);
		System.out.println(valor1 + " " + valor2);
		
		double number1 = Double.parseDouble(valor1);
		double number2 = Double.parseDouble(valor2);
		
		double sumNumbers = number1 + number2;
		
		double average = sumNumbers / 2;
		System.out.println("The sum of the numbers is " + sumNumbers);
		System.out.println("The average of the numbers is " + average);
	}
}
