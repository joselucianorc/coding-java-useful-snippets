package br.com.joselucianorc.useful.snipets.designpatterns.gof.abstractfactory.planta;

public class ClientePaisagismo {
	private static final String NA_SOMBRA = "Na sombra:";
	private static final String NAS_BORDAS = "Nas bordas:";
	private static final String NO_CENTRO = "No centro:";

	public static void main(String[] args) {
		byte tipo = Byte.parseByte(args[0]);
		Jardim jardim;
		switch(tipo) {
			case 1: jardim = new JardimAnual(); break;
			case 2: jardim = new JardimPerene(); break;
			default: jardim = new JardimVegetal();
		}
		System.out.println(jardim.getNome());
		System.out.println(NO_CENTRO + jardim.getCentro().getName());
		System.out.println(NAS_BORDAS + jardim.getBorda().getName());
		System.out.println(NA_SOMBRA + jardim.getSombra().getName());
	}
}
