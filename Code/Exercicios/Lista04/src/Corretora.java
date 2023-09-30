import java.util.Scanner;

public class Corretora {
	Imovel imoveis[] = new Imovel[5];
	
	public void criarImoveis() {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			imoveis[i] = new Imovel();
			
			System.out.print("Informe o endereço: ");
			imoveis[i].setEndereco(scanner.nextLine());
			
			System.out.print("Informe o preço: ");
			imoveis[i].setPreco(scanner.nextDouble());
			scanner.nextLine();
		}
		
		scanner.close();
	}
	
	public double somaImoveis() {
		double soma = 0;
		
		for(int i = 0; i < 5; i++) {
			soma += imoveis[i].getPreco();
		}
		
		return soma;
	}
}
