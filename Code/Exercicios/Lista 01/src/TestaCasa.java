
public class TestaCasa {
	public static void main(String[] args) {
		Casa c1 = new Casa();
		c1.cor = "branco";
		c1.numero = 137;
		
		Casa c2 = new Casa();
		c2.cor = "azul";
		c2.numero = 155;
		
		System.out.println("A casa de número " + c1.numero + " tem cor " + c1.cor);
		System.out.println("A casa de número " + c2.numero + " tem cor " + c2.cor);
		
	}
}

