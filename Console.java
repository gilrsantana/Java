package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia");
		
		Scanner entrada = new Scanner(System.in); // Scanner start
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close(); //Scanner end
	
	}
}
