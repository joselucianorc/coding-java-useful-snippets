package br.com.joselucianorc.useful.snipets.designpatterns.gof.facade;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.BancoDeDados;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem.Cliente;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.solution.Negocio;

public class Usage {
	public static void main(String[] args) {
		Negocio facade = new Negocio(new BancoDeDados());
		
		Cliente cliente = facade.registrar("Jose", 1);
		facade.comprar(cliente, 12);
		facade.comprar(cliente, 12);
		facade.fecharCompra(cliente);
	}
}
