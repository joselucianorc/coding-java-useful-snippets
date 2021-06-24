package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.planta;

public class JardimAnual extends Jardim {
	
	private static final String BROMÉLIAS = "Bromélias";
	private static final String BAMBOO = "Bamboo";
	private static final String JATOBÁ = "Jatobá";
	private static final String JARDIM_ANUAL = "Jardim Anual";

	public JardimAnual() {
		this.setNome(JARDIM_ANUAL);
	}

	@Override
	public Planta getCentro() {
		return new Planta(JATOBÁ);
	}

	@Override
	public Planta getBorda() {
		return new Planta(BAMBOO);
	}

	@Override
	public Planta getSombra() {
		return new Planta(BROMÉLIAS);
	}

}
