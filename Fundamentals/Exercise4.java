package fundamentos;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * Create a program that reads a value and presents the results
		 * in the square and cube values of the value.  
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		double value = input.nextDouble();
		double square = Math.pow(value, 2);
		double cube = Math.pow(value, 3);
		System.out.println("Value " + value + " has as cube " 
				+ cube + " and as square " + square);
		input.close();
	}
}
