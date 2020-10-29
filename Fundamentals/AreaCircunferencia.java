package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.15159; 
		// final não deixa a variável ter seu valor modificado
		System.out.println(PI * raio * raio);
		double area = PI * raio * raio;
		System.out.println(area);
		
		System.out.println("Área = " + area + "m²");
	}
}
