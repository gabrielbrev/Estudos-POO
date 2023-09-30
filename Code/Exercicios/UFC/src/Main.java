import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Lutador[] lutadores = new Lutador[4];
		
		for(int i = 0; i < 4; i++) {
			System.out.print("Informe o nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Informe a idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Informe o peso: ");
			double peso = scanner.nextDouble();
			scanner.nextLine();
			
			if(peso <= 65) {
				lutadores[i] = new PesoPena(nome, idade, peso);
			}
			else if(peso <= 83.9) {
				lutadores[i] = new PesoMedio(nome, idade, peso);
			}
			else if(peso <= 93) {
				lutadores[i] = new MeioPesado(nome, idade, peso);
			}
			else if(peso <= 120.2) {
				lutadores[i] = new PesoPesado(nome, idade, peso);
			}
			else {
				System.out.println("O candidato deveria considerar lutar sumô");
				i--;
			}
			
		}
		
		System.out.print("Escolha um lutador de 0 a 9: ");
		int escolha = scanner.nextInt();
		System.out.println(lutadores[escolha]);
		lutadores[escolha].possiveisLutas(lutadores);
		System.out.println("O lutador escolhido foi " + lutadores[escolha].sorteiaLuta(lutadores));
		
		scanner.close();
	}

}
