package classe;

public class AreaCirc {
	
	double raio;
	/*
	 * When a variable is set up as "static" its value will be the same 
	 * in all instances, but a instance can still modifiable it, and this 
	 * change will affect all others instances.
	 * 
	 * When "final" is used its value becomes unmodifiable for any instance.
	 */
	final static double PI = 3.1415;
	
	// Constructor of the class AreaCirc
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	/*
	 * Using this method it's necessary to instance an object for use it.
	 * Ex.: 
	 * AreaCirc c1 = new AreaCirc();
	 * c1.raio = 2.3;
	 * area = c1.area();	
	 */
	double calculateArea() { 
		return PI * Math.pow(raio, 2);
	}
	
	/*
	 * When a method is defined as "static" it can be used without to
	 * create a instance.
	 * Ex.: System.out.println(AreaCirc.area(100))  
	 */
	static double calculateArea(double raio) {
		return PI * raio * raio;
	}
}
