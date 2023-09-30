
public class ProgramaPrincipal {
	public static void main(String[] args) {
		System.out.println("Ola");
		
		Gato g1 = new Gato();
		g1.nome = "Garfield";
		g1.idade = 4;
		
		Gato g2 = new Gato();
		g2.nome = "Tom";
		g2.idade = 6;
		
		System.out.println(g1.nome);
		System.out.println(g1.idade);
		
		g1.miar();
		g2.miar();
	}
}
