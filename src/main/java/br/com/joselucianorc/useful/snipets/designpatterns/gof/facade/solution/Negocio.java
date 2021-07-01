package br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.solution;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.BancoDeDados;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.Carrinho;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.Cliente;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.Produto;

public class Negocio {
	private BancoDeDados banco;
	
	public Negocio(BancoDeDados banco) {
		this.banco = banco;
	}
	
	public Cliente registrar(String nome, int id) {
		Cliente cliente = new Cliente(nome, id);
		Carrinho carrinho = new Carrinho();
		cliente.AdicionarCarrinho(carrinho);
		return cliente;
	}
	
	public void comprar(Cliente cliente, int prodID) {
		Produto produto = banco.selecionarProduto(prodID);
		cliente.getCarrinho().adicionar(produto);
	}
	
	public void fecharCompra(Cliente cliente) {
		double valor = cliente.getCarrinho().getTotal();
		banco.processarPagamento(cliente, valor);
	}
}
