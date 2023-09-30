
public class GatoTeste {

	public static void main(String[] args) {
		Gato g1 = new Gato();
		g1.vivo = true;
		g1.cor = "Laranja";
		g1.idade = 5;
		g1.nome = "Garfield";
		
		Gato g2 = new Gato();
		g2.vivo = true;
		g2.cor = "Cinza";
		g2.idade = 4;
		g2.nome = "Tom";
		
		Gato g3 = new Gato();
		g3.vivo = true;
		g3.cor = "Preto e branco";
		g3.idade = 8;
		g3.nome = "Sylvester";
		
		System.out.println("Nome: " + g1.nome + 
				"\nIdade: " + g1.idade + 
				"\nCor: " + g1.cor + 
				"\nVivo: " + g1.vivo + "\n");
		System.out.println("Nome: " + g2.nome + 
				"\nIdade: " + g2.idade + 
				"\nCor: " + g2.cor + 
				"\nVivo: " + g2.vivo + "\n");
		System.out.println("Nome: " + g3.nome + 
				"\nIdade: " + g3.idade + 
				"\nCor: " + g3.cor + 
				"\nVivo: " + g3.vivo + "\n");
		
	}

}
