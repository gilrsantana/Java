package controls;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		/*
		 * Create a program that calculates the class's grades.
		 * Each one of students must enter their grade and than,
		 * the program have to evaluate this grade. If the grade is valid,
		 * the program must accumulate it and count how many grades were valid.
		 * At the end, the program must show the class average.
		 * Finish the program when the input is -1.
		 */
		int count;
		double average, grade, total;
		
		count = 0;
		average = total = grade = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the grade or -1 to exit: ");
		grade = input.nextDouble();
			
		while(grade != -1) {
			if(grade >= 0 && grade <= 10) {
				count++;
				total = total + grade;
			}else {
				System.out.println("This input is invalid");
				System.out.println("Enter a value between 0 and 10");
			}
			
			System.out.println("Enter the next grade or -1 to exit: ");
			grade = input.nextInt();
		}
		input.close();
		
		average = total / count;
		
		System.out.println("The average of the class is " + average + ".");
		
	}
}
