package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.carro;

public class Honda extends Montadora {

	private static final String HONDA = "Honda";

	public Honda() {
		this.setNome(HONDA);
	}

	@Override
	public Carro getAutomovel() {
		return new Carro("Civic");
	}

	@Override
	public Carro getSUV() {
		return new Carro("CR-V");
	}

	@Override
	public Carro getPicape() {
		return new Carro("Ridgeline");
	}

}
