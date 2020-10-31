package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Mouse";
		p1.preco = 25.30;
		p1.desconto = 0.03;
		
		Produto p2 = new Produto("Teclado");
		p2.preco = 87.15;
		p2.desconto = 0.05;
		
		Produto p3 = new Produto("Fone", 48.99, 0.0);	
		
		double precoFinal1 = p1.calculaDesconto();
		double precoFinal2 = p2.calculaDesconto();
		double precoFinal3 = p3.calculaDesconto(0.07);
		
		double precoTotal = precoFinal1 + precoFinal2 + precoFinal3;
		double precoMedio = precoTotal / 3;
		
		System.out.printf("Produto 1 ....... R$ %.2f\n", precoFinal1);
		System.out.printf("Produto 2 ....... R$ %.2f\n", precoFinal2);
		System.out.printf("Produto 3 ....... R$ %.2f\n", precoFinal3);
		System.out.printf("Valor Total ..... R$ %.2f\n", precoTotal);
		System.out.printf("Preço Médio ..... R$ %.2f\n", precoMedio);
	}
}
