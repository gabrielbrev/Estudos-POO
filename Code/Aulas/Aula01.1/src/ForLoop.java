
public class ForLoop {
	public static void main (String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 9) {
				break;
			}
			System.out.println("Rodada " + i);
		}
		System.out.println("Fim");
	}
}
