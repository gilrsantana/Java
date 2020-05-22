
public class Array {

	public static void main(String[] args) {
		// Array (vetor)
		String nome[]; // Declaração do Array 'nome'
		String sobrenome[]; // Declaração do Array 'sobrenome'
		
		nome = new String[5]; // Criação do Array 'nome'
		sobrenome = new String[5]; // Criação do Array 'sobrenome'
		
		// Carregando dados no Array nome
		nome[0] = "Joao";
		nome[1] = "Maria";
		nome[2] = "Marcos";
		nome[3] = "Clara";
		nome[4] = "Rogerio";
		
		// Carregando dados no Array sobrenome
		sobrenome[0] = "Silvia";
		sobrenome[1] = "Fernandes";
		sobrenome[2] = "Pereira";
		sobrenome[3] = "Lins";
		sobrenome[4] = "Gomes";
		
		System.out.println(nome[0]+" "+sobrenome[0]);
		System.out.println(nome[1]+" "+sobrenome[1]);
		System.out.println(nome[2]+" "+sobrenome[2]);
		System.out.println(nome[3]+" "+sobrenome[3]);
		System.out.println(nome[4]+" "+sobrenome[4]);
		System.out.println("-");
		
		// Array de duas dimensões (matriz)
		String Competicoes[][]; //Declarando a matriz 'Competicoes'
		
		Competicoes = new String[4][4]; //Criando a matriz 'Competicoes'
		
		// Carregando os dados na matriz 'Competicoes'		
		Competicoes[0][0]="-MODALIDADE-";
		Competicoes[0][1]="----OURO----";
		Competicoes[0][2]="----PRATA---";
		Competicoes[0][3]="---BRONZE---";
				
		Competicoes[1][0]="-100m rasos-";
		Competicoes[1][1]="--Usain-----";
		Competicoes[1][2]="--Florence--";
		Competicoes[1][3]="--Tyson-----";
		
		Competicoes[2][0]="Salto triplo";
		Competicoes[2][1]="--Inessa----";
		Competicoes[2][2]="--Jonathan--";
		Competicoes[2][3]="--Françoise-";
		
		Competicoes[3][0]="Natacao  50m";
		Competicoes[3][1]="---César----";
		Competicoes[3][2]="---Ranomi---";
		Competicoes[3][3]="---Michael--";
		
		System.out.println("Competição: " +Competicoes[0][0]);
		System.out.println("Ouro: " +Competicoes[0][1]);
		System.out.println("Prata: " +Competicoes[0][2]);
		System.out.println("Bronze: " +Competicoes[0][3]);
		System.out.println("-");
		
		System.out.println("Competição: " +Competicoes[1][0]);
		System.out.println("Ouro: " +Competicoes[1][1]);
		System.out.println("Prata: " +Competicoes[1][2]);
		System.out.println("Bronze: " +Competicoes[1][3]);
		System.out.println("-");
		
		System.out.println("Competição: " +Competicoes[2][0]);
		System.out.println("Ouro: " +Competicoes[2][1]);
		System.out.println("Prata: " +Competicoes[2][2]);
		System.out.println("Bronze: " +Competicoes[2][3]);
		System.out.println("-");

		for(int i=0; i<=3; i++) {
			for(int j=0; j<=3; j++) {
				System.out.print(Competicoes[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
