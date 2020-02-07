package fundamentos;

public class AreaCircunferencia {

		public static void main(String[] args) {
			/*Entre as diversas formas de se fazer um programa para calcular a área
			 * da circunferência, aqui neste exercício serão apresentadas algumas
			 */
		
			/* COMO REPRESENTAR UMA VARIÁVEL
			 * Uma variável se representa com a sentença TIPO + NOME + VALOR, assim 
			 * sendo,
			 * 
			 * double - é um tipo de variável que é destinada a representar números 
			 * reais (decimais, por exemplo)
			 * raio - é o nome da variável
			 * 3.6 - é o valor dessa variável
			 * 
			 * O termo "final" antes de "double" em PI, indica que este valor é uma 
			 * constante, não muda, pois no nosso exemplo de cálculo de área de uma 
			 * circunferência o PI é uma constante independente do tamanho da 
			 * circunferência.
			 * Como convenção, toda constante é representada por letra maiúscula. 
			 * Para o funcionamento do programa escrever pi ou PI não afeta o 
			 * resultado, mas a boa prática recomenda a forma PI.
			 * 
			 * int > para números inteiros (3, 12, 427, 999976978, etc)
			 * double > para números reais (3, 3.14159, 2345.65, 2020, etc)
			 */
			
			double raio = 4.3;
			final double PI = 3.14159;
			
			double area = PI * raio * raio;
			
			//Três formas de se obter o resultado. Do mais simples ao mais polido.
			System.out.println(PI * raio * raio);
			System.out.println(area);
			System.out.println("Área = " + area + " m².");
			System.out.println("A área da circunferência é:");
			System.out.print(area + " m²");
			
					
		}
}
