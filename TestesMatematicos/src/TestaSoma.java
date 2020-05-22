
public class TestaSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatematicaAvancada ma=new MatematicaAvancada();
		ma.soma(948, 110);
		System.out.println("Resultado: " +ma.getResultado());
		
		double rsto = ma.getResultado();
		if(ma.par(rsto)) {
			System.out.println("Este número é par");
		}else {
			System.out.println("Este número é impar");
		}
		
		double valorSeguro = ma.getResultado();
		System.out.println("Valor do seguro......: " +valorSeguro);
		
		if(ma.par(valorSeguro)) {
			System.out.println("Este valor é par");
		}else {
			System.out.println("Este valor é ímpar");
		}
		
		double fatorDesconto = ma.descontoSeguro(5);
		double seguroDesconto = valorSeguro * fatorDesconto;
		double seguroFinal = valorSeguro - seguroDesconto;
		System.out.println("Fator de desconto....: " +fatorDesconto);
		System.out.println("Valor de desconto....: " +seguroDesconto);
		System.out.println("Seguro com desconto..: " +seguroFinal);
	}
}
