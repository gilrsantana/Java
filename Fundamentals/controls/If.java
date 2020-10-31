package controls;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		/*
		 * Give the number according the day of the week:
		 * Sunday = 1, Monday = 2, Tuesday = 3, etc.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inform the day of the week: ");
		String day = input.next();
		
		if(day.equalsIgnoreCase("sunday") ) {
			System.out.println("1");
		}else if(day.equalsIgnoreCase("monday")) {
			System.out.println("2");
		}else if(day.equalsIgnoreCase("tuesday")) {
			System.out.println("3");
		}else if(day.equalsIgnoreCase("wednesday")) {
			System.out.println("4");
		}else if(day.equalsIgnoreCase("thursday")) {
			System.out.println("5");
		}else if(day.equalsIgnoreCase("friday")) {
			System.out.println("6");
		}else if(day.equalsIgnoreCase("saturday")){
			System.out.println("7");
		}else {
			System.out.println("Invalid input");
		}
		input.close();
	}
	
}
