package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise1 {
	public static void main(String[] args) {
		/*
		 * Make a program that reads the Celcius temperature and converts it to Farenheit.
		 */
		
		// 1st form of resolution
		double celcius, farenheit;
		
		String value1 = JOptionPane.showInputDialog("Enter the Celcius temperature");
		celcius = Double.parseDouble(value1);
		farenheit = (celcius * 9/5) + 32;
		JOptionPane.showInternalMessageDialog(null,celcius + "°C is equal to " 
				+ farenheit + "°F");
		
		// 2nd form of resolution
		double c1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Celcius temperature");
		c1 = input.nextDouble();
		farenheit = (c1 * 9/5) + 32;
		System.out.printf("%.1f °C is equal to %.1f °F\n", c1, farenheit);
		input.close();
	}
}
