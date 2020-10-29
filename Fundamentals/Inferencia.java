package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/*
		 * Inferência é um conceito de variáveis onde na apresentação de uma
		 * variável qualquer, caso não seja expresso o seu tipo, o Java irá
		 * automaticamente enquadrá-la dentro de um tipo específico, lembrando
		 * aqui que Java é uma linguagem fortemente tipada e issofaz com que se
		 * uma variável for definida com um tipo, ela não pode ser alterada
		 * para um outro tipo.
		 * 
		 * Para realizar a inferência basta atribuir a palavra reservada var
		 * antes da variável.
		 */
		
		var a = 3.8;      // atribuído automaticamente o tipo double
		var b = 44;       // atribuído automaticamente o tipo int
		var c = "Mingau"; // atribuído automaticamente o tipo string
		
		// a = 18;  "a" pode receber int, pois int cabe dentro de float
		// b = 5.1; "b" NÃO pode receber double, pois double não cabe dentro de int
		// c = 10;  "c" NÃO pode receber int, pois int é incompatível com string;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 1.1;
		b = 10;
		c = "legal";
				
		System.out.println("\n");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 12; // Java vai atribuir 12.0 pois a foi atribuído como double anteriormente
		System.out.println(a);
	}
}
