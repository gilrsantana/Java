package controls;

public class For {
	public static void main(String[] args) {
		
		for(int i = 10; i >= 0; i-=2) {
			System.out.println("i = " + i);
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d , %d] ", i, j);
			}
			System.out.println();
		}
		
		String hash = "#";
		for(int i = 0; i <= 5; i++) {
			System.out.println(hash);
			hash+="#";
		}
		
		hash = "#";
		String controler = "******";
		String count = "+";
		for(; count.length() <= controler.length(); count+="+") {
			System.out.println(hash);
			hash+="#";
		}
	}
}
