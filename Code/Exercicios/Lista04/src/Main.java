
public class Main {
	public static void main(String[] args) {
		Corretora corretora = new Corretora();
		corretora.criarImoveis();
		System.out.println("O valor total dos imóveis é " + corretora.somaImoveis());
	}
}
