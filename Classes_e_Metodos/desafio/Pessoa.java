package classes.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida comida) {
		if(comida != null) {
			return this.peso += comida.peso;
		}else return 0;
	}
	
	String mostraPessoa() {
		return "Meu nome é " + this.nome + " e meu peso é "
				+ this.peso + " Kg.";
	}
	
}
