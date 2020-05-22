package fundamentos;

import java.util.Scanner;

public class Console2 {

	public static void main(String[] args) {
	
		Scanner pessoal = new Scanner(System.in);
		
		System.out.println("FICHA DE CADASTRO\n");
		
		System.out.print("Idade:");
		byte idade = pessoal.nextByte();
				
		System.out.print("Primeiro nome: ");
		String primeiroNome = pessoal.nextLine();
			
		System.out.print("Último nome: ");
		String ultimoNome = pessoal.nextLine();
		
		System.out.print("Sexo (M ou F): ");
		String sexo = pessoal.nextLine();
	
		pessoal.close();
		
		System.out.printf("Idade: %d\nNome: %s %s\nSexo:%s\n"
				,idade, primeiroNome, ultimoNome, sexo);
	}

}
