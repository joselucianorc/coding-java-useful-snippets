package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.carro;

public class Chevrolet extends Montadora {
	
	public Chevrolet() {
		this.setNome("Chevrolet");
	}

	@Override
	public Carro getAutomovel() {
		return new Carro("Agile");
	}

	@Override
	public Carro getSUV() {
		return new Carro("Tracker");
	}

	@Override
	public Carro getPicape() {
		return new Carro("S10");
	}

}
