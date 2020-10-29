package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		/*
		 * A notação "." traz funções dentro do Java
		 * Tipos primitivos não admitem o operador "."
		 */
		
		String s = "Bom dia X";
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = "Bom dia X";
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
		y = "Bom dia X"
				.replace("X", "Gui").toUpperCase()
				.concat(" e " + x);
		System.out.println(y);

	}
}
