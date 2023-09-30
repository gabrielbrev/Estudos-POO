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
