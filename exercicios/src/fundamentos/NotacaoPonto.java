package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		/*
		 * O ponto é um elemento na linguagem Java que abre as portas 
		 * para alterar  comportamento ou atributo dos elementos.
		 * Os 8 tipos primitivos não aceitam a notação ponto na sua construção,
		 * assim sendo, não é aceito:
		 * int n = 23;
		 * n.algumaCoisa();
		 * String, por exemplo, como não é um tipo primitivo, aceita 
		 * esse tipo de construção.
		 */
		String s = "Bom dia X";
		s.toUpperCase();// Desta forma não altera o valor da variável
		System.out.println(s);
		
		s = s.toUpperCase();// Desta forma altera o valor da variável
		System.out.println(s);
		
		s.replace("X", "Senhora");// Desta forma não altera o valor da variável
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);// Desta forma altera o valor da variável
		
		s = s.concat("!!!");
		System.out.println(s);
		
		String g = "Gilmar";
		System.out.println(g.toUpperCase());// Admite alteração dentro da função
		
		String n = "Gilmar".toUpperCase();
		System.out.println(n);
		
		// Admite agrupados em uma linha
		String p = "Gilmar Santana".replace("Gilmar", "Gil").toUpperCase().toLowerCase().concat("...");
		System.out.println(p);
		
		// Admite em quebras de linha
		String t = "Gilmar S"
				.replace("S", "Santana")
				.toUpperCase()
				.toLowerCase()
				.concat("...");
		System.out.println(t);
								
	}

}
