package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double calculaDesconto() {
		return preco * (1 - desconto);
	}
	
	double calculaDesconto(double descontoGerente) {
		return preco * (1 - (desconto + descontoGerente));
	}
}
