package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise2 {
	public static void main(String[] args) {
		/*
		 * Make a program that reads the Farenheit temperature and converts it to Celcius.
		 */
		int farenheit, celcius;
		
		String value1 = JOptionPane.showInputDialog("Enter the Farenheit temperature");
		farenheit = Integer.parseInt(value1);
		celcius = (farenheit - 32) * 5/9;
		JOptionPane.showInternalMessageDialog(null, farenheit + "°F is equal to " 
				+ celcius + "°C");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Farenheit temperature: ");
		int far = input.nextInt();
		celcius = (far - 32) * 5/9;
		System.out.printf("%d °F is equal to %d °C\n", far, celcius);
		input.close();
	}
}
