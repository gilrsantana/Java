package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		/*
		 * In order to compares Strings we can't use ==
		 * The right way to do this is using the function .equals()
		 */
		
		String s1 = "2";
		System.out.println(s1 == "2");
		
		String s2 = new String("2");
		System.out.println(s2 == s1);
		System.out.println(s2.equals(s1));
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a String: ");
		String s3 = input.nextLine();
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3)); // without .trim()
		
		
		/*
		 * If the user type a string with space, something like this: "     2"
		 * (space space space space 2) we can use the function .trim().
		 * This function ignores the spaces and read only the value.
		 * Notice that "2" is different of "    2".
		 */
		s3 = input.nextLine();//enter the value using blank spaces and "2" and see the result
		System.out.println(s2.equals(s3.trim())); // with .trim()
		System.out.println(s2.equals(s3));
		
		
		/*
		 * If use .next() it's not necessary to use .trim() because the function .next()
		 * ignores all blank spaces
		 */
		s3 = input.next(); //enter the value using blank spaces and "2" and see the result
		System.out.println(s2.equals(s3.trim()));
		System.out.println(s2.equals(s3));	
		input.close();	
		
	}

	
}
