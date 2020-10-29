package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 45;
		int b = 56;
		
		System.out.println(a == b);
		System.out.println(a != b);
		
		double nota = 8;
		int falta = 8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean faltoso = falta > 5;
		boolean temDesconto = bomComportamento && passouPorMedia && !faltoso;
		System.out.println("Tem desconto? " + temDesconto);
	}
}
