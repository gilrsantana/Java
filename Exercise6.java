package fundamentos;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		/*
		 * Create a program that solves equations of 2nd degrees (ax² + bx + c = 0)
		 * using Bhaskara's formula.
		 */
		
		double a, b, c, x1, x2, delta;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe the value of 'a'");
		a = input.nextDouble();
		System.out.println("Informe the value of 'b'");
		b = input.nextDouble();
		System.out.println("Informe the value of 'c'");
		c = input.nextDouble();
		
		//result = a < 0 ? 0 : a;
		delta = Math.pow(b, 2) - (4 * a * c);
		x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
		x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
		System.out.println("The roots of equation are " + x1 + " and " + x2);
		
		input.close();
	}
	
}
