package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		b++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		/*
		 * Order of operation
		 * (1) add 1 of the value of a
		 * (2) compares the value of a to the value of b
		 * (3) decrease 1 of the value of b
		 */
		System.out.println(++a == b--);
		
		System.out.println(a == b); //The operation above don't changed the values of a and b
		System.out.println(a);
		System.out.println(b);
		
	}
}
