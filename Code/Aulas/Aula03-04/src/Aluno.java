
public class Aluno {
	
	private String nome;
	private int notaFinal;
	
	public Aluno() {
		System.out.println("Criando objeto aluno");
	}
	
	public Aluno(int nota) {
		this.notaFinal = nota;
	}
	
	public Aluno(int nota, String nome) {
		this.notaFinal = nota;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNotaFinal() {
		return notaFinal;
	}
	
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

}
