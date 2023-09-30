## Herança

Se trata de diminuir duplicação de código. Escrever uma superclasse como <span style="color:yellow">Animal</span>,
que contém características que todo animal tem, como nome, cor, idade e etc. A partir disso, podemos criar subclasses como <span style="color:yellow">Cachorro</span>, <span style="color:yellow">Gato</span> e <span style="color:yellow">Papagaio</span>, cada um contendo métodos específicos como <span style="color:cyan">latir( )</span>, <span style="color:cyan">miar( )</span> e <span style="color:cyan">cantar( )</span>, respectivamente.
Para fazer uma classe herdar outra, utilizamos <span style="color:yellow">extends</span>.
```Java
public class Animal {
	public String nome;
	public int idade;
}
```

```Java
public class Cachorro extends Animal {
	public void latir() {
		System.out.println("Cachorro latindo");
	}
}
```

## Polimorfismo

É a definição para quando temos diversas formas de se referir a um objeto, por exemplo, uma função pode receber um objeto <span style="color:yellow">Animal</span> e ser passado um objeto de classe <span style="color:yellow">Cachorro</span>. A partir disso, por mais que o objeto passado seja da classe <span style="color:yellow">Cachorro</span>, a função o vê como <span style="color:yellow">Animal</span>.
```Java
public static void teste(Animal a) {
	a.correr();
	if(a instanceof Cachorro) {
		Cachorro b = (Cachorro) a;	
		b.latir();
	}
}
```
Note que é possível fazer um casting de <span style="color:yellow">Animal</span> para <span style="color:yellow">Cachorro</span>, porém não é possível fazer isso para classes distintas, que não possuem herança entre si. Também é importante notar que o método <span style="color:cyan">latir( )</span> não funcionaria para objetos de classe <span style="color:yellow">Gato</span>, por isso é necessário checar a classe do objeto usando <span style="color:yellow">instanceof</span>.

###### Observação
```Java
public class Animal {
	public void correr () {
		System.out.println("Animal correndo");
	}
	public static void teste (Animal a) {
		a.correr();
	}
}

public class Gato {
	public void correr () {
		System.out.println("Gato correndo");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal k = new Gato();
		teste(k);
	}
}
```
O resultado no console será: 
Gato correndo
Isso acontece pois o construtor utilizado foi <span style="color:yellow">Gato( )</span>.
## Override

Pode ser necessário alterar métodos inicialmente iguais para todo animal, podemos sobrescreve-los dentro de cada classe específica, utilizando a mesma assinatura (nome, parâmetros, retorno).
```Java
public class Gato extends Animal {
	@Override
	public void correr() {
		System.out.println("Gato correndo");
	}
}
```
Não é necessário, mas utiliza-se <span style="color:yellow">@Override</span> para garantir que estaremos sobrescrevendo um método, dessa forma, se a assinatura estiver diferente da original, o código não compila.

## toString( )

O método <span style="color: cyan">toString( )</span> da super-classe <span style="color:yellow">Object</span> tem como comportamento padrão retornar <span style="color: chartreuse">&lt;nome_da_classe>@&lt;hash_code></span> para qualquer objeto.
Podemos sobrescrever esse método para que possamos imprimir objetos no console da forma que desejamos.
```Java
@Override
public String toString() {
	String info = this.nome + "/" + this.idade;
	return info;
}
```

## Construtores em herança

Todo construtor tem, implicitamente, o método <span style="color:cyan">super( )</span> sendo chamado antes de tudo.
Método serve para construir o objeto da super-classe da classe atual (lembrando que toda classe herda a classe Object, por exemplo).
Ou seja, implicitamente, temos isso:
```Java
public class Aluno {
	public Aluno() {
		super();
		// ...
	}
}
```

Tendo isso em vista, quando temos uma super-classe com um construtor não-default, precisamos modificar também o construtor de suas subclasses, pois a chamada padrão não inclui os parâmetros definidos pelo programador. Logo:
```Java
public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}

public class AlunoBCC extends Aluno {
	int periodo;
	
	public AlunoBCC() {
		// Vazio
	} // Não compila
	
	public AlunoBCC(String nome, int idade) {
		super(nome, idade);
	} // Compila normalmente
}
```

Podemos também escolher chamar um construtor da própria classe usando <span style="color:fuchsia">this( )</span>:
```Java
public class Aluno {
	public Aluno(String nome) {
		this.nome = nome;
	}
	public Aluno(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
}
```

