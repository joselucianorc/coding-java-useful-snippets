package br.com.joselucianorc.useful.snipets.designpatterns.gof.proxy.solution;

public class Crente {
	
	public void perguntar(String pergunta) {
		SerSupremo pastor = new IntermediarioProxy();
		System.out.println(pastor.responder("Pergunta feita"));
	}
	
}
