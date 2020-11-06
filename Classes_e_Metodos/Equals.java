package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com";
		
		// Resultado false, pois os dois objetos estão em endereços de memória diferentes
		System.out.println(u1 == u2);
				
		// Resultado true, pois o endereço de memória é o mesmo
		//System.out.println(u1 == u1);
		//System.out.println(u2 == u2);
		System.out.println(u1.equals(u1));
		System.out.println(u2.equals(u2));
		
		// Resultado false, pois o método equals() por padrão tem o mesmo comportamento que ==
		// System.out.println(u1.equals(u2));
		
		// Após definir o método equals() dentro da classe Usuario o comportamento do equals() muda
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		/*
		 * Por padrão o tipo Date não gera um objeto que possa ser conversível para o tipo Usuário
		 * então, o código vai dar erro e não vai executar, mas se na classe usuário eu fizer a 
		 * modificação no código do método equals() inserindo uma condicional perguntando se o 
		 * objeto é uma instância da classe Usuário ("if(objeto instanceof Usuario) {") o código 
		 * fará a comparação e verificará que new Date() não é um objeto da classe Usuário e irá 
		 * retornar false e não mais haverá um erro no código.
		 */
		System.out.println(u2.equals(new Date()));
		
	}
}
