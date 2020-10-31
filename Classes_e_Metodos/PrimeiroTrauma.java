package classe;

public class PrimeiroTrauma {
	/*
	 * Two ways to access a variable in a class:
	 * 1) Modify it to static, or;
	 * 2) Create an object an than, aceess it.
	 */
	static int a = 3; // (1)
	int b = 5;
	public static void main(String[] args) {
				
		System.out.println(a);
		
		PrimeiroTrauma p1 = new PrimeiroTrauma(); // (2)
		System.out.println(p1.b);
	}
}
