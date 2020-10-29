package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		c = c + b;
		System.out.println(c);
		c += b;
		System.out.println(c);
		c = c - a;
		System.out.println(c);
		c -= a;
		System.out.println(c);
		c *= a;
		System.out.println(c);
		c /= (double)b;
		System.out.println(c);
		c %= b;
		System.out.println(c);
		b++;
		System.out.println(b);
		a++;
		System.out.println(a);
		c--;
		System.out.println(c);
		
	}
}
