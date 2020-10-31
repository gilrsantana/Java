package controls;

import java.util.Scanner;

public class DeterminatedWhile {
	public static void main(String[] args) {
		/*
		 * Show the number according the day of the week, continuously.
		 * Sunday = 1, Monday = 2, etc.
		 * Stop when the input is equals to zero. 
		 */
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day of the week or 0 to stop: ");
		String day = input.next();
		while(!day.equalsIgnoreCase("0")) {
			
			if("sunday".equalsIgnoreCase(day)) {
				System.out.println("1");
			}else if("monday".equalsIgnoreCase(day)) {
				System.out.println("2");
			}else if("tuesday".equalsIgnoreCase(day)) {
				System.out.println("3");
			}else if("wednesday".equalsIgnoreCase(day)){
				System.out.println("4");
			}else if("thursday".equalsIgnoreCase(day)) {
				System.out.println("5");
			}else if("friday".equalsIgnoreCase(day)) {
				System.out.println(6);
			}else if("saturday".equalsIgnoreCase(day)) {
				System.out.println("7");
			}else {
				System.out.println("Invalid input");
			}
			
			System.out.println("Enter the day of the week or 0 to stop: ");
			day = input.next();
		}
		input.close();
	
	
	}
}
