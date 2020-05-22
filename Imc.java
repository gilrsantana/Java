class Imc{
	public static void main(String args[]){
		
		double altura;
		double massa;
		double refAltura;
		double imc;
		
		altura = 1.70;
		massa = 81;
		refAltura = 1.70 * 1.70;
		imc = massa / refAltura;
		
		System.out.println("Sua altura é: " +altura);
		System.out.println("Sua massa é: " +massa);
		System.out.println("Seu IMC é: " +imc);
	}
}

