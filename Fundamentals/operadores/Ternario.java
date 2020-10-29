package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		/*
		 * Ternary operator structure
		 * (condition) ? (if true) : (if false) 
		 */
		
		double media = 6.5;
		String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovado";
		/*
		 * condition: media >= 5.0
		 * if true: Recuperação
		 * if false: Reprovado
		 */
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		/*
		 * condition: media >= 7.0
		 * if true: Aprovado
		 * if false: resultadoParcial
		 */
		System.out.println("Status do aluno: " + resultadoFinal);
	}
}
