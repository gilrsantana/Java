package controls;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		String idade = "";
		
		switch (idade.toLowerCase()) {
		case "cinco":
			System.out.println("Sabe ler e escrever");
		case "quatro":
			System.out.println("Sabe falar");
		case "três":
			System.out.println("Sabe correr");
		case "dois":
			System.out.println("Sabe andar");
		case "um":
			System.out.println("Sabe engatinhar");
			break;
		default:
			System.out.println("Só sabe chorar");
			break;
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a nota; ");
		int nota = input.nextInt();
		
		String conceito = "";
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "F";
			break;
		default:
			System.out.println("Nota Inválida");
			// o uso do break no último case é opcional
		}
		System.out.println("O Conceito é " + conceito);
		input.close();
	}
}
