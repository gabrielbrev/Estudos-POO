## Encapsulamento

Observe o código a baixo:
```Java
public class Conta {
	public double saldo;
	
	public void debitar(double val){
		if(val <= saldo) {
			saldo -= val;
			syso("débito realizado");
		}
		else {
			syso("saldo insuficiente");
		}
	}
	
	public void depositar(double val) {
		saldo += val;
	}
}

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta x = new Conta();
		x.saldo += 15; // Depositando
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		x.saldo -= val; // Sacando
	}
}
```
Note que o acesso a variáveis importantes como saldo têm livre acesso para outras classes, pois são públicas, o que pode ser um problema em diversas situações.
Para contornar isso, as tornamos privadas, fazendo com que somente sua respectiva classe tenha acesso a elas.
```Java
public class Conta {
	private double saldo;
	
	public void debitar(double val){
		if(val <= saldo) {
			saldo -= val;
			syso("débito realizado");
		}
		else {
			syso("saldo insuficiente");
		}
	}
	
	public void depositar(double val) {
		saldo += val;
	}
}

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta x = new Conta();
		x.depositar(15) // Depositando
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		x.sacar(val); // Sacando
	}
}
```
Agora, só é possível mudar o valor de <span style="color: yellow;">saldo</span> por meio dos métodos <span style="color: yellow;">depositar</span> e <span style="color: yellow;">sacar</span>.
Além disso também é necessário criar um método <span style="color: yellow;">get</span> para ser possível obter o valor da variável privada.
Para padronizar, utiliza-se os métodos <span style="color: yellow;">set</span> e <span style="color: yellow;">get</span> como padrão para cada uma delas:
```Java
public class Conta {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double x) {
		this.saldo = x;
	}
	// ...
}
```
Note que no método <span style="color: yellow">getSaldo( )</span> é utilizado <span style="color: yellow;">this</span> para acessar o atributo, isso é considerado uma boa prática e é utilizado para demonstrar que a variável sendo acessada é a de instância e não uma local.

## Construtores

Podemos criar um construtor ou mais construtores para uma classe, fazendo com que os objetos sejam inicializados da forma que o programador deseja.
```Java
public class Aluno {
	private int notaFinal;
	private String nome;
	
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
	// ...
}
```
Cada construtor é diferenciado pela quantidade de parâmetros passados. Também é possível diferencia-los pelo tipo de parâmetro, porém isso tende a dar erros de caso para caso.

## Static

Métodos static são métodos da classe em si, diferente de métodos da instância da classe.
Métodos não estáticos são chamados a partir de um objeto da classe, já estáticos são chamados a partir da classe.
O mesmo vale para variáveis estáticas.
```Java
public class Teste {
	public static int x;
	public int y;
	
	public static void testeClasse() {
		// ...
	}
	public void testeInstancia() {
		// ...
	}
}
```

```Java
public class Main {
	pubic static void main(String[] args) {
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		Teste.testeClasse();
		Teste.testeInstancia(); // Não funciona
		t1.testeInstancia();
		t1.testeClasse(); // Funciona mas não é recomendado
		
		t2.y = 7;
		t1.y = 15;
		// Cada um altera seu próprio atributo, tudo certo
		
		t2.x = 20;
		t1.x = 10;
		// Ambos alteram o mesmo endereço, não recomendado
		
		Teste.x = 16; 
		// É a forma correta de se alterar uma variável estática
	}
}
```

## & e &&
Ambos são operadores AND, porém há uma diferença:
- && checa somente o primeiro valor e, caso ele seja falso, não checa o segundo.
- & checa os dois valores independentemente de seus estados.

Considere o seguinte código:
```Java
public boolean testaCond(bool x) {
	System.out.println(x);
	return x;
}

boolean a = false;
boolean b = false:
```

Condição 1:
```Java
if(testeCond(a) && testaCond(b)) {
	System.out.println("foi, confia");
}
```
Resultado no console:
False

Condição 2:
```Java
if(testeCond(a) & testaCond(b)) {
	System.out.println("foi");
}
```
Resultado no console:
False
False

## Concatenação de strings

```Java
String x = "A casa";
String y = "é bonita";
String z = x + y + "e legal" + 15 + 7;
System.out.println(z);
```
Resultado:
A casa é bonita e legal 157

Note que é possível alterar o resultado usando ordem de precedência e parênteses.
