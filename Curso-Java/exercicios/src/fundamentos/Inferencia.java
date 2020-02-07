package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57; //ok
		a = 13;
		a = 15;
		a = 999;
		a = 25.567; //ok
		//a = "texto"  //errado, pois a foi declarado anteriormente como número.
		System.out.println(a); // vai imprimir a última sentença de declaraação de a.
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		/*
		 * c = 12345;
		System.out.println(c); // erro, pois c foi declarado antes como tipo texto.
		*/
		
		double d; //variável foi declarada
		d = 123.456; // variável foi inicializada
		System.out.println(d); // variável foi utilizada
		
		
	}
}
