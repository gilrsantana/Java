package fundamentos;
/*
 * A versão orientada a objetos dos tipos primitivos
 * wrapper - Tipo Primitivo
 * Byte - byte
 * Short - short
 * Integer - int
 * Long - long
 * Float - float
 * Double - double
 * Character - char
 * Boolean - boolean
 * 
 * Com essa transformação, diversas mudanças de comportamento ou de atributo
 * são possíveis aos tipos primitivos.
 */
public class Wrappers {

	public static void main(String[] args) {
	
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());// Mostra o valor de b
		System.out.println(s.toString());// Transforma s de short para string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.34F;
		System.out.println(f);
		
		Double d = 123456.6789;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // transforma um valor string em booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());// transforma um valor booleano em string. Caixa alta.
		
		Character c = '#';
		System.out.println(c + "...");
	}

}