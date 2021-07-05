package br.com.joselucianorc.useful.snipets.designpatterns.gof.proxy.solution;

import lombok.Data;

@Data
public class IntermediarioProxy implements SerSupremo {
	
	private SerSupremoReal real;
	
	public void cobrarTaxa() {
		System.out.println("Cobrar taxa");
	}
	
	@Override
	public String responder(String pergunta) {
		this.cobrarTaxa();
		return real.responder(pergunta);
	}

}
