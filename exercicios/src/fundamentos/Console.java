package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		
		Scanner pessoal = new Scanner(System.in);
		
		System.out.print("\n\nDigite seu primeiro nome: ");
		String nome = pessoal.nextLine();
		
		System.out.print("Digite seu último nome: ");
		String sobrenome = pessoal.nextLine();
		
		System.out.print("Digite seu CPF (somente números): ");
		String cpf  = pessoal.nextLine();
		
		System.out.print("Digite sua renda mensal: ");
		double rendaMensal = pessoal.nextDouble();
		
		System.out.println("\n\nDados Pessoais");
		System.out.printf("Nome: %s\nSobrenome: %s\nCPF: %s\nRenda Mensal: %.2f\n\n",
				nome, sobrenome, cpf, rendaMensal);
		
		
		
		pessoal.close();
		
		
				
	
	}

}