package fundamentos;

import java.util.Date;// import da biblioteca

public class Import {

		public static void main(String[] args) {
			/*
			 * java.lang é o pacote padrão da linguagem Java
			 * Ele contém as informações mais essenciais 
			 * para execução do programa.
			 */
			String s = "Bom dia";
			System.out.println(s);
			
			// Caminho completo de String e println
			java.lang.String b = "Boa tarde";
			java.lang.System.out.println(b);
			
			Date d = new Date(); // Precisa importar java.util.Date
			System.out.println(d);
			
		}
}
