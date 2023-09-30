
public class Q04 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 0; i <= 50000; i++) {
			if(i <= 100 || i >= 137) {				
				total += i;
			}
		}
		System.out.println(total);
	}

}
