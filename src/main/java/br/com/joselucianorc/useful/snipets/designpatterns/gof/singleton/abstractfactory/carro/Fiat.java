package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.carro;

public class Fiat extends Montadora {
	
	public Fiat() {
		this.setNome("Fiat");
	}

	@Override
	public Carro getAutomovel() {
		return new Carro("Fiat Argo");
	}

	@Override
	public Carro getSUV() {
		return new Carro("Fiat Pulse");
	}

	@Override
	public Carro getPicape() {
		return new Carro("Fiat Toro");
	}

}
