package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		/*
		 * Using debug
		 * Debug shortcut (F11)
		 * Click twice at vertical line at left beside the number line and will be created 
		 * a set point.
		 * Using the keys F5 or F6 you can run it step by step
		 */
		int a = 6 * (3 + 2);
		a = (int)Math.pow(a, 2);
		a = a / (3 * 2);
		int b = (1 -5) * (2 - 7);
		b = b / 2;
		b = (int)Math.pow(b, 2);
		int c = (int)Math.pow(a - b, 3);
		int d = (int)Math.pow(10, 3);
		int e = c / d;
		System.out.println(e);
		
	}
}
