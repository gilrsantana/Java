package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		//A notação ponto traz propriedades para um elemento
		
		String s = "Bom dia X";
		
		//s.replace(oldChar, newChar);
		s = s.replace("X", "senhora!");
		
		// s.toUpperCase();
		s = s.toUpperCase();//declaro que toda variável s seguirá a regra de ser MAIUSC.
				
		//s.concat(); acrescenta valores no final da String
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Alex")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		/*
		 * TIPOS PRIMITIVOS NÃO TEM OPERADOR "."
		 * byte, short, int, long, float, double, boolean, char
		 */
		
	}
}




