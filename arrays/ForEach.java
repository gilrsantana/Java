package arrays;

public class ForEach {

		public static void main(String[] args) {
			
			double[] notas = { 8.3, 8.9, 9.8 };
			
			for (int i = 0; i < notas.length; i++) {
				System.out.print(notas[i] + " ");
			}
			System.out.println();
			for(double nota: notas) {
				System.out.print(nota + " ");
			}
			
			
		}
}
