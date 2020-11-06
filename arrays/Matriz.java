package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Quantos alunos? ");
		int qtdAlunos = input.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = input.nextInt();
		
		double[][] notasTurma = new double [qtdAlunos][qtdNotas];
		
		double totalNotas = 0;
		
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: \n", (i + 1), (j + 1) );
				notasTurma[i][j] = input.nextDouble();
				totalNotas += notasTurma[i][j];
			}
		}
		
		double mediaTurma = totalNotas / (qtdAlunos * qtdNotas);
		
		System.out.println("A média da turma é " + mediaTurma);
		int i = 1;
		for(double[] notasAluno: notasTurma) {
			System.out.println("Aluno " + i);
			System.out.println(Arrays.toString(notasAluno));
			i++;
		}
		
		input.close();
	}
	
}
