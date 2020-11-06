package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		/*
		 * Four different ways to represent an array:
		 * 1) double[] notasAluno = new double[3];
		 * 2) double notasAluno[] = new double[3];
		 * 3) double []notasAluno = new double[3];
		 * 4) double [] notasAluno = new double[3];
		 */
		double[] notasAluno = new double[4];
		// The array initializes with default values of the type
		System.out.println(Arrays.toString(notasAluno));
		notasAluno[0] = 6.7;
		notasAluno[1] = 7.8;
		notasAluno[2] = 8.9;
		notasAluno[3] = 9.6;
		
		System.out.println(notasAluno); // shows the array's address
		System.out.println(notasAluno[1]); // shows by index
		System.out.println(notasAluno[notasAluno.length - 1]); // shows the last one
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
		
		for(int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + total / notasAluno.length);
		
		total = 0;
		double nota = 8.3;
		double[] notasAlunoB = {nota, 6.8, 7};
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + total / notasAlunoB.length);
		
		
	}
}
