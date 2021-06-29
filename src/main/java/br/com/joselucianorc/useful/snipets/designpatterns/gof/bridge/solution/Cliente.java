package br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution.concrete.LivroReal;

public class Cliente {
	public static void main(String[] args) {
		LivroReal livro = new LivroReal("Computing programming", "GoF", "12345678");
		System.out.println(livro);
	}
}
