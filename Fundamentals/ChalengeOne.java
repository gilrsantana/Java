package fundamentos;

import java.util.Scanner;

public class ChalengeOne {
	public static void main(String[] args) {
		/*
		 * Receive three inputs from user using Scanner and nextline.
		 * These inputs can be received with "," or "." (comma or dot).
		 * Receive a person's salary from three months and than calculate
		 * the average of these three months.
		 * 
		 *  Steps: 
		 *  Scanner / NextLine / Close the Scanner / 
		 *  Convert String to Number / Calculate the average / 
		 *  Show the result
		 */
	
		Scanner entry = new Scanner(System.in);
	
		System.out.print("Enter the salary of month one: ");
		String salary1 = entry.next().replace(",", ".");
		double newSalary1 = Double.parseDouble(salary1);
		
		System.out.print("Enter the salary of month two: ");
		String salary2 = entry.next().replace(",", ".");
		double newSalary2 = Double.parseDouble(salary2);
		
		System.out.print("Enter the salary of month three: ");
		String salary3 = entry.next().replace(",", ".");
		double newSalary3 = Double.parseDouble(salary3);
		
		entry.close();
		
		double average = (newSalary1 + newSalary2 + newSalary3) / 3.0;
		
		System.out.println("The average salary is R$ " + average);
		
		
	}
}
