
public class TestaCasaJanela {

	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.cor = "prata";
		janela.material = "alumínio";
		
		Casa casa = new Casa();
		casa.cor = "branco";
		casa.numero = 137;
		casa.janela = janela;
		
		System.out.println("Número da casa: " + casa.numero +
				"\nCor da casa: " + casa.cor +
				"\nMaterial da janela: " + casa.janela.material +
				"\nCor da janela: " + casa.janela.cor);

	}

}
