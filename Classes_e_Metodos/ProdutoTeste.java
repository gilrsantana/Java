package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Mouse";
		p1.preco = 25.30;
		
		Produto p2 = new Produto("Teclado");
		p2.preco = 87.15;
		Produto p3 = new Produto("Fone", 48.99);	
		
		Produto p4 = new Produto();
		
		Produto p5 = p3;
		
		System.out.println("p1 " + p1); // Endereço de memória onde este objeto foi instanciado
		System.out.println("p2 " + p2); // Endereço de memória onde este objeto foi instanciado
		System.out.println("p3 " + p3); // Endereço de memória onde este objeto foi instanciado
		System.out.println("p4 " + p4); // Endereço de memória onde este objeto foi instanciado
		System.out.println("p5 " + p5); // Endereço de memória onde este objeto foi instanciado
				
		System.out.println();
		
		Produto.desconto = 0.29;
		
		double precoFinal1 = p1.calculaDesconto();
		double precoFinal2 = p2.calculaDesconto();
		double precoFinal3 = p3.calculaDesconto(0.07);
		
		double precoTotal = precoFinal1 + precoFinal2 + precoFinal3;
		double precoMedio = precoTotal / 3;
		
		System.out.println("Desconto aplicado " + (Produto.desconto * 100) + " %");
		System.out.printf("Produto 3 ....... R$ %.2f\n", precoFinal3);
		System.out.printf("Produto 1 ....... R$ %.2f\n", precoFinal1);
		System.out.printf("Produto 2 ....... R$ %.2f\n", precoFinal2);
		System.out.printf("Valor Total ..... R$ %.2f\n", precoTotal);
		System.out.printf("Preço Médio ..... R$ %.2f\n", precoMedio);
	}
}
