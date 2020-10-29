package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!")); // returns String
		System.out.println(s.startsWith("Boa")); // returns boolean
		System.out.println(s.startsWith("BOA")); // returns boolean
		System.out.println(s.toLowerCase().startsWith("boa")); // convert String and returns boolean
		System.out.println(s.length()); // returns int
		System.out.println(s.endsWith("TARDE")); // returns boolean
		System.out.println(s.endsWith("tarde")); // returns boolean
		System.out.println(s);
		System.out.println(s.equals("Boa Tarde")); // returns boolean
		System.out.println(s.equals("BOATARDE")); // returns boolean
		System.out.println(s.equals("BOA")); // returns boolean
		System.out.println(s.equals("BOA TARDE")); // returns boolean
		System.out.println(s.equalsIgnoreCase("Boa Tarde")); // returns boolean
		System.out.println(s.toLowerCase().equals("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1890.80;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade,
				salario);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome,
				idade, salario);
		System.out.println(frase);
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		// wrong format
		/*String outraFrase = "O senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade,
		 *  salario;
		System.out.println(outraFrase);*/
		
		System.out.println("Uma frase qualquer".contains("qual"));
		System.out.println("Uma frase qualquer".indexOf("qual"));
		System.out.println("Uma frase qualquer".substring(10));
		System.out.println("Uma frase qualquer".substring(10, 14));

		
	}
}
