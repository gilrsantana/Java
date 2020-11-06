package arrays;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		
		double total, media;
		int qtd;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		qtd = input.nextInt();
		
		double[] notas = new double[qtd];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe o valor da nota " + (i + 1));
			notas[i] = input.nextDouble();
		}
		
		total = 0;
		
		for (double soma : notas) {
			total += soma;
		}
		
		media = total / notas.length;
		
		System.out.printf("O total das médias é %.1f\n", media);
		
		input.close();
	}
}
