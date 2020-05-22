package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
	
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double tempF = 65;
		double tempC = (tempF - AJUSTE)*FATOR;
		System.out.println(tempF+"F equivale a "+tempC+"C");
		
	}
}
