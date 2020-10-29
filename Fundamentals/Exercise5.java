package fundamentos;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		/*
		 * Create a program that reads the base and height values
		 * of a triangle and calculates the area
		 */
		double base, height, area;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base value");
		base = input.nextDouble();
		System.out.println("Enter the height value");
		height = input.nextDouble();
		area = (base * height) / 2;
		System.out.println("The triangle has as area " + area);
		
		input.close();
	}
}
