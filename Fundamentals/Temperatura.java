package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		final int AJUSTE = 32;
		final double FATOR = 5.0/9;
		double farenheit = 75;
		double celcius;
		celcius = (farenheit-AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + "°C");
	}
}
