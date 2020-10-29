package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		/*
		 * Wrappers is a encapsulation of a primitive type.
		 * When a variable is a primitive type we can't use many functions, 
		 * but when we convert it in a wrapper, we can use many functions
		 * using the notation point.
		 * Examples below
		 */
		
		Byte b = 100; //byte
		Short s = 1000; //short
		Integer i = 10_000; //int
		Long l = 1_000_000_000L; //long
		
		Float f = 123.10F; //float
		Double d = 1234.5432; //double
		
		System.out.println(b.byteValue());
		System.out.println(s.intValue());
		
		Boolean bo = Boolean.parseBoolean("true"); //boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		System.out.println(c);
	}
}
