## Introdução
- Programas Java consistem em partes chamadas classes.
- As classes possuem partes chamadas métodos, que realizam tarefas e retornam informações.
- Há diversas coleções de classes existentes nas bibliotecas de classe Java, conhecidas como APIs do Java.
## Portabilidade
A linguagem Java é conhecida por ser facilmente executada em diversos ambientes, por conta da JVM (Java Virtual Machine).

## Estrutura

```Java
public class Dog {
	void bark( ) {
		instruction;
	}// É um método
}// É uma classe
```

É necessária a declaração de um método main dentro de uma classe para iniciar o programa:

```Java
public class MyApp {
	public static void main(String[] args){
		System.out.println("Hello World?");
	}
}
```

É de boa prática começar o nome das classes com letra maiúscula.
O nome do arquivo .java deve ser o mesmo da classe que contém o método main.

## Variáveis
Cada variável deve possuir:
- Tipo
- Nome
É possível declarar também o valor da variável junto dela.
###### exemplo:
```Java
int x;
int y = 0;
```

## Classes
Uma classe é o projeto de um objeto.
Ela informa ao Java como criar um objeto desse tipo específico. Cada objeto criado a partir dessa classe terá seus próprios valores para as variáveis de instância (objeto) da classe.
###### exemplo:
```Java
public class Cão {
	int tamanho;
	int raça;
	int nome;
	
	private static int latir() {
	// ...
	}
}
```

## Tipos primitivos do Java
- int - 16 bits
- byte - 8 bits
- short - 4 bits
- long - 64 bits
- float - 32 bits
- double - 64 bits
- boolean - 1 bits
- char - 8 bits

## Objetos
Objetos são instanciados quando é utilizado o seu construtor:
```Java
Gato g1 = new Gato();
// É um novo objeto
Gato g2 = g1;
// g1 e g2 se referem ao mesmo objeto
```
Pode-se pensar que as variáveis g1 e g2 são como ponteiros para um mesmo objeto, porém, não há utilização de ponteiros explicitamente em Java, fazendo disso uma analogia e não uma definição.

## Tipos de variáveis
### Primitivas
Não são objetos, são de um tipo primitivo:
```Java
int x = 10;
float y = 2.6;
```
### Referência
Se referem a um objeto, pertencem a uma classe:
```Java
String nome;
Gato g1;
```

Não é possível criar uma variável de um tipo usando o construtor de outra classe
```Java
Cachorro c1 = new Gato();
```