## Sobrecarga de métodos

Podemos criar mais de um método com o mesmo nome porém com diferentes parâmetros
```Java
public class Calcladora {
	 public static double media(double a, double b) {
		 return (a + b) / 2;
	 }
	 public static double media(String a, String b) {
		 double c = Double.parseDouble(a);
		 double d = Double.parseDouble(b);
		 return media(c, d);
	 }
	 public static double media(double a, double b, double c) {
		 return (a + b + c) / 3;
	 }
}
```

## Pacotes

Pacotes servem para organizar projetos grandes, especificando melhor, por exemplo a area de cada classe, como:
```Java
public class Teclado {
	public boolean USB;
	public double preco;
}
public class Teclado {
	public int numeroSons;
	public double preco;
}
```
No exemplo acima, uma classe define teclados musicais e a outra define teclados de computador, porém, não é possível ter duas classes com o mesmo nome no mesmo pacote, além de dificultar o discernimento mesmo se fosse possível. Para resolver esse problema, separamos cada classe em um pacote diferente.

Os pacotes são nomeados de acordo com subdivisões para o projeto, e normalmente de trás para frente. Por exemplo:
- br.com.lojavirtual.musical
- br.com.lojavirtual.informatica

Para usar classes de outros pacotes, devemos importa-las
```Java
import br.com.virtual.musical.Teclado
```
Um pacote provavelmente terá mais de uma classe dentro dele, por isso podemos utilizar * para importar todas elas de uma vez
```Java
import br.com.virtual.informatica.*
```

Existem casos em que desejamos usar duas classes com o mesmo nome de diferentes pacotes, diante dessa situação, podemos importar a primeira normalmente mas devemos utilizar o caminho completo para a segunda dentro do código
```Java
package br.com.lojavirtual.main;

import br.com.lojavirtual.informatica.Teclado;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Teclado t1 = new Teclado();
		t1.setUsb(true);
		t1.setPreco(100);
		
		br.com.lojavirtual.musical.Teclado t2 = new br.com.lojavirtual.musical.Teclado();	
		t2.setNumeroSons(34);
		t2.setPreco(1500);
	}
}
```

## Modificador Padrão

Quando um membro de uma classe é declarado sem modificador, 
é levado em conta o modificador padrão.
```Java
void doStuff() {}
int x;
```
Membros que tem o modificador padrão somente são acessíveis dentro do mesmo pacote.
O modificador default é chamado de "package friendly".

## Protected

Membros declarados com o modificador <span style="color:yellow">protected</span> são acessíveis somente dentro do mesmo pacote, com a excessão de subclasses, que podem acessá-los mesmo estando em outro pacote.
```Java
protected void doStuff() {}
protected int x;
```
## Final

Uma classe pode ser declarada como <span style="color:yellow">final</span> para impedir que sejam criadas subclasses a partir dela, causando um erro de compilação caso haja tentativa.
```Java
public final class Animal {
 // ...
}
```

Uma variável pode ser declarada como <span style="color:yellow">final</span> para torna-lá uma constante.
```Java
final String DIRETORIO_RAIZ = "C:/"
final double PI = 3.14
```
É de boa prática declarar essas variáveis em caixa alta.
Toda vez que uma variável <span style="color:yellow">final</span> for static, é obrigatório definir um valor <span style="color:yellow">static</span>.

## Abstract

- Classes podem ser declaradas como <span style="color:yellow">abstract</span> para impedir que sejam instanciados objetos a partir dela. Uma classe abstrata pode ter métodos ou atributos da forma que quiser.
- Métodos podem ser declarados como <span style="color:yellow">abstract</span> para garantir que sejam implementados dentro de uma subclasse. Só existem dentro de classes abstratas.
```Java
public abstract class Animal {
	public abstract void correr();
	// Métodos abstratos não tem corpo e terminam com ;
}
```

Subclasses que também são abstratas não são a obrigadas a implementar os métodos abstratos da super-classe. Isso somente se aplica à primeira subclasse concreta.

```Java
public abstract Mamifero extends Animal {
	public abstract void mamar();
}
```

Uma subclasse concreta de <span style="color:yellow">Mamifero</span> deve implementar todos os métodos acima dela na hierarquia, não somente <span style="color:yellow">mamar( )</span>.

```Java
public class Gato extends Mamifero {
	public void correr() {
		// ...
	}
	public void mamar() {
		// ...
	}
}
```
