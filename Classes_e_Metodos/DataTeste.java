package classe;

public class DataTeste {
	public static void main(String[] args) {
	
		Data d1 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		
		Data d2 = new Data();
		d2.dia = 28;
		d2.mes = 8;
		d2.ano = 1998;
		
		System.out.println(d2.obterDataFormatada());
		
		Data d3 = new Data(23, 12, 1989);
		
		System.out.println(d3.obterDataFormatada());
		
		Data d4 = new Data(12, 4, 2008);
		d4.dia = 1;
		d4.mes = 4;
		d4.ano = 2022;
		
		System.out.println(d4.obterDataFormatada());
		
	}
		
}
