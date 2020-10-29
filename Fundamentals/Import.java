package fundamentos;

import java.util.Date;

//import java.util.Date;

//import java.util.Date;
public class Import {
	public static void main(String[] args) {
		/*
		 * Some Java features aren't available by default and to solve this problem,
		 * import libraries using the import command.
		 */
		String s = "Bom dia!"; // String is available by default
		System.out.println(s);
		
		Date d = new Date(); // Date isn't available by default. It needs import
		System.out.println(d);
		
		/*
		 * We can import the libraries in three ways:
		 * (1) typing directly below of package
		 * (2) click on the warning icon of IDE
		 * (3) CTRL + SHIFT + O
		 */
	}
}
