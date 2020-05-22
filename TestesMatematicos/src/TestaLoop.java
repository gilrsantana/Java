
public class TestaLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distancia = 500;
		double tanqueGasolina = 50;
		double kmPLitro = 8.5;
		double consumoPKm = 1/kmPLitro;
		
		for(int decorrido = 1; decorrido <= distancia; decorrido++) {
			tanqueGasolina-=consumoPKm;
			System.out.println("Quilômetros rodados: " +decorrido);
			if(tanqueGasolina <=0) {
				System.out.println("A gasolina acabou");
				break;
			}
		}
	}

}
