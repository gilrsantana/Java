package classe;

public class AreaCirTeste {
	public static void main(String[] args) {
		
		AreaCirc c1 = new AreaCirc(2.3);
		double area_c1 = c1.calculateArea();
		System.out.println(area_c1);
		
		double area_c2 = AreaCirc.calculateArea(2.3);
		System.out.println(area_c2);
		
	}
}
