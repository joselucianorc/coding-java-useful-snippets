package br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BancoDeDados {
	
	public Produto selecionarProduto(int id) {
		return new Produto();
	}
	
	public void processarPagamento(Cliente cliente, double valor) {
		//Not necessary the implementation
	}
}