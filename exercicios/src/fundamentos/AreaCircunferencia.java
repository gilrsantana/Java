package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		/* A atribuição de final na variável impossibilita que 
		 * ela seja modificada durante a execução do código.
		 */
		final double PI = 3.14159;
		double raio = 3.4;
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 2.3;
		area = PI * raio * raio;
		System.out.println("A área = "+ area + "m²");
	}
}
