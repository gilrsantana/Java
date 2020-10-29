package fundamentos;

public class TiposPrimitivos {
	public static void main(String[]args) {
		/*
		 * Java possui oito tipos primitivos, sendo seis deles representando 
		 * valores numéricos e 4 deles representando valores interios.
		 * 
		 * Inteiros
		 * Byte: 1 byte / -128 até 127
		 * Short: 2 byte / +- 32767 aprox.
		 * Int: 4 byte
		 * Long: 8 byte	
		 * 
		 * Ponto Flutuante
		 * Float: 4 bytes
		 * Double: 8 bytes
		 * 
		 * Tipos não numéricos
		 * Char: Representa caractere, no tamanho de 1 byte
		 * char admite qualquer caractere, seja letra, número ou símbolo.
		 * Importante ressaltar que se uma variável char conter mais de um
		 * caractere ele será uma string e não um char. Char deve conter apenas
		 * um caractere.
		 * Boolean: True ou False
		 *  
		 */
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 543;
		int id = 56789;
		long pontosAcumulados = 3_234_227_784L; //Admite underline para separar os números
		
		float salario = 11_445.65F;
		double vendasAcumuladas = 2_991_779_103.87;
		
		boolean estaDeFerias = false; // ou true
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println("Anos de empresa: " + anosDeEmpresa*365);
		 //Dias de viagem
		System.out.println("Número de voos: " + numeroDeVoos / 2);
		//Pontos acumulados
		System.out.println("Relação de pontos: " + pontosAcumulados/vendasAcumuladas);
		//identificação
		System.out.println(id + " ganha " + salario);
		//Ferias
		System.out.println("Está de férias? " + estaDeFerias);
		//Qual status
		System.out.println("Status: " + status);
	}
}
