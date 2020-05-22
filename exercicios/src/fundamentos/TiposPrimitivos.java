package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações de funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 543;
		int id = 56789;
		/*
		 * Para a utilização do long é brigatória a utilização do L 
		 * (maiúsculo ou minúsculo) para identificar este tipo, caso
		 * contrário Java vai enquadrar com int.
		 * A utilização de underline é opcional, não obrigatória.
		 * long pontosAcumulados = 3_134_845_223L
		 */
		long pontosAcumulados = 3134845223L;
		
		// Tipos numeŕicos reais
		/*
		 * As mesmas recomendações de long se repentem em float
		 * associado ao tipo double.
		 */
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo caractere
		char status = 'A';
		
		// Tipo booleano;
		boolean estaDeFerias = false; // true
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha: " + salario);
		
		System.out.println("Férias: " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
		
	}
}
