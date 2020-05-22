package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		// Conversão explícita: cast
		double a = 1;
		System.out.println(a);
		
		float b = (float) 234.567;// conversão explícita (cast) de double em float
		System.out.println(b);
		
		int c = 169;
		byte d = (byte) c;// conversão explícita (cast) de int em byte
		System.out.println(d);// resultado mostra valor truncado, pois byte vai até 127.
		
		double e = 1.99999;
		int f = (int) e;// conversão explícita (cast) de double em int
		System.out.println(f);
	}

}
