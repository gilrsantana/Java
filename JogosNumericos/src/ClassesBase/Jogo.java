package ClassesBase;

import java.util.Random;

public class Jogo {
	
	public int aposta;
	public int resultado;
	
	public void executaJogo() {
		this.resultado=(new Random().nextInt(6)+1);
	}

	public void mostraResultado() {
		System.out.println("Sua aposta: "+aposta+"Resultado: "+resultado);
		if(this.resultado == this.aposta) {
			System.out.println("PARABÉNS! Você acertou.");
		}else {
			System.out.println("ERROU! Mas continue tentando...");
		}
	}
}
