import java.util.Random;

public class E01 {	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int arr[] = new int[20];
		for(int i = 0; i < 20; i++) {
			arr[i] = rand.nextInt(50) + 1;
		}
		
		printArray(arr);
		
		System.out.println("Invertendo...");
		invertArray(arr);
		
		printArray(arr);
		
	}
	
	public static void invertArray(int arr[]) {
		int size = arr.length;
		int arr2[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr2[i] = arr[size - (i + 1)];
		}
		for(int i = 0; i < size; i++) {
			arr[i] = arr2[i];
		}
	}
	
	public static void printArray(int arr[]) {
		int size = arr.length;
		
		System.out.print("[");
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i]);
			if(i < size - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
