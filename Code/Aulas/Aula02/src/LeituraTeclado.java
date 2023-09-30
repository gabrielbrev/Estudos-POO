
import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		System.out.println("Insira uma linha: ");
		
		Scanner sc = new Scanner(System.in);
		String lendoLinha = sc.nextLine();
		System.out.println("A linha entrada foi: " + lendoLinha);
		
		System.out.println("Insira uma idade: ");
		int valor = sc.nextInt();
		System.out.println("A idade é: " + valor);
		
		sc.close();
	}

}

