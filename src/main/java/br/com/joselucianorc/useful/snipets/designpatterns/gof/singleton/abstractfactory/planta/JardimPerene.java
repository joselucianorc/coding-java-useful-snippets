package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.planta;

public class JardimPerene extends Jardim {

	private static final String ROSEIRA = "Roseira";
	private static final String PINHEIRO = "Pinheiro";
	private static final String IPÊ = "Ipê";
	private static final String JARDIM_PERENE = "Jardim Perene";

	public JardimPerene() {
		this.setNome(JARDIM_PERENE);
	}
	
	@Override
	public Planta getCentro() {
		return new Planta(IPÊ);
	}

	@Override
	public Planta getBorda() {
		return new Planta(PINHEIRO);
	}

	@Override
	public Planta getSombra() {
		return new Planta(ROSEIRA);
	}

}
