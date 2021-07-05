package br.com.joselucianorc.useful.snipets.designpatterns.gof.proxy.problem;

public class Crente {
	
	public void perguntar(String pergunta) {
		SerSupremo.responder(pergunta);
	}
}
