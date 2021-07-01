package br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cliente {
	
	private String nome;
	private int id;
	
	public void AdicionarCarrinho(Carrinho o) {
		//Not necessary the implementation
	}
	
	public Carrinho getCarrinho() {
		return new Carrinho();
	}
}
