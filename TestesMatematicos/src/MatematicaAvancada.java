
public class MatematicaAvancada {

	private double resultado;

	public void soma(double valor1, double valor2) {
		setResultado(valor1+valor2);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public boolean par(double valorDec) {
		boolean retorno = false;
		int valorInt = (int)valorDec;
		
		if(valorDec/2 == valorInt/2) {
			retorno = true;
		}
		return retorno;
	}
	public double descontoSeguro(int classeBonus) {
		double retorno = 0;
		switch(classeBonus) {
		case 1:
			retorno = 0.05;
			break;
		case 2:
			retorno = 0.06;
			break;
		case 3:
			retorno = 0.065;
			break;
		case 4:
			retorno = 0.07;
			break;
		case 5:
			retorno = 0.08;
			break;
		case 6:
			retorno = 0.085;
			break;
		case 7:
			retorno = 0.087;
			break;
		case 8:
			retorno = 0.09;
			break;
		case 9:
			retorno = 0.096;
			break;
		case 10:
			retorno = 0.1;
			break;
		}
		return retorno;
	}
}
