## Declarações
### Classes
\[Modificador] class \<nome_da_classe> {}
```Java
public class Gato {
// ...
}
```
### Atributos
\[Modificador] \<tipo> \<nome> \[= valor inicial];
```Java
int idade = 19;
```
### Construtores
Será falado mais sobre posteriormente.
### Métodos
\[modificador] \<tipo_de_retorno> \<nome> (\[parâmetros]) {}
```Java
public int doStuff (int x) {
// ...
}
```

## Variáveis primitivas

Temos 4 tipos numéricos:
- byte -> 8 bits
- short -> 16 bits
- int -> 32 bits
- long -> 64 bits
Quando uma variável recebe outra de um tipo diferente, há uma conversão para o tamanho certo.
```Java
byte a = 10;
int b = a;
// Cada uma das variáveis ocupa seu respectivo tamanho na memória
```
Caso uma variável de um tipo receba uma de tipo maior, há um erro de compilação, por mais que o número desejado caiba na nova variável:
```Java
int a = 127;
byte b = a;
// Erro!
```
Para resolver isso, é possível utilizar casting:
```Java
int a = 127;
byte b = (byte)a;
```
#### Long
O compilador interpreta números escritos como int, sendo assim, é necessário representar números long com L no final, caso contrário, há um erro de compilação.
```Java
long cpf = 18097495032;
// Erro!
long cpf = 18097495032L;
// Compila normalmente
```
####
Também há mais 2 tipos:
- float -> 32 bits
- double -> 64 bits

Em java, não é possível utilizar variáveis numéricas como condição sozinhas.
```Java
... main ... {
	int count = 4;
	
	if (count) {
		// ...
	}
	// Não compila
	
	if (count <= 4) {
		// ...
	}
	// Compila normalmente
}
```

## For loops

```Java
public class ForLoop {
	public static void main (String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 9) {
				break;
			}
			System.out.println("Rodada" + i);
		}
		System.out.println("Fim");
	}
}
```
Nesse trecho de código notam-se duas instruções:
- continue -> Quebra a execução do bloco de código e passa para a próxima iteração
- break -> Quebra e sai da execução do loop

## While loops

```Java
public class WhileLoop {
	public static void main (String[] args) {
		int k = 3
		while (k > 0) {
			int i = k;
			k--;
			System.out.println(i);
		}
		System.out.println(i); // Erro!
	}
}
```
O erro no código acima se da por conta da segunda instrução <span style="color: yellow;">System.out.println( i );</span> se encontrar fora do escopo da variável <span style="color: yellow;">i</span>.

## Pre-incremento e Pos-incremento

Há duas formas de incrementar uma variável:
- c++
- ++c
```Java
int a = 5;
int b = a++;
System.out.println(a); // 6
System.out.println(b); // 5
```
No trecho acima, o resultado é tal pois com <span style="color: yellow;">a++</span>, a variável <span style="color: yellow;">b</span> primeiro recebe o valor de <span style="color: yellow;">a</span> e somente depois <span style="color: yellow;">a</span> é incrementada.
```Java
int a = 5;
int b = ++a;
System.out.println(a); // 6
System.out.println(b); // 6
```
Ja nesse trecho, a variável <span style="color: yellow;">a</span> é incrementada antes de <span style="color: yellow;">b</span> receber seu valor, levando a esse resultado.

## Scanner

Para ler inputs do usuário no console, é necessário utilizar um objeto da classe Scanner.
1. Para começar, é necessário importar seu pacote:
```Java
import java.util.scanner
```
2. Após isso, criar uma variável de referência, passando <span style="color: yellow;">System.in</span> como parâmetro para o construtor:
```Java
Scanner scanner = new Scanner(System.in);
```
3. Existem diversas formas de ler inputs, como ler linhas, inteiros, etc:
```Java
String nome = scanner.nextLine();
int valor = scanner.nextInt();
```
4. Após utilizar o scanner, é de boa prática fechar o objeto:
```Java
sc.close();
```

## Arrays

Para declarar um array:
```Java
int k[] = new int[3];
k[1] = 10;
```
Os arrays numéricos são inicializados com <span style="color: yellow;">0</span> em todas as suas posições.
O resto dos arrays primitivos (boolean e char) são inicializados de formas diferentes:
- boolean -> <span style="color: yellow;">false</span> em todas as posições
- char -> <span style="color: yellow;">u000</span> em todas as posições
Também é possível declarar arrays de objetos:
```Java
Gato gato [] = new Gato[3];
gato[2] = "Tom"; // Erro!
```
Note que os arrays de objetos são inicializados com <span style="color: yellow;">null</span> em todas as suas posições, tendo isso em vista, é necessário atribuir cada posição a um objeto antes de usá-las. Essa é a causa do erro acima. Para contornar isso:
```Java
gato[2] = new Gato();
gato[2] = "Tom"
// Funciona!
```
Também é possível criar arrays da seguinte forma:
```Java
int array1[] = {1, 6 , 5, 4};
Gato[] array2 = {new Gato(), new Gato()}
float array4[], array5;
String[] array6, array7;
```

## Variáveis de instância e locais

```Java
public class Gato {
	int x;
	public void miar() {
		int a;			
		System.out.println(a); 
		// Não compila pois a variável não foi inicializada
	}
}
```
O <span style="color: yellow;">x</span> é uma variável de instância, ou seja, pertence a classe <span style="color: yellow;">Gato</span>, já <span style="color: yellow;">a</span> é uma variável local, pois pertence ao método <span style="color: yellow;">miar</span>.

As variáveis de instância são inicializadas quando um objeto é criado, atribuindo a a elas seu respectivo valor padrão, diferente das variáveis locais, que devem ser inicializadas dentro de seu método pelo programador.