package fundamentos;
//Há elementos que precisam ser importados na lingiuagem Java. Os elemntos padrão dentro da linguagem Java são os
//elementos que ficam dentro do java.lang.
import java.util.Date;

public class Import {

		public static void main(String[] args) {
			java.lang.String s = "Bom dia"; //java.lang.
			java.lang.System.out.println(s);
			
			String t = "Boa Tarde";
			System.out.println(t);
			
			Date d = new Date();
			System.out.println(d);
		}
}
