package controls;

public class LabeledFor {
	public static void main(String[] args) {
		
		external: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 2) {
					continue external;
				}
				System.out.printf("[%d - %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Continue with labeled for\n");
		
		external: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 2) {
					break external;
				}
				System.out.printf("[%d - %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Break with labeled for\n");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 2) {
					continue;
				}
				System.out.printf("[%d - %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Continue in for\n");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 2) {
					continue;
				}
				System.out.printf("[%d - %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Break in for\n");
	}
}
