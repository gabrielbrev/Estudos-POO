
public class Teste {

	public static void main(String[] args) {
		Urso u = new Urso();
		Leao x = new Leao();
		x.setNome("Simba");
		System.out.println(x.getNome());
		x.rugir();
		teste(u);
		Elefante e = new Elefante();
		x.correr();
		e.correr();
	}
	
	public static void teste(Animal a) {
		a.correr();
		if(a instanceof Leao) {
			Leao b = (Leao) a;
			b.rugir();
		}
	}
	
}
