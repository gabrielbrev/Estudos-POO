
public class Q03 {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 0; i <= 10000; i++) {
			if(i % 2 != 0) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
