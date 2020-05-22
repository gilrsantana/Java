package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(5));
		
		String s = "Boa tarde";
		System.out.println("1"+s.concat("!!!"));
		System.out.println("2"+s + "!!!");
		System.out.println("3"+s.startsWith("boa"));
		System.out.println("4"+s.startsWith("Boa"));
		System.out.println("5"+s.toLowerCase().startsWith("boa"));
		System.out.println("6"+s.toUpperCase().startsWith("boa"));
		System.out.println("7"+s.endsWith("tarde"));
		System.out.println("8"+s.endsWith("TARDE"));
		System.out.println("9"+s.toUpperCase().endsWith("TARDE"));
		System.out.println("10"+s.length());
		System.out.println("11"+s.equals("Boa tarde"));
		System.out.println("12"+s.toUpperCase().equals("Boa tarde"));
		System.out.println("13"+s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Gilmar";
		var sobrenome = "Santana";
		var idade = 41;
		var salario = 11434.6769;
		
		System.out.println("Nome: " + nome + "Sobrenome: " + sobrenome + "Idade: " + idade 
				+ "Salário: " + salario);
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade
				+ "\nSalario: " + salario);
		System.out.printf("\n\nNome: %s\nSobrenome: %s\nIdade: %s\nSalario: R$ %.2f\n\n", nome, 
				sobrenome, idade,salario);
		
		var frase = String.format("Nome: %s\nSobrenome: %s\nIdade: %s\nSalario: R$ %.2f\n\n", nome, 
				sobrenome, idade,salario);
		System.out.println("2"+frase);
	
		var frase2 = String.format("Nome: " + nome + " Sobrenome: " + sobrenome 
				+ " Idade: " + idade + " Salário: " + salario);
		System.out.println("3"+frase2);
		
		System.out.println("Qual seu nome?".contains("seu"));
		System.out.println("Qual seu nome?".contains("SEU"));
		System.out.println("Qual seu nome?".indexOf("seu"));
		System.out.println("Qual seu nome?".indexOf("SEU"));
		System.out.println("Qual seu nome?".indexOf("NOME"));
		System.out.println("Qual seu nome?".substring(5));
		System.out.println("Qual seu nome?".substring(5, 10));
		System.out.println("Qual seu nome?".substring(5, 13));
		System.out.println("Qual seu nome?".substring(5, 14));
	//	System.out.println("Qual seu nome?".substring(5, 15)); ERRO pois string vai até 14
	
	}

}
