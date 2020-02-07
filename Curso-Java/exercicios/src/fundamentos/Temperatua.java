package fundamentos;

public class Temperatua {
	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		
		
		final double PARAMETRO = 32;
		final double FATOR = 5.0/9;
		
		double farenheit = 86;
		double celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
	
		/* 
		 * Caso queira repetir o programa, coloque o nome da variável e o valor,
		 * mas sem o tipo, conforme abaixo.
		*/
		
		farenheit = 28;
		celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
		
		farenheit = 32;
		celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
		farenheit = 48;
		celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
		farenheit = 74;
		celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
		farenheit = 90;
		celcius = (farenheit - PARAMETRO) * FATOR;
		System.out.println("A temperatura é " + celcius + " °C");
		
	}
}
