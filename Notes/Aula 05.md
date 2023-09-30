## Interfaces

Uma interface é um "contrato" que garante que toda classe que implementá-la deverá implementar todos os métodos presentes nela.
- Uma classe pode implementar quantas interfaces desejar.
- Todo método declarado numa interface é implicitamente <span style="color:yellow">public abstract</span>.
- Toda variável declarada no escopo de uma interface é implicitamente <span style="color:yellow">public static final</span>.
- As variáveis de uma interface não precisam ser implementadas e serão as mesmas para todas as classes.
```Java
public interface Voador {
	String INFO = "info";
	void levantarVoo();
	void voar();
	void pousar();
}

public class Aviao implements Voador {
	public void levantarVoo() {
		// ...
	}
	public void voar() {
		// ...
	}
	public void pousar() {
		// ...
	}
}
```