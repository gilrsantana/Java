package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		/*
		 * A utilização da palavra reservada 'var' permite que seja feita
		 * uma INFERÊNCIA com relação à uma variável, ou seja, como em 
		 * Java é preciso declarar o tipo da variável, se eu utilizar 
		 * 'var' para esta definição, o programa vai reconhecer o tipo 
		 * dessa variável e vai a partir de então sempre reconhecê-la
		 * como com esse tipo estabelecido.
		 */
		
		/*
		 * Outro detalhe importante é que sempre que se utilizar a
		 * palavra 'var' para atribuir uma variável ela tem que ser
		 * declarada e inicializada na mesma linha, assim sendo:
		 * var b;
		 * b = 56;
		 * não é permitido.
		 * Só será aceito:
		 * var b = 56;
		 */
		
		/*
		 * No trecho abaixo eu não defini explicitamente o tipo da minha
		 * variável 'a', mas como ela tem um ponto flutuante ela vai ser 
		 * associada ao tipo double.
		 */
		var a = 3.7;
		System.out.println(a); // Vai imprimir 3.7
		/*
		 * Abaixo não atribuí um tipo e mesmo colocando um inteiro, sem 
		 * ponto flutuante, como anteriormente a variável 'a' foi 
		 * atribuída como double, vai ser impresso '8.0' e não '8'.
		 * Em Java, uma vez atribuído um tipo a uma variável, ela não
		 * muda seu tipo. Ela pode até atuar, temporariamente, dentro 
		 * de um outro tipo de padrão diferente do que ela foi criado,
		 * utilizando o casting por exemplo, mas essa atribuição 
		 * temporária não muda a sua raiz, sua origem.
		 */
		a = 8;
		System.out.println(a); // Vai imprimir 8.0
		
		
	}

}
