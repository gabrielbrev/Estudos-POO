
public abstract class Lutador {

	private String nome;
	private int idade;
	private double peso;
	
	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String toString( ) {
		return nome + "/" + idade + "/" + peso;
	}
	
	public void possiveisLutas(Lutador[] lutadores) {
		System.out.println("Possíveis lutas para " + nome + ":");
		
		for(int i = 0; i < lutadores.length; i++) {
			if(this.getClass() == lutadores[i].getClass()) {
				System.out.println("\t" + lutadores[i]);
			}
		}
	}
	
	public String categoriaLutador() {
		if(this.getClass().equals(PesoPena.class)) {
			return "PesoPena";
		}
		else if(this.getClass().equals(PesoMedio.class)) {
			return "PesoMedio";
		}
		else if(this.getClass().equals(MeioPesado.class)) {
			return "MeioPesado";
		}
		else {
			return "PesoPesado";
		}
	}
	
	public Lutador sorteiaLuta(Lutador[] lutadores) {
		Lutador[] aptos = new Lutador[lutadores.length];
		int c = 0;
		for(int i = 0; i < lutadores.length; i++) {
			if(this.getClass() == lutadores[i].getClass()) {
				aptos[c] = lutadores[i];
				c++;
			}
		}
		return aptos[(int)(Math.random() % c)];
	}
	
}
