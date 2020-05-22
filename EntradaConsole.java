import java.util.Scanner;

public class EntradaConsole {

  public static void main(String args[]) {

    
    System.out.println("FICHA DE CADASTRO\n\n");

    System.out.print("Primeiro Nome: ");

    Scanner pessoal = new Scanner(System.in);
    String primeiroNome = pessoal.nextLine();

    System.out.print("Último nome: ");
    String ultimoNome = pessoal.nextLine();
    
    System.out.print("Sexo: ");
    String sexo = pessoal.nextLine();
    
    System.out.print("Idade: ");
    int idade = pessoal.nextInt();

    System.out.print("Estado civil: ");
    String estadoCivil = pessoal.nextLine();

    System.out.println(sexo);


    pessoal.close();
  }
} 

