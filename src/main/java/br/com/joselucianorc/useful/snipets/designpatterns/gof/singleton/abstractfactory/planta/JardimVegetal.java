package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.planta;

public class JardimVegetal extends Jardim {
	
	private static final String BRÓCOLIS = "Brócolis";
	private static final String ERVILHA = "Ervilha";
	private static final String MILHO = "Milho";
	private static final String JARDIM_DE_VEGETAIS = "Jardim de Vegetais";

	public JardimVegetal() {
		this.setNome(JARDIM_DE_VEGETAIS);
	}

	@Override
	public Planta getCentro() {
		return new Planta(MILHO);
	}

	@Override
	public Planta getBorda() {
		return new Planta(ERVILHA);
	}

	@Override
	public Planta getSombra() {
		return new Planta(BRÓCOLIS);
	}

}
