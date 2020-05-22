package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		/*
		 * Todos os processos aqui mostrados com int se repetem com os outros tipos primitivos
		 */
		
		Integer num1 = 1000; // Utilização de wrapper
		System.out.println(num1.toString().length());// Após converter para string dá para usar funções xclusivas de string
	
		int num2 = 10000;// Utilizando a própria variável
		System.out.println(Integer.toString(num2).length());// Invoca wrapper para executar
		
		//Estas opções não são as mais usuais, mas se atinge o mesmo reultado
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}

}