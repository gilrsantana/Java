package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//INFORMAÇÕES DE UM FUNCIONÁRIO
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; 
		/*
		 * o acréscimo do L no final é para marcar para o java que este valor é um literal 
		 * do tipo long, pois como padrão o java associa um valor numérico ao tipo int 
		 * (inteiro)
		 */
		
		//Tipos numéricos reais
		float salario = 11_765.98F;
		/*
		 * da mesma forma que o long, o float precisa ser marcado com o F no final, pois
		 * o java considera o tipo double como padrão de número real
		 */
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; //ativo
		/*
		 * assume apenas um caractere, não assume valores como 'ativo'
		 * pode assumir valores como simbolos ou referencia com um símbolo da tabela
		 * unicode (\u0010), mas empre um caractere único.
		 */
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Associação do id ao salário
		System.out.println(id + ": ganha -> " + salario);
		
		//Estado de férias
		System.out.println("Férias? " + estaDeFerias);
		
		//Estatus do funcionário
		System.out.println("Status: " + status);
						
	}
}



