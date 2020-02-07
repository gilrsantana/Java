package fundamentos;
/**
 * Este modelo de comentário se chama JavaDoc.
 * Ele serve para documentar o código.
 * Através dele são criados os documentos de referência do código.
 * Sempre se começa com uma barra e dois asteriscos e se fecha com 
 * um asterisco e uma barra. 
 * Um outro elemento importante de referência é o símbolo "@".
 * Ele linka com informações relevantes como autor, versão, referência, etc.
 * @author gilmar
 *
 */
public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		// Comentário de uma linha deve começar com duas barras.
		// É possível criar vários comentários de uma linha
		// Sempre começando com as duas barras.
		System.out.println("Primeiro Programa Parte #01!");
		/*
		 * Para comentários de mais de uma linha se começa com o
		 * barra asterisco e se fecha comasterisco barra.
		 * Cada vez que se dá uma quebra de linha a IDE coloca o
		 * asterisco a cada linha apenas por estilo. O relevante é
		 * a utilização do barra e asterisco para abrir e fecha ro comentário. 
		 */
		System.out.println("Primeiro Programa Parte #02!");
		System.out.println("Para organizar a identação do código o Eclipse ajuda com o comando CTRL SHIFT F");
	}

}
