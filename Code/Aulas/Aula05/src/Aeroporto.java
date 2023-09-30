
public class Aeroporto {
	public static void main(String[] args) {
		Aeroporto galeao = new Aeroporto();
		
		Aviao v = new Aviao();
		galeao.darPermissaoParaPouso(v);
		
		Gaivota x = new Gaivota();
		galeao.darPermissaoParaPouso(x);
	}
	public void darPermissaoParaPouso(Voador v) {
		v.pousar();
	}
}
