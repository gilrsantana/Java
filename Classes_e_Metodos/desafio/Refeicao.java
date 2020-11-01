package classes.desafio;

public class Refeicao {
	
	public static void main(String[] args) {
		double consumido = 0.0;
		Pessoa p1 =  new Pessoa("Carla", 67.30);
		
		Comida c1 = new Comida("arroz integral", 0.98);
		Comida c2 = new Comida("alface", 0.23);
		Comida c3 = new Comida("filé de peixe", 0.327);
		Comida c4 = new Comida("cenoura ralada", 0.119);
		
		System.out.println(p1.mostraPessoa());
		p1.comer(c1);
		consumido += c1.peso;
		p1.comer(c2);
		consumido += c2.peso;
		p1.comer(c2);
		consumido += c2.peso;
		p1.comer(c2);
		consumido += c2.peso;
		p1.comer(c3);
		consumido += c3.peso;
		p1.comer(c4);
		consumido += c4.peso;
		
		System.out.printf("Total consumido: %.3f\n", consumido);
		
		System.out.println(p1.mostraPessoa());
		
	}
	
	
}
